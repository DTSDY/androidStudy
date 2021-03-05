package com.ssssyy.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val fruitList = ArrayList<Fruit>();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 初始化数据
        initFruit()
        // 导入组件配件
//        val linearLayoutManager = LinearLayoutManager(this)
        // 横线排列
//        linearLayoutManager.orientation = LinearLayoutManager.HORIZONTAL

        //瀑布式
        val layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        recycler.layoutManager = layoutManager
        // 适配器适配数据
        val adapter = FruitAdapter(fruitList)
        recycler.adapter = adapter

    }

    private fun initFruit(){
        repeat(1000){
            fruitList.add(Fruit("999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",R.drawable.img_1))
            fruitList.add(Fruit("baaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",R.drawable.img_2))
            fruitList.add(Fruit("cssssssssssssssssssssssssssss",R.drawable.img_3))
            fruitList.add(Fruit("dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd",R.drawable.img_4))
        }
    }
}
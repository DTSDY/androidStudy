package com.ssssyy.uititle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    private val data = listOf<String>("aa12a","a32aa","aa123a","123aaa","aa12a","a3123aa","a123aa","a123aa","a1231aa","aaa23","a123aa","123aaa","a123aa","a12312aa","321aaa","aa3212a","aaa2131","a31aa","aa31a","aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa")

    private val fruitList = ArrayList<Fruit>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
//        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,data)
//        listView.adapter = adapter

        initFruit()
        val adapter = FruitAdapter(this,R.layout.fruit_item,fruitList)
        listView.adapter = adapter
    }

    private fun initFruit(){
        repeat(1000){
            fruitList.add(Fruit("a",R.drawable.img_1))
            fruitList.add(Fruit("b",R.drawable.img_2))
            fruitList.add(Fruit("c",R.drawable.img_3))
            fruitList.add(Fruit("d",R.drawable.img_4))
        }
    }

}

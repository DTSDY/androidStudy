package com.ssssyy.firstapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.first_layout.*
import java.net.URI

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_layout)
        button1.setOnClickListener {
//            val data = "这是一个需要传递给第二个页面的信息"
            val intent = Intent(this,SecondActivity::class.java)
//            val intent = Intent(Intent.ACTION_VIEW)
//            val intent = Intent(Intent.ACTION_DIAL)
//            intent.addCategory("com.example.activitytest.MY_CATEGORY")
//            intent.data= Uri.parse("https://www.baidu.com")
//            intent.data = Uri.parse("tel:10086")
//            intent.putExtra("extra_data",data)

//            startActivity(intent)
            startActivityForResult(intent,1)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.add_item -> Toast.makeText(this,"你点击了Add按钮",Toast.LENGTH_SHORT).show()
            R.id.remove_item -> Toast.makeText(this,"你点击了remove按钮",Toast.LENGTH_SHORT).show()
        }
        return true
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when(requestCode){
            1->if (resultCode== RESULT_OK){
                val data = data?.getStringExtra("data_return")
                textView2.setText("第二个页面销毁时所传输的值 $data")
            }
        }
    }
}
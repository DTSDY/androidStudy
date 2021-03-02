package com.ssssyy.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.second_activity.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
//        val extraData = intent.getStringExtra("extra_data")
//        textView.setText("接受短信： $extraData")
        button2.setOnClickListener {
            val intent = Intent()
            intent.putExtra("data_return","这是返回给第一个页面的值")
            setResult(RESULT_OK,intent)
            finish()
        }
    }

    override fun onBackPressed() {
        val intent = Intent()
        intent.putExtra("data_return","这是从返回键返回的数据")
        setResult(RESULT_OK,intent)
        finish()
    }
}
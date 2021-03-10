package com.ssssyy.qicq

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val login = findViewById<Button>(R.id.login)
        login.setOnClickListener{
            val user = findViewById<TextView>(R.id.user).text.toString()
            val pwd = findViewById<TextView>(R.id.pwd).text.toString()
            if (user == "admin" && pwd == "123456"){
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
                finish()
            }else{
                Toast.makeText(this,"密码错误",Toast.LENGTH_SHORT).show()
            }
        }
    }
}
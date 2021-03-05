package com.ssssyy.view

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.button ->{
                AlertDialog.Builder(this).apply {
                    setTitle("标题是")
                    setMessage("这是什么是 是 是是  是 ")
                    setCancelable(false)
                    setPositiveButton("Ok"){ dialog, which ->

                    }
                    setNegativeButton("Cancel"){ dialog, which -> }
                    show()
                }
            }
    }
}
}
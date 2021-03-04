package com.ssssyy.uitest

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import com.ssssyy.uitest.databinding.ActivityMainBinding
import com.ssssyy.uitest.databinding.TitleBinding
import java.util.jar.Attributes

class TitleLayout(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {
    init {
        LayoutInflater.from(context).inflate(R.layout.title, this)
        findViewById<Button>("titleBack")
    }
}
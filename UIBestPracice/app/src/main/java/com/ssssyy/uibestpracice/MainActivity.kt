package com.ssssyy.uibestpracice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val msgList = ArrayList<Msg>()

    private var adapter: MsgAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initMsg()
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        adapter = MsgAdapter(msgList)
        recyclerView.adapter = adapter
        send.setOnClickListener {
            when(it){
                send ->{
                    val content = inputText.text.toString()
                    if (content.isNotEmpty()){
                        val msg = Msg(content,Msg.TYPE_SENT)
                        msgList.add(msg)
                        // 有新消息时,刷新RecyclerView
                        adapter?.notifyItemInserted(msgList.size-1)
                        // recyclerView定位到最后一行
                        recyclerView.scrollToPosition(msgList.size-1)
                        inputText.setText("")
                    }
                }
            }
        }
    }

     fun onClick(v: View?){

    }

    fun initMsg() {
        val msg1 = Msg("你好",Msg.TYPE_RECEIVED)
        msgList.add(msg1)


        val msg2 = Msg("你好2",Msg.TYPE_SENT)
        msgList.add(msg1)


        val msg3 = Msg("你好3",Msg.TYPE_RECEIVED)
        msgList.add(msg1)
    }



}


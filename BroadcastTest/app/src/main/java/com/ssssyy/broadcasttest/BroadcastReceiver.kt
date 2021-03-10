package com.ssssyy.broadcasttest

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class BroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
//        TODO("BroadcastReceiver.onReceive() is not implemented")
        Toast.makeText(context,"这是一条开始广播",Toast.LENGTH_SHORT).show()
    }
}
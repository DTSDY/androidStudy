package com.ssssyy.a02sendmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText phoneNum = null;
    EditText content = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phoneNum = findViewById(R.id.phone);
        content = findViewById(R.id.contentText);
        Button btn = findViewById(R.id.send);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = phoneNum.getText().toString();
                String con = content.getText().toString();
                SmsManager sms = SmsManager.getDefault();
                ArrayList<String> strList = sms.divideMessage(con);
                for (String s : strList) {
                    sms.sendTextMessage(num,null,s,null,null);
                }
                Toast.makeText(MainActivity.this,"发送成功！"+num +" "+ con,Toast.LENGTH_LONG).show();
            }
        });
    }
}
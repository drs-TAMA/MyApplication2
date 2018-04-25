package com.example.yyamasawa.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent intent = this.getIntent();
        String text = intent.getStringExtra("sendText");
        TextView textView = (TextView)this.findViewById(R.id.textViewSub);
        textView.setText(text);
    }
}
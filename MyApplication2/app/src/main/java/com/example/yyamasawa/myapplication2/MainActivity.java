package com.example.yyamasawa.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = findViewById(R.id.editText);

        Button sendButton = findViewById(R.id.sendButton);
        sendButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //インテントの作成
                Intent intent = new Intent(getApplication(), SubActivity.class);

                //データをセット
                intent.putExtra("sendText", editText.getText().toString());

                //遷移先の画面を起動
                startActivity(intent);
            }
        });
    }
}

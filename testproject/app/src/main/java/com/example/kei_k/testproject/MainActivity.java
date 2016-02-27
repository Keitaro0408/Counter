package com.example.kei_k.testproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int counter = 0;
    private TextView textView;
    String num = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ボタンを設定
        final Button button_plus = (Button)findViewById(R.id.buttonA);
        final Button button_minus = (Button)findViewById(R.id.buttonB);
        final Button button_reset = (Button)findViewById(R.id.buttonC);

        // TextView の設定
        textView = (TextView) findViewById(R.id.textViewA);

        // リスナーをボタンに登録
        button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                counter++;
                num = String.valueOf(counter);
                textView.setText(num);
            }
        });

        //カウンターをマイナスする
        button_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                counter--;
                num = String.valueOf(counter);
                textView.setText(num);
            }
        });
        //カウンターをリセットする
        button_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                counter = 0;
                num = String.valueOf(counter);
                textView.setText(num);
            }
        });

    }
}
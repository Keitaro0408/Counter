package com.example.kei_k.testproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by kei-k on 2016/02/27.
 */
public class SubScene  extends AppCompatActivity
{
    //表示用の変数
    String dispnum = "";
    private TextView textView;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        final Button button_back = (Button)findViewById(R.id.button_back);
        // TextView の設定
        textView = (TextView) findViewById(R.id.textViewA);

        button_back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent();
                intent.setClassName("com.example.kei_k.testproject", "com.example.kei_k.testproject.MainActivity");
                startActivity(intent);
            }

        });
    }

    //違うボタン処理も使ってみたかった。
    // ボタンがタッチされた時の処理
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.button0:
                dispnum = dispnum + "0";
                textView.setText(dispnum);
                break;
            case R.id.button1:
                dispnum = dispnum + "1";
                textView.setText(dispnum);
                break;
            case R.id.button2:
                dispnum = dispnum + "2";
                textView.setText(dispnum);
                break;
            case R.id.button3:
                dispnum = dispnum + "3";
                textView.setText(dispnum);
                break;
            case R.id.button4:
                dispnum = dispnum + "4";
                textView.setText(dispnum);
                break;
            case R.id.button5:
                dispnum = dispnum + "5";
                textView.setText(dispnum);
                break;
            case R.id.button6:
                dispnum = dispnum + "6";
                textView.setText(dispnum);
                break;
            case R.id.button7:
                dispnum = dispnum + "7";
                textView.setText(dispnum);
                break;
            case R.id.button8:
                dispnum = dispnum + "8";
                textView.setText(dispnum);
                break;
            case R.id.button9:
                dispnum = dispnum + "9";
                textView.setText(dispnum);
                break;
            case R.id.button_plus:
                dispnum = dispnum + "+";
                textView.setText(dispnum);
                break;
            case R.id.button_minus:
                dispnum = dispnum + "-";
                textView.setText(dispnum);
                break;
            case R.id.button_multiply:
                dispnum = dispnum + "×";
                textView.setText(dispnum);
                break;
            case R.id.button_division:
                dispnum = dispnum + "÷";
                textView.setText(dispnum);
                break;
            case R.id.button_equal:
                dispnum = dispnum + "=";
                textView.setText(dispnum);
                break;
        }
    }
}

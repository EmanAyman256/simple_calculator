package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText Et_num1,Et_num2;
TextView tv_result;
Button btn_Sum,btn_Sub,btn_multi,btn_div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Et_num1=findViewById(R.id.ET_num1);
        Et_num2=findViewById(R.id.ET_num2);
        tv_result=findViewById(R.id.tv_result);
        btn_Sum=findViewById(R.id.btn_Sum);
        btn_Sub=findViewById(R.id.btn_Sub);
        btn_multi=findViewById(R.id.btn_multi);
        btn_div=findViewById(R.id.btn_div);

        btn_Sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1=Et_num1.getText().toString();
                String num2=Et_num2.getText().toString();
                int number1=Integer.parseInt(num1);
                int number2=Integer.parseInt(num2);
                int Result=number1+number2;
                tv_result.append(String.valueOf(Result));


            }
        });
        btn_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1=Et_num1.getText().toString();
                String num2=Et_num2.getText().toString();
                int number1=Integer.parseInt(num1);
                int number2=Integer.parseInt(num2);
                int Result=number1-number2;
                tv_result.append(String.valueOf(Result));


            }
        });
        btn_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1=Et_num1.getText().toString();
                String num2=Et_num2.getText().toString();
                int number1=Integer.parseInt(num1);
                int number2=Integer.parseInt(num2);
                int Result=number1*number2;
                tv_result.append(String.valueOf(Result));


            }
        });
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1=Et_num1.getText().toString();
                String num2=Et_num2.getText().toString();
                int number1=Integer.parseInt(num1);
                int number2=Integer.parseInt(num2);
                int Result=number1/number2;
                tv_result.append(String.valueOf(Result));


            }
        });



    }
}
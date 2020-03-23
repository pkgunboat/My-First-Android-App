package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       // System.out.println("hello, world");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn1 = findViewById(R.id.button1);
        final TextView tv1 = findViewById(R.id.tv1);
        final CheckBox ch1 = findViewById(R.id.choice1);
        final Switch sw1 = findViewById(R.id.sw1);

        btn1.setOnClickListener(new View.OnClickListener() {
           // @Override
            private int num = 0;
            public void onClick(View v){
                num++;
                tv1.setText("You click Button " + num + "times");
            }
        });

        ch1.setOnClickListener(new View.OnClickListener() {
             @Override
            public void onClick(View v){
                if (!ch1.isChecked()) {
                    tv1.setText("You pressed a Checkbox twice");
                } else {
                    tv1.setText("You pressed a Checkbox");
                }
            }
        });

        sw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if (!sw1.isChecked()) {
                    tv1.setText("You pressed a Switch twice");
                } else {
                    tv1.setText("You pressed a Switch");
                }
            }
        });
    }
}


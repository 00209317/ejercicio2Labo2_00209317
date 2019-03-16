package com.example.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {

    private TextView view1,view2,view3,view4,view5,view6,view7,view8,view9;
    private int random;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view1 = findViewById(R.id.uno);
        view2 = findViewById(R.id.dos);
        view3 = findViewById(R.id.tres);
        view4 = findViewById(R.id.cuatro);
        view5 = findViewById(R.id.cinco);
        view6 = findViewById(R.id.seis);
        view7 = findViewById(R.id.siete);
        view8 = findViewById(R.id.ocho);
        view9 = findViewById(R.id.nueve);

        view1.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                view1.setBackgroundColor(Color.rgb((int) (Math.random() * 255),(int) (Math.random() * 255),(int) (Math.random() * 255)));
                return false;
            }
        });
        view2.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                view2.setBackgroundColor(Color.rgb((int) (Math.random() * 255),(int) (Math.random() * 255),(int) (Math.random() * 255)));
                return false;
            }
        });
        view3.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                view3.setBackgroundColor(Color.rgb((int) (Math.random() * 255),(int) (Math.random() * 255),(int) (Math.random() * 255)));
                return false;
            }
        });
        view4.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                view4.setBackgroundColor(Color.rgb((int) (Math.random() * 255),(int) (Math.random() * 255),(int) (Math.random() * 255)));
                return false;
            }
        });
        view5.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                view5.setBackgroundColor(Color.rgb((int) (Math.random() * 255),(int) (Math.random() * 255),(int) (Math.random() * 255)));
                return false;
            }
        });
        view6.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                view6.setBackgroundColor(Color.rgb((int) (Math.random() * 255),(int) (Math.random() * 255),(int) (Math.random() * 255)));
                return false;
            }
        });
        view7.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                view7.setBackgroundColor(Color.rgb((int) (Math.random() * 255),(int) (Math.random() * 255),(int) (Math.random() * 255)));
                return false;
            }
        });
        view8.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                view8.setBackgroundColor(Color.rgb((int) (Math.random() * 255),(int) (Math.random() * 255),(int) (Math.random() * 255)));
                return false;
            }
        });
        view9.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                view9.setBackgroundColor(Color.rgb((int) (Math.random() * 255),(int) (Math.random() * 255),(int) (Math.random() * 255)));
                return false;
            }
        });




    }


}
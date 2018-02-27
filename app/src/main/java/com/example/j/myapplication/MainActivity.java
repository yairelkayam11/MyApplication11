package com.example.j.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView iv1;

    Button btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        iv1 = (ImageView) findViewById(R.id.iv1);
    }

    public void yair1(View view) {
        Random rnd = new Random();
        int F = rnd.nextInt(3) + 1;


            btn1.setText(""+F);

            if (F == 1) {
                iv1.setImageResource(R.drawable.toya);
            } else if (F == 2) {
                iv1.setImageResource(R.drawable.toyb);
            } else if (F == 3) {
                iv1.setImageResource(R.drawable.toyc);
            }
        }
    }



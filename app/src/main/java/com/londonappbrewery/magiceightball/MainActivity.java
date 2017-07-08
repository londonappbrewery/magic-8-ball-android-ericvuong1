package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button
        Button button_Ask = (Button) findViewById(R.id.askButton);

        final ImageView magicBall = (ImageView) findViewById(R.id.ball);

        //magic ball list
        final int[] ballList = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        button_Ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //generate new number
                Random rnG = new Random();
                int number = rnG.nextInt(6);

                magicBall.setImageResource(ballList[number]);

            }
        });

    }
}

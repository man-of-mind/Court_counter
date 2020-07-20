package com.example.just_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayFreeThrow(View view){
        TextView t = findViewById(R.id.team_a_score);
        t.setText(String.valueOf(mScore));
    }

    public void displayThreePoints(View view){
        mScore += 3;
        TextView t = findViewById(R.id.team_a_score);
        t.setText(String.valueOf(mScore));
    }


    public void displayTwoPoints(View view){
        TextView t = findViewById(R.id.team_a_score);
        mScore += 2;
        t.setText(String.valueOf(mScore));
    }
    public void reset(View view){
        TextView reset = (TextView) findViewById(R.id.team_a_score);
        mScore = 0;
        reset.setText(String.valueOf(mScore));
    }

}
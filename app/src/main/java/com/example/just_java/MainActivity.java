package com.example.just_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mScore = 0;
    private int mScoreB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayFreeThrowB(View view){
        mScoreB += 1;
        TextView t = findViewById(R.id.team_b_score);
        t.setText(String.valueOf(mScoreB));
    }

    public void displayThreeBPoints(View view){
        mScoreB += 3;
        TextView t = findViewById(R.id.team_b_score);
        t.setText(String.valueOf(mScoreB));
    }


    public void displayTwoBPoints(View view){
        TextView t = findViewById(R.id.team_b_score);
        mScoreB += 2;
        t.setText(String.valueOf(mScoreB));
    }

    public void displayFreeThrow(View view){
        mScore += 1;
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
        TextView t = (TextView) findViewById(R.id.team_b_score);
        mScore = 0;
        mScoreB = 0;
        reset.setText(String.valueOf(mScore));
        t.setText(String.valueOf(mScoreB));
    }

}
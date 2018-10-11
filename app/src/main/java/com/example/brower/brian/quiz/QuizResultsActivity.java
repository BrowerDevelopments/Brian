package com.example.brower.brian.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.brower.brian.R;

public class QuizResultsActivity extends AppCompatActivity {

    public int score = QuizActivity.getmScore();
    private TextView mScoreView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_results);

        mScoreView = (TextView)findViewById(R.id.score);
        updateScore();
    }

    private void updateScore() {
        mScoreView.setText("" + score);
    }
}

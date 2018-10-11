package com.example.brower.brian.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.brower.brian.HomeActivity;
import com.example.brower.brian.R;

public class QuizResultsActivity extends AppCompatActivity {

    private ImageButton home_button;
    public int score = QuizActivity.getmScore();
    private TextView mScoreView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_results);

        home_button = (ImageButton)findViewById(R.id.home_button);
        home_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });

        mScoreView = (TextView)findViewById(R.id.score);
        updateScore();
    }

    public void openHomeActivity() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    private void updateScore() {
        mScoreView.setText("" + score);
    }
}

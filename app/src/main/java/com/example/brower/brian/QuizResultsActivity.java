package com.example.brower.brian;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class QuizResultsActivity extends AppCompatActivity {

    private ImageButton explore_button;
    private ImageButton quiz_button;
    private ImageButton settings_button;
    private ImageButton sources_button;

    public int score = QuizActivity.getmScore();
    private TextView mScoreView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_results);

        explore_button = (ImageButton)findViewById(R.id.explore_button);
        explore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetScore();
                openExploreActivity();
            }
        });

        settings_button = (ImageButton)findViewById(R.id.settings_button);
        settings_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetScore();
                openSettingsActivity();
            }
        });

        quiz_button = (ImageButton)findViewById(R.id.quiz_button);
        quiz_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetScore();
                openQuizActivity();
            }
        });

        sources_button = (ImageButton)findViewById(R.id.sources_button);
        sources_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetScore();
                openSourcesActivity();
            }
        });

        mScoreView = (TextView)findViewById(R.id.score);
        updateScore();
    }

    public void openExploreActivity() {
        Intent intent = new Intent(this, ExploreActivity.class);
        startActivity(intent);
    }

    public void openSettingsActivity() {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

    public void openQuizActivity() {
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
    }

    public void openSourcesActivity() {
        Intent intent = new Intent(this, SourcesActivity.class);
        startActivity(intent);
    }

    private void updateScore() {
        mScoreView.setText("" + score);
    }

    public void resetScore() {
        QuizActivity.resetmScore();
    }
}

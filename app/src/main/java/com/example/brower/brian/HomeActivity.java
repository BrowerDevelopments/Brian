package com.example.brower.brian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.brower.brian.quiz.QuizActivity;

public class HomeActivity extends AppCompatActivity {

    private Button explore_button;
    private Button quiz_button;
    private Button source_button;
    private ImageButton home_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        home_button = (ImageButton)findViewById(R.id.home_button);
        home_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });

        explore_button = (Button)findViewById(R.id.explore_button);
        explore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExploreActivity();
            }
        });

        quiz_button = (Button)findViewById(R.id.quiz_button);
        quiz_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuizActivity();
            }
        });

        source_button = (Button)findViewById(R.id.source_button);
        source_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSourceActivity();
            }
        });
    }

    public void openHomeActivity() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void openExploreActivity() {
        Intent intent = new Intent(this, ExploreActivity.class);
        startActivity(intent);
    }

    public void openQuizActivity() {
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
    }

    public void openSourceActivity() {
        Intent intent = new Intent(this, SourcesActivity.class);
        startActivity(intent);
    }
}

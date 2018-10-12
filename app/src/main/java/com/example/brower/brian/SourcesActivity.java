package com.example.brower.brian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SourcesActivity extends AppCompatActivity {

//    ArrayList<SourceClass> source;
//    ListView source_list;
//    private static SourceCustomList source_custom_list;

    String[] sources = {"Source 1", "Source 2", "Source 3", "Source 4"};
    private ImageButton quiz_button;
    private ImageButton explore_button;
    private ImageButton sources_button;
    private ImageButton settings_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sources);

        explore_button = (ImageButton)findViewById(R.id.explore_button);
        explore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExploreActivity();
            }
        });

        settings_button = (ImageButton)findViewById(R.id.settings_button);
        settings_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSettingsActivity();
            }
        });

        quiz_button = (ImageButton)findViewById(R.id.quiz_button);
        quiz_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuizActivity();
            }
        });

        sources_button = (ImageButton)findViewById(R.id.sources_button);
        sources_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSourcesActivity();
            }
        });
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
}

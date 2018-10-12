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

    private ImageButton explore_button;
    private ImageButton settings_button;

    ArrayList<SourceClass> source;
    ListView source_list;
    private static SourceCustomList source_custom_list;

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
    }

    public void openExploreActivity() {
        Intent intent = new Intent(this, ExploreActivity.class);
        startActivity(intent);
    }

    public void openSettingsActivity() {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
}

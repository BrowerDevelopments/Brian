package com.example.brower.brian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class BrianActivity extends AppCompatActivity {


    ImageButton source_button;
    ImageButton brainiac_button;
    ImageButton brian_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brian);

        source_button = (ImageButton) findViewById(R.id.source_button);
        brian_button = (ImageButton) findViewById(R.id.brian_button);
        brainiac_button = (ImageButton) findViewById(R.id.brainiac_button);

        final Intent source_intent = new Intent(this, SourcesActivity.class);
        final Intent brian_intent = new Intent(this, BrianActivity.class);
//        Intent brainiac_intent = new Intent(this, )

        source_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(source_intent);
            }
        });

        brian_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(brian_intent);
            }
        });
    }
}

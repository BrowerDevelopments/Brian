package com.example.brower.brian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RyanActivity2 extends AppCompatActivity {
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ryan2);

        button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRyanActivity();
            }
        });
    }

    private void openRyanActivity() {
        Intent intent = new Intent(this, RyanActivity.class);
        startActivity(intent);
    }
}

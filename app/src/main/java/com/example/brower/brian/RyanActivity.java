package com.example.brower.brian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RyanActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ryan);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRyanActivity2();
            }
        });
    }

    public void openRyanActivity2(){
        Intent intent = new Intent(this, RyanActivity2.class);
        startActivity(intent);
    }
}

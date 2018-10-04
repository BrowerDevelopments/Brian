package com.example.brower.brian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SourcesActivity extends AppCompatActivity {

    ArrayList<SourceClass> source;
    ListView source_list;
    private static SourceCustomList source_custom_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sources);

    }
}

package com.example.brower.brian;

import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SourceCustomList extends ArrayAdapter<SourceClass> {

    private ArrayList<SourceClass> data_set;
    Context context;

    private static class view_holder {
        TextView lobe;
        TextView name;
        TextView link;
    }

    public SourceCustomList(ArrayList<SourceClass> element, Context context) {
        super(context, R.layout.source_item, element);
        this.data_set = element;
        this.context = context
    }

}

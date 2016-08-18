package com.example.expandablelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.andexert.expandablelayout.library.ExpandableLayoutListView;

public class MainActivity extends AppCompatActivity {
    private final String[] array = {"Test 1", "Test 2", "Test 3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.view_row, R.id.header_text, array);
        final ExpandableLayoutListView expandableLayoutListView = (ExpandableLayoutListView) findViewById(R.id.listview);

        expandableLayoutListView.setAdapter(arrayAdapter);
    }
}

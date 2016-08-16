package com.example.materialtabs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private Button fixedButton, scrollButton, iconTextButton, iconButton, customButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fixedButton = (Button)findViewById(R.id.fixed);
        scrollButton = (Button)findViewById(R.id.scrollable);
        iconTextButton = (Button)findViewById(R.id.icon_text);
        iconButton = (Button)findViewById(R.id.icon);
        customButton = (Button)findViewById(R.id.custom);

        fixedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FixedActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        scrollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ScrollableActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        iconTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, IconTextActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        iconButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, IconActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        customButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}

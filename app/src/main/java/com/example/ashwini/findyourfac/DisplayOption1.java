package com.example.ashwini.findyourfac;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;

public class DisplayOption1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_option1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();


    }

    public void teachers(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayTeachers.class);
        startActivity(intent);
    }


    public void labs_1(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, Displaylabs_1.class);
        startActivity(intent);
    }

    public void clr1(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, ClassroomsMonday.class);
        startActivity(intent);
    }
}

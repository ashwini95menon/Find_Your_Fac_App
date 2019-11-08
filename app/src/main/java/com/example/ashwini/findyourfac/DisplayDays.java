package com.example.ashwini.findyourfac;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;



public class DisplayDays extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_days);
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
    public void option1(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayOption1.class);
        startActivity(intent);
    }

    public void option2(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayOption2.class);
        startActivity(intent);
    }

    public void option3(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayOption3.class);
        startActivity(intent);
    }

    public void option4(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayOption4.class);
        startActivity(intent);
    }

    public void option5(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayOption5.class);
        startActivity(intent);
    }







}

package com.example.ashwini.findyourfac;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Kalyani extends AppCompatActivity {

    ArrayAdapter<String> adapter;
    ListView listview;
    String[] k = {"nine facualty room", "ten clr101", "eleven clr201", "twelve clr113", "one facualtyroom " ,"onethirty lab06" , "twothirty lab06" , "threethirty facualtyroom", "fourthirty facualtyroom"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalyani);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listview = (ListView)findViewById(R.id.listView4);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, k);
        listview.setAdapter(adapter);


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

}

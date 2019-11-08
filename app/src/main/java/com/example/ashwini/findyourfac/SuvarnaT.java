package com.example.ashwini.findyourfac;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;



public class SuvarnaT extends AppCompatActivity {

         //String json_string;
         String JSON_STRING;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suvarna_t);


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

    public void getJson(View view) {
        new BackgroudTask().execute();

    }

    class BackgroudTask extends AsyncTask<Void,Void,String>
    {   String json_url;

        @Override
        protected void onPreExecute() {
            json_url ="http://androidapp1.site88.net/fetchuserdata2.php";
        }

        @Override
        protected String doInBackground(Void... voids) {
          try
          {
              URL url = new URL(json_url);
              HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
              InputStream inputStream = httpURLConnection.getInputStream();
              BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
              StringBuilder stringBuilder = new StringBuilder();
              while((JSON_STRING = bufferedReader.readLine())!=null)
              {
                 stringBuilder.append(JSON_STRING+"\n");
              }
              bufferedReader.close();
              inputStream.close();
              return stringBuilder.toString().trim();
          } catch(MalformedURLException e) {
              e.printStackTrace();
          } catch(IOException e) {
              e.printStackTrace();
          }
            return null;
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(String result) {
            TextView textView =(TextView)findViewById(R.id.textview);
            textView.setText(result);
        }
    }

    public void parseJson(View view) {
            Intent intent = new Intent(this, DisplayList.class);
            startActivity(intent);
        }

}

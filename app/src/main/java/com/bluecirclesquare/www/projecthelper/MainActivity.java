package com.bluecirclesquare.www.projecthelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button jobs;
private Button map;
private Button quote;
private Button invoice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    jobs = (Button) findViewById(R.id.create_job);
    jobs.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        }
    });
    quote = (Button) findViewById(R.id.create_quotes);
    quote.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    });

    map = (Button) findViewById(R.id.view_maps);
    map.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v){

        }
    });
    }
}

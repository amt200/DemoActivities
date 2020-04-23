package com.android.demoactivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DemoActivities extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_activities);

       textView = findViewById(R.id.textViewData);

       Intent intent = getIntent();

       String[] info = intent.getStringArrayExtra("info");

       textView.setText("You are "+info[0]+", age "+info[1]);
    }
}

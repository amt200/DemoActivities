package com.android.demoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etName, etAge;
    Button btnDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.editTextName);
        etAge = findViewById(R.id.editTextAge);

        btnDone = findViewById(R.id.buttonDone);

        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] info = {etName.getText().toString(), etAge.getText().toString()};

                Intent intent = new Intent(MainActivity.this, DemoActivities.class);

                intent.putExtra("info", info);

                startActivity(intent);
            }
        });
    }
}

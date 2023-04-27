package com.example.screens;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

   private TextView skrivText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String namn = extras.getString("name");
            int number = extras.getInt("number");
            // Do something with the name and numbe
            skrivText = findViewById(R.id.textView);
            skrivText.setText(namn)
        }
    }
}

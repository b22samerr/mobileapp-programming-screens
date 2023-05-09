package com.example.screens;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

   private TextView skrivText;
   private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String namn = extras.getString("name");
            int number = extras.getInt("number");
            // Do something with the name and number
            skrivText = findViewById(R.id.textView);
            skrivText.setText(namn);
        }
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this, MainActivity.class);
                intent.putExtra("name", "Ergul"); // Option
                startActivity(intent);
            }
        });

    }

}

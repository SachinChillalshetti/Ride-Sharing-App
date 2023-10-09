package com.example.riding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) View View8 = findViewById(R.id.View8);

        View8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform login logic

                // Start the new activity

                Toast.makeText(MainActivity5.this, "ThankYou for Riding", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity5.this, MainActivity3.class);
                startActivity(intent);



            }
        });
//---------------------------------------------------------------------------------------------------------------------
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) View View10 = findViewById(R.id.View10);
        View10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform login logic

                // Start the new activity



                Intent intent = new Intent(MainActivity5.this, MainActivity6.class);
                startActivity(intent);



            }
        });

    }
}
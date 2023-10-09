package com.example.riding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
       public static class button{
           public static void setOnClickListener(View.OnClickListener onClickListener) {
           }
       };
       TextView user;
       TextView password;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=findViewById(R.id.username);
        password=findViewById(R.id.pass);
        View button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform login logic
                String name=user.getText().toString();
                String pass=password.getText().toString();
                // Start the new activity


                    if(name.equals("xyz")&&pass.equals("123")){
                        Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                        startActivity(intent);

                    }
                    else {
                        Toast.makeText(MainActivity.this,"Invalid",Toast.LENGTH_SHORT).show();
                    }

            }
        });
    }
}
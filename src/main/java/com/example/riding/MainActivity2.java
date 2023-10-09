package com.example.riding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    public static class button{
        public static void setOnClickListener(View.OnClickListener onClickListener) {
        }
    };
    TextView pick;
    TextView des;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        pick=findViewById(R.id.pickup);
        des=findViewById(R.id.dest);
        View button = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform login logic
                String data1 =pick.getText().toString();
                String data2 =des.getText().toString();
                // Start the new activity
                Intent intent = new Intent(MainActivity2.this, MapsActivity.class);
                intent.putExtra("dataname1",data1);
                intent.putExtra("dataname2",data2);
                startActivity(intent);
            }
        });
    }
}
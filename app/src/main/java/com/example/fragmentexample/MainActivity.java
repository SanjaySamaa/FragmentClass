package com.example.fragmentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Console;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    Button b;
    String value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.txt);
        b = findViewById(R.id.activitybutton);
        if(savedInstanceState == null){
            Bundle bund = new Bundle();
            bund.putString("key",value);
            getSupportFragmentManager().beginTransaction().add(R.id.page1,Page1.class,bund).commit();
        }
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value = e1.getText().toString();
            }
        });
    }
}
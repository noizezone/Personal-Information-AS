package com.example.personalinformation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText name,email,phone,date,height;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.editTextTextPersonName);
        email = findViewById(R.id.editTextTextPersonName);
        phone = findViewById(R.id.editTextTextPersonName);
        date = findViewById(R.id.editTextTextPersonName);
        height = findViewById(R.id.editTextTextPersonName);
        System.out.println("Hi there");


    }
}
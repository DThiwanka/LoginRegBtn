package com.example.test2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login = findViewById(R.id.btn1);
        Button register = findViewById(R.id.btn_reg);

    }

    //navigation

    public void openlogin(View view){
        Intent intent = new Intent(this,Login.class);
        startActivity(intent);
        Toast.makeText(this, "Welcome To Login.....!",Toast.LENGTH_LONG).show();
    }

    public void openRegister(View view){
        Intent intent = new Intent(this,Register.class);
        startActivity(intent);
        Toast.makeText(this, "Welcome To Register.....!",Toast.LENGTH_LONG).show();
    }

    }

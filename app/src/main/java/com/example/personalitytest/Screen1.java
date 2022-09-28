package com.example.personalitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Screen1 extends AppCompatActivity {

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);

        sharedPreferences = getSharedPreferences("result", Context.MODE_PRIVATE);

        ImageView next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText input = findViewById(R.id.answer1);
                EditText inputD = findViewById(R.id.answerDescription1);
                if (!input.getText().toString().isEmpty()){
                    Intent intent = new Intent(Screen1.this,Screen2.class);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("answer1", input.getText().toString());
                    editor.putString("answerDes1",inputD.getText().toString());
                    editor.apply();
                    startActivity(intent);
                }else {
                    Toast.makeText(Screen1.this,"Enter text",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
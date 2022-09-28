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

public class Screen2 extends AppCompatActivity {

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        sharedPreferences = getSharedPreferences("result", Context.MODE_PRIVATE);

        ImageView next = findViewById(R.id.next1);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText input = findViewById(R.id.answer2);
                EditText inputD = findViewById(R.id.answerDescription2);
                if (!input.getText().toString().isEmpty()){
                    Intent intent = new Intent(Screen2.this,Screen3.class);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("answer2", input.getText().toString());
                    editor.putString("answerDes2",inputD.getText().toString());
                    editor.apply();
                    startActivity(intent);
                }else {
                    Toast.makeText(Screen2.this,"Enter text",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
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

public class Screen3 extends AppCompatActivity {

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);

        sharedPreferences = getSharedPreferences("result", Context.MODE_PRIVATE);

        ImageView result = findViewById(R.id.result);
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText input = findViewById(R.id.answer3);
                EditText inputD = findViewById(R.id.answerDescription3);
                if (!input.getText().toString().isEmpty()){
                    Intent intent = new Intent(Screen3.this,Results.class);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("answer3", input.getText().toString());
                    editor.putString("answerDes3",inputD.getText().toString());
                    editor.apply();
                    startActivity(intent);
                }else {
                    Toast.makeText(Screen3.this,"Enter text",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
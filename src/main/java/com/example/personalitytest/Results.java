package com.example.personalitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Results extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        SharedPreferences sp = getApplicationContext().getSharedPreferences("result", Context.MODE_PRIVATE);

        TextView answer1 = findViewById(R.id.answerOne);
        TextView answerDes1 = findViewById(R.id.answerDescriptionOne);
        String text1 = sp.getString("answer1","");
        String d1 = sp.getString("answerDes1","");
        answer1.setText(text1);
        answerDes1.setText(d1);

        TextView answer2 = findViewById(R.id.answerTwo);
        TextView answerDes2 = findViewById(R.id.answerDescriptionTwo);
        String text2 = sp.getString("answer2","");
        String d2 = sp.getString("answerDes2","");
        answer2.setText(text2);
        answerDes2.setText(d2);

        TextView answer3 = findViewById(R.id.answerThree);
        TextView answerDes3 = findViewById(R.id.answerDescriptionThree);
        String text3 = sp.getString("answer3","");
        String d3 = sp.getString("answerDes3","");
        answer3.setText(text3);
        answerDes3.setText(d3);

        ImageView again = findViewById(R.id.again);
        again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Results.this,MainActivity.class));
            }
        });

    }
}
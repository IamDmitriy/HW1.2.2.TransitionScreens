package com.example.hw122transitionscreens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    final String link = "http://myfile.org/";
    final int randomNumber = new Random().nextInt(100) + 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        Button btnForward = findViewById(R.id.btn_forward);
        Button btnBack = findViewById(R.id.btn_back);
        TextView txtLink = findViewById(R.id.txt_link);

        String generatedLink = link + randomNumber;
        txtLink.setText(generatedLink);

        btnForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

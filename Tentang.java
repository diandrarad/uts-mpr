package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.widget.Toast;

public class Tentang extends AppCompatActivity {
    private Button btkembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);
        btkembali = (Button) findViewById(R.id.btkembali);

        btkembali.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btkembali = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(btkembali);
                Tentang.this.finish();
            }
        });
    }
}
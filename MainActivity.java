package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private Button button, button2, button3, button4;

    @Override
    public void onBackPressed() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setIcon(R.drawable.ic_baseline_exit_to_app_24);
        builder.setTitle("Confirm Exit");
        builder.setMessage("Do you want to exit?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        builder.setNegativeButton("Cancel", null);
        final AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);

        button.setOnClickListener(v -> {
            Intent intent1 = new Intent(getApplicationContext(),GajiPegawai.class);
            startActivity(intent1);
        });
        button2.setOnClickListener(v -> {
            Intent intent1 = new Intent(getApplicationContext(),Petunjuk.class);
            startActivity(intent1);
        });
        button3.setOnClickListener(v -> {
            Intent intent1 = new Intent(getApplicationContext(),Tentang.class);
            startActivity(intent1);
        });
        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                moveTaskToBack(true);
            }
        });
    }
}
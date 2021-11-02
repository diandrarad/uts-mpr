package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

import java.util.zip.DeflaterOutputStream;

public class GajiPegawai extends AppCompatActivity {
    EditText ednik, ednama, edgapok, edtunj, edhari, edtm, edtt, edgator, edgaber;
    Button bthitung, btkembali;
    Double vnik, vgapok, vtunj, vhari, vtm, vtt, vgator, vgaber;
    String vnama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaji_pegawai);
        ednik = (EditText)findViewById(R.id.ednik);
        ednama = (EditText)findViewById(R.id.ednama);
        edgapok = (EditText)findViewById(R.id.edgapok);
        edtunj = (EditText)findViewById(R.id.edtunj);
        edhari = (EditText)findViewById(R.id.edhari);
        edtm = (EditText)findViewById(R.id.edtm);
        edtt = (EditText)findViewById(R.id.edtt);
        edgator = (EditText)findViewById(R.id.edgator);
        edgaber = (EditText)findViewById(R.id.edgaber);
        bthitung = (Button) findViewById(R.id.bthitung);
        btkembali = (Button) findViewById(R.id.btkembali);

        btkembali.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btkembali = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(btkembali);
                GajiPegawai.this.finish();
            }
        });
    }

    public void hitung(View view){
        vnik = Double.parseDouble(ednik.getText().toString());
        vgapok = Double.parseDouble(edgapok.getText().toString());
        vtunj = Double.parseDouble(edtunj.getText().toString());
        vhari = Double.parseDouble(edhari.getText().toString());

        vtm = vhari * 10000;
        vtt = vhari * 5000;
        vgator = vgapok + vtunj + vtm + vtt;
        vgaber = vgator - (0.1 * vgator);

        edtm.setText(""+vtm);
        edtt.setText(""+vtt);
        edgator.setText(""+vgator);
        edgaber.setText(""+vgaber);
    }
}
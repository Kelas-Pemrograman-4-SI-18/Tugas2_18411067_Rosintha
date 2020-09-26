package com.e.tambah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtHasil ;
    EditText edtNilaiA, edtNilaiB;
    Button btnTambah, btnKali, btnKurang, btnBagi;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHasil = (TextView) findViewById(R.id.txtHasil);
        edtNilaiA = (EditText) findViewById(R.id.edtNilaiA);
        edtNilaiB = (EditText) findViewById(R.id.edtNilaiB);
        btnTambah = (Button) findViewById(R.id.btnTambah);
        btnKali = (Button) findViewById(R.id.btnKali);
        btnKurang = (Button) findViewById(R.id.btnKurang);
        btnBagi = (Button) findViewById(R.id.btnBagi);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int NilaiA = Integer.parseInt(edtNilaiA.getText().toString());
                int NilaiB = Integer.parseInt(edtNilaiB.getText().toString());
                int hasil = NilaiA + NilaiB;

                txtHasil.setText(String.valueOf(hasil));
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int NilaiA = Integer.parseInt(edtNilaiA.getText().toString());
                int NilaiB = Integer.parseInt(edtNilaiB.getText().toString());
                int hasil = NilaiA * NilaiB;

                txtHasil.setText(String.valueOf(hasil));
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int NilaiA = Integer.parseInt(edtNilaiA.getText().toString());
                int NilaiB = Integer.parseInt(edtNilaiB.getText().toString());
                int hasil = NilaiA - NilaiB;

                txtHasil.setText(String.valueOf(hasil));
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int NilaiA = Integer.parseInt(edtNilaiA.getText().toString());
                int NilaiB = Integer.parseInt(edtNilaiB.getText().toString());
                int hasil = NilaiA / NilaiB;

                txtHasil.setText(String.valueOf(hasil));
            }
        });
    }
}
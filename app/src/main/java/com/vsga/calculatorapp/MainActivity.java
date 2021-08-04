package com.vsga.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText input1, input2;
    int getInput1, getInput2;
    TextView hasil;
    Button btn_tambah, btn_kurang, btn_kali, btn_bagi, btn_clean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = findViewById(R.id.edNumber1);
        input2 = findViewById(R.id.edNumber2);
        hasil = findViewById(R.id.txtHasil);

        btn_tambah = findViewById(R.id.btnTambah);
        btn_tambah.setOnClickListener(this);

        btn_kurang = findViewById(R.id.btnKurang);
        btn_kurang.setOnClickListener(this);

        btn_kali = findViewById(R.id.btnBagi);
        btn_kali.setOnClickListener(this);

        btn_bagi = findViewById(R.id.btnKali);
        btn_bagi.setOnClickListener(this);

        btn_clean = findViewById(R.id.btnClean);
        btn_clean.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnTambah:
                getInput1 = Integer.valueOf(input1.getText().toString());
                getInput2 = Integer.valueOf(input2.getText().toString());
                int hasilJumlah = getInput1 + getInput2;
                hasil.setText(String.valueOf(hasilJumlah));
                break;

            case R.id.btnKurang:
                getInput1 = Integer.valueOf(input1.getText().toString());
                getInput2 = Integer.valueOf(input2.getText().toString());
                int hasilPengurangan = getInput1 - getInput2;
                hasil.setText(String.valueOf(hasilPengurangan));
                break;

            case R.id.btnKali:
                getInput1 = Integer.valueOf(input1.getText().toString());
                getInput2 = Integer.valueOf(input2.getText().toString());
                int hasilPembagian = getInput1 * getInput2;
                hasil.setText(String.valueOf(hasilPembagian));
                break;

            case R.id.btnBagi:
                getInput1 = Integer.valueOf(input1.getText().toString());
                getInput2 = Integer.valueOf(input2.getText().toString());
                int hasilPerkalian = getInput1 / getInput2;
                hasil.setText(String.valueOf(hasilPerkalian));
                break;

            case R.id.btnClean:
                input1.setText("");
                input2.setText("");
                hasil.setText("0");
                input1.requestFocus();

        }
    }
}
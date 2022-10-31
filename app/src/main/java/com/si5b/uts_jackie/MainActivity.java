package com.si5b.uts_jackie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Button btnDaftar;
    EditText etNamaLengkap;
    EditText etNomorPendaftaran;
    Spinner spJalurPendaftaran;
    CheckBox cbKonfirmasiDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Layout Pertama");

        btnDaftar = findViewById(R.id.btn_daftar);
        etNamaLengkap = findViewById(R.id.et_nama_lengkap);
        etNomorPendaftaran = findViewById(R.id.et_nomor_pendaftaran);
        spJalurPendaftaran = findViewById(R.id.sp_jalur_pendaftaran);
        cbKonfirmasiDaftar = findViewById(R.id.cb_konfirmasi_daftar);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namaLengkap = etNamaLengkap.getText().toString();
                String nomorPendaftaran = etNomorPendaftaran.getText().toString();

                if (namaLengkap.trim().equals("")){
                    etNamaLengkap.setError("Nama Harus Diisi");
                }

                else{
                    Intent daftar = new
                }
            }
        });

    }
}
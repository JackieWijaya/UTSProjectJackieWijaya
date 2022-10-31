package com.si5b.uts_jackie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tvNamaLengkap;
    TextView tvNomorPendaftaran;
    TextView tvJalurPendaftaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvNamaLengkap = findViewById(R.id.tv_tampil_nama_lengkap);
        tvNomorPendaftaran = findViewById(R.id.tv_tampil_nomor_pendaftaran);
        tvJalurPendaftaran = findViewById(R.id.tv_tampil_jalur_pendaftaran);

        Intent terima = getIntent();
        String yNamaLengkap = terima.getStringExtra("xNamaLengkap");
        String yNomorPendaftaran = terima.getStringExtra("xNomorPendaftaran");
        String yJalurPendaftaran = terima.getStringExtra("xJalurPendaftaran");
        tvNamaLengkap.setText(yNamaLengkap);
        tvNomorPendaftaran.setText(yNomorPendaftaran);
        tvJalurPendaftaran.setText(yJalurPendaftaran);
    }
}
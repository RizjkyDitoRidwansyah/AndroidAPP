package com.ditoa4app;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivityMenu extends AppCompatActivity {

    CardView tombolSatu;
    CardView tombolDua;
    CardView tombolTiga;
    CardView tombolEmpat;
    CardView tombolLima;
    CardView tombolEnam;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuaplikasi);

        tombolSatu = findViewById(R.id.cdMenu1);

        tombolSatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ketika tombolSatu ditekan, pindah ke HelloActivity
                Intent intent = new Intent(MainActivityMenu.this, MainActivity.class);
                startActivity(intent);
            }
        });

        tombolDua = findViewById(R.id.cdMenu2);
        tombolDua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ketika tombolDua ditekan, lakukan aksi yang diinginkan
                // Misalnya, pindah ke aktivitas lain atau jalankan fungsi khusus
                Intent intent = new Intent(MainActivityMenu.this, MainActivityScrollIceCold.class);
                startActivity(intent);
            }
        });

        tombolTiga = findViewById(R.id.cdMenu3);
        tombolTiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ketika tombolDua ditekan, lakukan aksi yang diinginkan
                // Misalnya, pindah ke aktivitas lain atau jalankan fungsi khusus
                Intent intent = new Intent(MainActivityMenu.this, MainActivityOne.class);
                startActivity(intent);
            }
        });

        tombolEmpat = findViewById(R.id.cdMenu4);
        tombolEmpat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ketika tombolDua ditekan, lakukan aksi yang diinginkan
                // Misalnya, pindah ke aktivitas lain atau jalankan fungsi khusus
                Intent intent = new Intent(MainActivityMenu.this,  MainActivityCount.class);
                startActivity(intent);
            }
        });

        tombolLima = findViewById(R.id.cdMenu5);
        tombolLima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ketika tombolDua ditekan, lakukan aksi yang diinginkan
                // Misalnya, pindah ke aktivitas lain atau jalankan fungsi khusus
                Intent intent = new Intent(MainActivityMenu.this, MainActivityMyAlarm.class);
                startActivity(intent);
            }
        });

        tombolEnam = findViewById(R.id.cdMenu6);
        tombolEnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivityMenu.this, Maps.class);
                startActivity(intent);
            }

        });
    }
}
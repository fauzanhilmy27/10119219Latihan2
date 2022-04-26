package com.latihan2.a10119219latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;

//NIM   : 10119219
//Nama  : Fauzan Hilmy
//Kelas : IF-6
//tanggal : 27-4-2022
public class verifaccount extends AppCompatActivity {
    RelativeLayout textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_verifaccount);

        textView = findViewById(R.id.vry);
        textView.setOnClickListener(v -> {
            Intent intent = new Intent(verifaccount.this, profile.class);
            startActivity(intent);
        });
    }
}
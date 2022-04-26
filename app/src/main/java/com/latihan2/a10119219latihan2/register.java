package com.latihan2.a10119219latihan2;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
//NIM   : 10119219
//Nama  : Fauzan Hilmy
//Kelas : IF-6
//tanggal : 27-4-2022
public class register extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.register);

        textView = findViewById(R.id.regis);
        textView.setOnClickListener(v -> {
            Intent intent = new Intent(register.this, almost_there.class);
            startActivity(intent);
        });
    }
}

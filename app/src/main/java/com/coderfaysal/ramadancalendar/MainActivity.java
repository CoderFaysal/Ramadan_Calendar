package com.coderfaysal.ramadancalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button btn_1, btn_2, btn_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_1 =findViewById(R.id.btn_1);
        btn_2 =findViewById(R.id.btn_2);
        btn_3 =findViewById(R.id.btn_3);

        btn_1.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, First.class));
        });

        btn_2.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, Secound.class));
        });

        btn_3.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, Third.class));
        });




    }
}
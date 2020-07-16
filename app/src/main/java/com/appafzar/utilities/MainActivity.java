package com.appafzar.utilities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_custom_toast).setOnClickListener(this);
        findViewById(R.id.btn_custom_spinner).setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.btn_custom_toast) {
            startActivity(new Intent(MainActivity.this, CustomToastActivity.class));
        } else if (id == R.id.btn_custom_spinner) {
            startActivity(new Intent(MainActivity.this, CustomSpinnerActivity.class));
        }
    }
}
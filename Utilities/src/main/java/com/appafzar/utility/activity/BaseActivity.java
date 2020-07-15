package com.appafzar.utility.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.appafzar.utility.helper.Tools;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected void toastMessage(int resSrt) {
        toastMessage(getString(resSrt));
    }

    protected void toastMessage(String msg) {
        Tools.toastMessage(this, msg);
    }
}
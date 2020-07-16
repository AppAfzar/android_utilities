package com.appafzar.utilities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.appafzar.utility.activity.BaseActivity;

public class CustomToastActivity extends BaseActivity {
    String link = "http://appafzar.com/?option=com_content&view=article&id=201";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toast);
        setTitle("Custom Toast");
        findViewById(R.id.btnToast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toastMessage("It is a custom_spinner_item toast");
            }
        });

        TextView txtLink = findViewById(R.id.link);
        txtLink.setText(link);
        txtLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                startActivity(browserIntent);
            }
        });
    }
}
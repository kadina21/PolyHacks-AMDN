package com.example.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InfoContact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_contact);
        Button infoContactbtn = findViewById(R.id.button);
        infoContactbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }

    public void openActivity2() {
        Intent intent = new Intent(this, PageDina.class);
        Bundle b = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        startActivity(intent,b);
    }
}
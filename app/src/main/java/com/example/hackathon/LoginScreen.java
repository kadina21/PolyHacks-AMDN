package com.example.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginScreen extends AppCompatActivity {
    EditText enterNumeroConnexion;
    EditText enterMDPConnexion;
    Button btnLogin;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_screen);

        enterNumeroConnexion=findViewById(R.id.enterNumeroConnexion);
        enterMDPConnexion=findViewById(R.id.enterMDPConnexion);
        btnLogin=findViewById(R.id.btnLogin);

        //Listeners
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    public void openActivity3() {
        //Intent intent = new Intent(this, activity_main.class);
        //startActivity(intent);
    }
}
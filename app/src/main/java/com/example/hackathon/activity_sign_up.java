package com.example.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activity_sign_up extends AppCompatActivity {
    EditText enterFirstName;
    EditText enterLastName;
    EditText enterNumeroInscription;
    EditText enterMDPInscription;
    EditText entreNomContact2;
    EditText enterLienParente2;
    EditText enterNumeroContact2;
    Button btnInscription;
    Button btnDejaInscrit;
    DataBaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_screen);

        enterFirstName.findViewById(R.id.enterFirstName);
        enterLastName.findViewById(R.id.enterLastName);
        enterNumeroInscription.findViewById(R.id.enterNumeroInscription);
        enterMDPInscription.findViewById(R.id.enterMDPInscription);
        btnInscription.findViewById(R.id.btnInscription);
        btnDejaInscrit.findViewById(R.id.btnDejaInscrit);
        db=new DataBaseHelper(activity_sign_up.this);

        btnInscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*SignupModel sm;

                try {
                    sm=new SignupModel(enterFirstName.getText().toString(),enterLastName.getText().toString(),enterNumeroInscription.getText().toString(),enterMDPInscription.getText().toString(),enterNumeroContact2.getText().toString(),entreNomContact2.getText().toString(),enterLienParente2.getText().toString());
                }catch (Exception e){
                    e.printStackTrace();
                    sm = new SignupModel("error", "error", "error", "error", "error", "error", "error");
                }*/
                //DataBaseHelper dataBaseHelper = new DataBaseHelper(activity_sign_up.this);
                //db.signup(sm);
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

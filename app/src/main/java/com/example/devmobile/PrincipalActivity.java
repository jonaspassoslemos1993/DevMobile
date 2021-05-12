package com.example.devmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }


    public void abreLoginActivity(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }



    public void retornaTelaPrincipal(View view) {
        Intent intent = new Intent(this,SplashActivity.class);
        startActivity(intent);
    }

    public void acessaTodos(View view) {
        Intent intent = new Intent(this, Api.class);
        startActivity(intent);
    }



}

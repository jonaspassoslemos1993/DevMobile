package com.example.devmobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Button[] btLogin = {(Button) findViewById(R.id.btLogin)};
        btLogin[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tLogin = (TextView) findViewById(R.id.tLogin);
                TextView tSenha = (TextView) findViewById(R.id.tSenha);
                String login = tLogin.getText().toString();
                String senha = tSenha.getText().toString();

                    if (login.equals(senha)) {
                        //alert("Login realizado com sucesso! ");
                        acessaApp();
                    } else {
                        alert("Ops! Verifique usuário e senha!");

                    }


            }

        });

    }


   private void alert(String s) {

    Toast.makeText(this,s, Toast.LENGTH_LONG).show();
}


    public void acessaApp() {
        Intent intent = new Intent(this,PrincipalActivity.class);
        startActivity(intent);
    }


}
package com.example.devmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Api extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private TextView textoApi;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_api);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        textoApi = (TextView) findViewById(R.id.textoApi);
        //Botão API (Todos)
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Tarefa tarefa = new Tarefa();
                tarefa.execute("https://jsonplaceholder.typicode.com/todos");
                alert("API (Todos) carregada com sucesso!");
            }
        });
        //Botão API (Posts)
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Tarefa tarefa = new Tarefa();
                tarefa.execute("https://jsonplaceholder.typicode.com/posts");
                alert("API (Posts) carregada com sucesso!");
            }
        });
        //Botão API (Comments)
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Tarefa tarefa = new Tarefa();
                tarefa.execute("https://jsonplaceholder.typicode.com/comments");
                alert("API (Comments) carregada com sucesso!");
            }
        });
        //Botão API (Photos)
        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Tarefa tarefa = new Tarefa();
                tarefa.execute("https://jsonplaceholder.typicode.com/users");
                alert("API (Users) carregada com sucesso!");
            }
        });
    }


    public class Tarefa extends AsyncTask<String, String, String> {

        @Override
        public String doInBackground(String... strings) {
            String retorno = Conexao.getDados(strings[0]);
            return retorno;
        }

        @Override
        public void onPostExecute(String s) {
            textoApi.setText(s);
        }
    }



    public void retornaTelaPrincipal(View view) {
        Intent intent = new Intent(this,PrincipalActivity.class);
        startActivity(intent);
    }

    private void alert(String s) {
        Toast.makeText(this,s, Toast.LENGTH_LONG).show();
    }

}
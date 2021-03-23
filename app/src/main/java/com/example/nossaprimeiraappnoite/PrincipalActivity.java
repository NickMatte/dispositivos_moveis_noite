package com.example.nossaprimeiraappnoite;

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

    public void abreLoginActivity(View view){
        Intent intent = new Intent(this,LoginActivity.class);
        Pessoa jean = new Pessoa("Jean Paul", 666);
        startActivity(intent);
    }

    public void abreSecondActivity(View view){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }

    public void abrePrincipalActivity(View view){
        Intent intent = new Intent(this,PrincipalActivity.class);
        startActivity(intent);
    }
}
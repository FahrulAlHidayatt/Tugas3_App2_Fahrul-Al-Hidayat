package com.fahrulalhidayat.goapps.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.fahrulalhidayat.goapps.R;

public class LoginActivity extends AppCompatActivity {

    Button login;
    EditText username, password;

    protected void onCreate (Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        setContentView(R.layout.login_relative);

        login = (Button) findViewById(R.id.btn_Login);
        username = (EditText) findViewById(R.id.et_username);
        password = (EditText) findViewById(R.id.et_password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (password.getText().toString().toUpperCase().equals("TEST1")){
                    login_sukses();
                } else {
                    Toast.makeText(getApplicationContext(),"Salah Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void login_sukses() {
        String user_login = username.getText().toString();
        Intent i = new Intent(this,MainActivity.class);
        //kirimkan username ke tampilan utama
        i.putExtra("USERNAME",user_login);
        startActivity(i);

    }
}

package com.app.librarymanagement.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.app.librarymanagement.R;

public class CreateAccountActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnLogin;
    TextView tvCreateAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        btnLogin = findViewById(R.id.LoginBtn);
        tvCreateAccount = findViewById(R.id.CreateAccount);
        btnLogin.setOnClickListener(this);
        tvCreateAccount.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.LoginBtn:
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                break;
            case R.id.CreateAccount:
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                break;
            default:
                break;
        }
    }
}
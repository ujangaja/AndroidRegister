package com.example.ujang.androidregister;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText editTextUsername ,editTextPassword,editTextEmail;
    private Button buttonRegister;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsername = (EditText)findViewById(R.id.editTextUsername);
        editTextPassword = (EditText)findViewById(R.id.editTextPassword);
        editTextEmail = (EditText)findViewById(R.id.editTextEmail);

        buttonRegister = (Button)findViewById(R.id.buttonRegister);

        progressDialog = new ProgressDialog(this);

        buttonRegister.setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {
        if (view == buttonRegister)
        registerUSer();
    }
}

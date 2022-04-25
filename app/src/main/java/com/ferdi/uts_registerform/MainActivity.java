package com.ferdi.uts_registerform;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username,email,password;
    Button buttonregister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username= (EditText)  findViewById(R.id.editUsername);
        email= (EditText)  findViewById(R.id.editPassword);
        password= (EditText)  findViewById(R.id.editPassword);
        buttonregister = (Button) findViewById(R.id.buttonRegister);

        buttonregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameKey = username.getText().toString();
                String emailKey = enail.getText().toString();
                String passwordKey = password.getText().toString();

                if(usernameKey.equals("ferdi")&& passwordKey.equals("123")){
                    Toast.makeText(getApplicationContext(), "Register Sukses", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
                    MainActivity.this.startActivity(intent);
                    finish();
                } else{
                    AlertDialog.Builder builder = new AlertDialog.Builder( MainActivity.this);
                    builder.setMessage("Register gagal")
                            .setNegativeButton("Retry",null).create().show();
                }
            }
        });
    }
}
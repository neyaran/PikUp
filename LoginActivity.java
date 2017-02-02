package com.pikup.Andriod;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText editUserName = (EditText) findViewById(R.id.editUserName);
        final EditText editPassword = (EditText) findViewById(R.id.editPassword);

        final Button bLogin = (Button) findViewById(R.id.bLogin);
        final Button bNotRegistered = (Button) findViewById(R.id.bNotRegistered);

        final TextView bNotRegisteredLink = (TextView) findViewById(R.id.bNotRegistered);
        bNotRegisteredLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bNotRegisteredIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(bNotRegisteredIntent);
            }
        });

        final TextView bLoginLink = (TextView) findViewById(R.id.bLogin);
        bLoginLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bLoginIntent = new Intent(LoginActivity.this, WelcomePageActivity.class);
                LoginActivity.this.startActivity(bLoginIntent);
            }
        });

    }
}

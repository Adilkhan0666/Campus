package com.example.campus;

import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginPage extends AppCompatActivity {

    private EditText name,email;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        name=findViewById(R.id.login_name);
        email=findViewById(R.id.login_emailid);
        login=findViewById(R.id.login_button);


        login.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                String et_name=name.getText().toString();
                String et_email=email.getText().toString();

                if (et_name.equals("Adil") && et_email.equals("adilkhan0666@gmail.com")){
                    startActivity(new Intent(LoginPage.this,AdminNoticePanelActivity.class));
                    finish();
                }
                else {
                    Toast.makeText(LoginPage.this, "Please enter correct credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
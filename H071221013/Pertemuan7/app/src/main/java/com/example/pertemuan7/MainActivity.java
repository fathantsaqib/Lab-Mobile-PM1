package com.example.pertemuan7;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

public class MainActivity extends AppCompatActivity {

    EditText editTextNIM, editTextPassword;
    SharedPreferences sharedPreferences;
    Button buttonLogin,buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //inisialisasi objk share.. dgn nama MyPrefs
        sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        setContentView(R.layout.activity_main);

        //untuk mendapatkan status login dari shared....
        boolean isLoggedIn = sharedPreferences.getBoolean("isLoggedIn", false);
        if (isLoggedIn) {
            startActivity(new Intent(MainActivity.this, TampilanActivity.class));
            finish();
        }

        editTextNIM = findViewById(R.id.et_NIM);
        editTextPassword = findViewById(R.id.et_PW);
        buttonLogin = findViewById(R.id.buttonLogin);
        buttonRegister = findViewById(R.id.buttonRegister);

        buttonLogin.setOnClickListener(v -> {
            String nim = editTextNIM.getText().toString();
            String password = editTextPassword.getText().toString();

            if (nim.isEmpty()) {
                editTextNIM.setError("NIM cannot be empty");
                return;
            }

            if (password.isEmpty()) {
                editTextPassword.setError("Password cannot be empty");
                return;
            }

            //mengambil nim &pw yg di simpan disharedPreferences
            String savedNIM = sharedPreferences.getString("NIM", "");
            String savedPassword = sharedPreferences.getString("Password", "");

            //membandingkan nim & pw yg dimasukkan
            if (nim.equals(savedNIM) && password.equals(savedPassword)) {
                Toast.makeText(MainActivity.this, "Selamat datang " + nim, Toast.LENGTH_SHORT).show();

                //status true
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("isLoggedIn", true);
                editor.apply();

                startActivity(new Intent(MainActivity.this, TampilanActivity.class));
                finish();
            } else {
                Toast.makeText(MainActivity.this, "The NIM or password is incorrect", Toast.LENGTH_SHORT).show();
            }
        });

        buttonRegister.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, RegisterActivity.class));
            finish();
        });

        int theme = sharedPreferences.getInt("theme", 0);
        if (theme == 1) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
    }
}
package com.example.praktikum4;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ImageView ivProfile = findViewById(R.id.iv_profile);
        TextView tvName = findViewById(R.id.tv_name);
        TextView tvUsername = findViewById(R.id.tv_username);

        Intent intent = getIntent();
        User user = intent.getParcelableExtra("user_data");

        ivProfile.setImageResource(user.getFotoProfile());
        tvName.setText(user.getName());
        tvUsername.setText(user.getUsername());

    }
}
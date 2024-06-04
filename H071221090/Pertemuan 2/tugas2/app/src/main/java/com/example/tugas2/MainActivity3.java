package com.example.tugas2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    TextView getnama;
    TextView getusn;
    TextView gettitle;
    TextView getcontent;
    ImageView getview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        getnama = findViewById(R.id.getnama);
        getusn = findViewById(R.id.getusn);
        gettitle = findViewById(R.id.gettitle);
        getcontent = findViewById(R.id.getcontent);
        getview = findViewById(R.id.getview);

        String nama = getIntent().getStringExtra("editNama");
        String usn = getIntent().getStringExtra("editUsn");
        String title = getIntent().getStringExtra("editTitle");
        String content = getIntent().getStringExtra("editContent");
        String imageUriString = getIntent().getStringExtra("imageUri");

        getnama.setText(nama);
        getusn.setText(usn);
        gettitle.setText(title);
        getcontent.setText(content);
        Uri imageUri = Uri.parse(imageUriString);
        getview.setImageURI(imageUri);
    }
}
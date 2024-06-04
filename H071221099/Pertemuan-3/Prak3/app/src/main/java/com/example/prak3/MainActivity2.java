package com.example.prak3;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    private ImageView iv_mainActivity2;
    private ImageView iv_profile2;
    private TextView tv_nama2;
//    private Story story;
//    private Post post;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        iv_mainActivity2 = findViewById(R.id.iv_mainActivity2);
        iv_profile2 = findViewById(R.id.iv_profile2);
        tv_nama2 = findViewById(R.id.tv_nama2);

        Intent intent = getIntent();
        Forall forall = intent.getParcelableExtra("forall");

        int image = forall.getImage();
        int imageStory = forall.getImage_story();
        String name = forall.getName();

        // Set data to views
        // Assuming iv_mainActivity2 is your ImageView for the main image
        iv_mainActivity2.setImageResource(imageStory);
        // Assuming iv_profile2 is your ImageView for the profile image
        iv_profile2.setImageResource(image);
        // Assuming tv_nama2 is your TextView for the name
        tv_nama2.setText(name);

        tv_nama2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("forall", forall);
                startActivity(intent);
            }
        });
    }

}
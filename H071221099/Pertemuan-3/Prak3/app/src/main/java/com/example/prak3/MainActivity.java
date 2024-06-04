package com.example.prak3;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvPost = findViewById(R.id.rv_post);
        rvPost.setHasFixedSize(true);

        PostAdapter postinganAdapter = new PostAdapter(DataSource.foralls);
        rvPost.setAdapter(postinganAdapter);

        RecyclerView rvStory = findViewById(R.id.rv_stories);
        rvStory.setHasFixedSize(true);

        StoryAdapter storyAdapter = new StoryAdapter(this,DataSource.foralls);
        rvStory.setAdapter(storyAdapter);
    }

}

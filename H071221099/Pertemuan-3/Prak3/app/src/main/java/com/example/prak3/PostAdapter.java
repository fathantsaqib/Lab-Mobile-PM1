package com.example.prak3;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {
    private final ArrayList<Forall> foralls;
    public PostAdapter(ArrayList<Forall> forall) {
        this.foralls = forall;
    }

    @NonNull
    @Override
    public PostAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.post, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull PostAdapter.ViewHolder holder, int position) {
        Forall forall= foralls.get(position);

        holder.tvName.setText(forall.getName());
        holder.tvCaption.setText(forall.getCaption());
        holder.ivImage.setImageResource(forall.getImage());
        holder.ivPost.setImageResource(forall.getIv_post());

        holder.ivImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.context, MainActivity2.class);
                Forall forall = foralls.get(holder.getAdapterPosition());
                intent.putExtra("forall", forall);
                holder.context.startActivity(intent);
            }
        });

        holder.tvName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.context, MainActivity3.class);
                Forall forall = foralls.get(holder.getAdapterPosition());
                intent.putExtra("forall", forall);
                holder.context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return foralls.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView tvName;
        private final ImageView ivImage;
        private final TextView tvCaption;
        private final ImageView ivPost;

        public Context context;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_name);
            ivImage = itemView.findViewById(R.id.iv_image);
            tvCaption = itemView.findViewById(R.id.tv_caption);
            ivPost = itemView.findViewById(R.id.iv_post);
            context = itemView.getContext();
        }

    }
}



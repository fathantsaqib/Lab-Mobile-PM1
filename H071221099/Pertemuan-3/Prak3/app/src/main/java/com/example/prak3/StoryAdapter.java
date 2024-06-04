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

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.ViewHolder> {
    private final ArrayList<Forall> foralls;
    private Context context;

    public StoryAdapter(Context context, ArrayList<Forall> foralls) {
        this.context = context;
        this.foralls = foralls;
    }

    @NonNull
    @Override
    public StoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.story, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull StoryAdapter.ViewHolder holder, int position) {
        Forall forall= foralls.get(position);

        holder.tvName.setText(forall.getName());
        holder.ivImage.setImageResource(forall.getImage());

        holder.ivImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.context, MainActivity2.class);
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
        private final Context context;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_name);
            ivImage = itemView.findViewById(R.id.iv_image);
            context = itemView.getContext();


        }
    }
}



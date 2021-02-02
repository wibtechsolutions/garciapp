package com.wib.garcipro;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class PostAdapter extends FirebaseRecyclerAdapter<title, PostAdapter.PastViewHolder> {
    public PostAdapter(@NonNull FirebaseRecyclerOptions<title> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull PastViewHolder holder, int i, @NonNull title title) {
        holder.title.setText(title.getTitle());
        holder.description.setText(title.getDesc());

    }

    @NonNull
    @Override
    public PastViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.title, parent, false);
        return new PastViewHolder(view);
    }
    class PastViewHolder extends RecyclerView.ViewHolder{

        TextView title,description;

        public PastViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            description = itemView.findViewById(R.id.description);
        }
    }

}
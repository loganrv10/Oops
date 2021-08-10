package com.example.recycleview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myViewHolder extends RecyclerView.ViewHolder {
    TextView nameTv;
    ImageView IvCancel;


    public myViewHolder(@NonNull  View itemView) {
        super(itemView);

        nameTv = itemView.findViewById(R.id.TvtextView);
        IvCancel = itemView.findViewById(R.id.IvCancel);
    }
}

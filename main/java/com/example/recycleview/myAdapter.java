package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myAdapter extends RecyclerView.Adapter<myViewHolder> {

    ArrayList<String> myNames = new ArrayList<>();
    Context context;
    OnNameItemClicked mListener;



    public myAdapter(ArrayList<String> myNames,Context context , OnNameItemClicked mListener) {
        this.myNames = myNames;
        this.context = context;
        this.mListener = mListener;
    }


    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.names_activity,parent,false);
         myViewHolder myViewHolder = new myViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        String name = myNames.get(position);
        holder.nameTv.setText(name);
        holder.nameTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               mListener.onMyNameClicked(name);

            }
        });
       holder.IvCancel.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mListener.deleteItem(position);
           }
       });


    }

    @Override
    public int getItemCount() {
        return myNames.size();
    }
}

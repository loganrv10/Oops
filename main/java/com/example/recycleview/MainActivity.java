package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnNameItemClicked {
    ArrayList<String> names = new ArrayList<>();
    myAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycleView);

        names.add("shiv");
        names.add("fiv");
        names.add("yogesh");
        names.add("seven");
        names.add("fiver");
        names.add("five");
        names.add("over");



        myAdapter =new myAdapter(names,this, this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(myAdapter);

    }


    @Override
    public void onMyNameClicked(String name) {
        Toast.makeText(this,name,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void deleteItem(int position) {
        names.remove(position);
        myAdapter.notifyDataSetChanged();
    }
}
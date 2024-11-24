package com.example.recyclerviewapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        // Prepare sample data
        List<String> items = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            items.add("Item " + i);
        }

        // Setup RecyclerView
        SimpleAdapter adapter = new SimpleAdapter(items);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}

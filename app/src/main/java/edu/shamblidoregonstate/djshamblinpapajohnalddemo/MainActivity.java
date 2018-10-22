package edu.shamblidoregonstate.djshamblinpapajohnalddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private List<Pizza> mPizzas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mPizzas = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Pizza pizza = new Pizza(
                    "Peperonni" + i,
                    "WELCOME TO PAPA JOHNALDS" + i
            );
        }

        mAdapter = new PizzAdapter(mPizzas, this);
        mRecyclerView.setAdapter(mAdapter);
    }
}


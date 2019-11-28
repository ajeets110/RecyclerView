package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private List<Country> countryList;
    private RecyclerView rvCountryList;
    private RecyclerViewAdapterDemo demoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews(){
        populateData();
        demoView = new RecyclerViewAdapterDemo(countryList);
        rvCountryList = findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        //RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        rvCountryList.setAdapter(demoView);
        rvCountryList.setLayoutManager(mLayoutManager);
    }

    private  void populateData() {
        countryList = new ArrayList<>();
        countryList.add(new Country("India",R.drawable.in));
        countryList.add(new Country("USA",R.drawable.us));
        countryList.add(new Country("Germany",R.drawable.gm));
        countryList.add(new Country("Canada",R.drawable.ca));


    }
}

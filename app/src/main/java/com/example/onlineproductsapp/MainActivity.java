package com.example.onlineproductsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.onlineproductsapp.adapter.ProductCategoryAdapter;
import com.example.onlineproductsapp.model.ProductCategory;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ProductCategoryAdapter productCategoryAdapter;
    RecyclerView productCatRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<ProductCategory> productCategoryList = new ArrayList<>();
        productCategoryList.add(new ProductCategory(1, "En Favoriler"));
        productCategoryList.add(new ProductCategory( 2,  "Koku"));
        productCategoryList.add(new ProductCategory( 3, "Yüz"));
        productCategoryList.add(new ProductCategory( 4,  "Saç"));

        setProductRecycler(productCategoryList);
    }

    private void setProductRecycler(List<ProductCategory> productCategoryList){

        productCatRecycler = findViewById(R.id.cat_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager( this, RecyclerView.HORIZONTAL,  false);
        productCatRecycler.setLayoutManager(layoutManager);
        productCategoryAdapter = new ProductCategoryAdapter(this, productCategoryList);
        productCatRecycler.setAdapter(productCategoryAdapter);
    }

}
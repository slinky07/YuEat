package com.slinky.yueat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    YuEatAdapter adapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setIds();
        setAdapter();
        setAdapterListener();
    }

    private void setIds() {
        listView = findViewById(R.id.category_LV);
    }

    private void setAdapter() {
        adapter = new YuEatAdapter(this, Database.foodData);
        listView.setAdapter(adapter);
    }

    private void setAdapterListener() {
        listView.setOnItemClickListener((adapterView, view, position, l) -> launchFoodListActivity(view, position));
    }

    /**
     * Launches FoodListActivity activity intent
     * @param view view
     * @param position position
     */
    public void launchFoodListActivity(View view, int position) {
        Database.setChosenCategoryName(Database.foodData.get(position).getName());
        startActivity(new Intent(this, FoodListActivity.class));
    }
}
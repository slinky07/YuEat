/*
package com.slinky.yueat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ListView;

import com.slinky.yueat.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    YuEatAdapter adapter;
    ListView listView;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        // setup binding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


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

    */
/**
     * Launches FoodListActivity activity intent
     *
     * @param view     view
     * @param position position
     *//*

    public void launchFoodListActivity(View view, int position) {
        Database.setChosenCategoryName(Database.foodData.get(position).getName());
        startActivity(new Intent(this, FoodListActivity.class));
    }

    private void setNavigationDrawer() {
        binding.navView.setNavigationItemSelectedListener(menuItem -> {
            // set item as selected to persist highlight
            menuItem.setChecked(true);
            // close drawer when item is tapped
            binding.drawerLayout.closeDrawers();

            // Add code here to update the UI based on the item selected
            // For example, swap UI fragments here
            switch (menuItem.getItemId()) {
                case R.id.foodMenu_ID:
                    break;
                case R.id.orders_ID:
                    startActivity(new Intent(this, CartActivity.class));
                    break;
            }
            return true;
        });
    }
}*/

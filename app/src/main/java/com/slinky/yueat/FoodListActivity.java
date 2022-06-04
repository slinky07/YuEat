package com.slinky.yueat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class FoodListActivity extends AppCompatActivity {
    ArrayAdapter<String> adapter;
    TextView totalPrice;
    Button seeCart;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);

        setIds();
        setListView();
        setTotalPrice();
        setSeeCartListener();
    }

    /**
     *  switch case for Database.foodData name to get nameData.
     *  this is setting the adapter for the listView. based on the name of the food.
     */
    private void getFood() {
        switch (Database.getChoosenCategoryName()){
            case "Burgers":
                adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
                for (int i = 0; i < Database.burgerData.size(); i++) {
                    adapter.add(Database.burgerData.get(i).getName());
                }
                break;
            case "Drinks":
                adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
                for (int i = 0; i < Database.drinkData.size(); i++) {
                    adapter.add(Database.drinkData.get(i).getName());
                }
                break;
            case "Fish":
                adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
                for (int i = 0; i < Database.fishData.size(); i++) {
                    adapter.add(Database.fishData.get(i).getName());
                }
                break;
            case "Jerky":
                adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
                for (int i = 0; i < Database.jerkyData.size(); i++) {
                    adapter.add(Database.jerkyData.get(i).getName());
                }
                break;
            case "Steak":
                adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
                for (int i = 0; i < Database.steakData.size(); i++) {
                    adapter.add(Database.steakData.get(i).getName());
                }
                break;
            case "Chicken":
                adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
                for (int i = 0; i < Database.chickenData.size(); i++) {
                    adapter.add(Database.chickenData.get(i).getName());
                }
                break;
            default:
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();

        }
    }


    private void setIds(){
        totalPrice = findViewById(R.id.total_TV_ID);
        seeCart = findViewById(R.id.cart_BTN_ID);
        listView = findViewById(R.id.food_LV_ID);
    }

    /**
     * set total price TextView
     */
    private void setTotalPrice(){
        String totalPriceString = "Total: " + Cart.getInstance().getTotalPrice();
        totalPrice.setText(totalPriceString);
    }

    private void setSeeCartListener() {
        seeCart.setOnClickListener(view -> launchCartActivity());
    }

    /**
     * set ListView based on switch-case adapter
     */
    private void setListView() {
        getFood();
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((adapterView, view, position, l) -> launchDetailActivity(view, position));
    }

    private void launchCartActivity() {
        Intent intent = new Intent(this, CartActivity.class);
        startActivity(intent);
    }

    private void launchDetailActivity(View view, int position) {
        Database.setChosenFoodName(adapter.getItem(position));

        Intent intent = new Intent(this, DetailActivity.class);
        startActivity(intent);

    }

}

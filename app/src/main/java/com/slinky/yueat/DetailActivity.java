package com.slinky.yueat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    TextView name;
    TextView description;
    TextView price;
    ImageView image;
    EditText quantity;
    Button addToCart;

    Cart cart = Cart.getInstance();

    Food theChosenOne; // chosen food fro, listview.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        setIds();
        getTheChosenOne();
        setItems();

        addToCart.setOnClickListener(view -> addToCart());

    }

    private void setIds(){
        name = findViewById(R.id.title_ID);
        description = findViewById(R.id.description_TV);
        price = findViewById(R.id.price_TV);
        image = findViewById(R.id.imageView);

        quantity = findViewById(R.id.quantity_ET);
        addToCart = findViewById(R.id.addToCart_BT);
    }

    /**
     * Gets the chosen food from the listview.
     */
    private void getTheChosenOne() {
        if (Database.getChosenFood() == null) {
            Toast.makeText(this, "Error: Meal Not Found", Toast.LENGTH_SHORT).show();
            cleanFinishMainActivity(); // go back to previous activity if meal not found.
        } else {
            theChosenOne = Database.getChosenFood();
        }
    }

    /**
     * Sets the items in the detail activity based on the chosen food.
     */
    private void setItems(){
        name.setText(theChosenOne.getName());
        description.setText(theChosenOne.getDescription());
        price.setText(String.valueOf(theChosenOne.getPrice()));
        image.setImageResource(theChosenOne.getImg());
    }

    /**
     * Adds the chosen food to the cart if the quantity is valid. try catch block to catch invalid input.
     */
    private void addToCart() {
        try {
            int quantity = Integer.parseInt(this.quantity.getText().toString());
            if (quantity > 0) {
            cart.addToCart(theChosenOne, quantity);
                Database.cart = quantity;
                Database.detailFinished = true;
            } else {
                Toast.makeText(this, "Please enter a valid quantity", Toast.LENGTH_LONG).show();
            }
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Please enter a valid quantity", Toast.LENGTH_LONG).show();
        }
        if (Database.detailFinished) {
           cleanFinishActivity();
        }
    }

    /**
     * unsure if this is needed.
     */
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    /**
     * Goes back to the previous activity.
     */
    private void cleanFinishMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        cleanFinish(intent);
    }

    /**
     * Goes back to the previous activity.
     */
    private void cleanFinishActivity() {
        Intent intent = new Intent(this, FoodListActivity.class);
        cleanFinish(intent);
    }

    /**
     * Goes back to the previous activity.
     */
    private void cleanFinish(Intent intent) {
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        finish();
        startActivity(intent);
    }
}

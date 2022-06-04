package com.slinky.yueat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class CartActivity extends AppCompatActivity {
    ListView listView;
    CartAdapter adapter;
    TextView total;
    Cart cart;
    Button clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        setIds();
        setListView();
        setTotal();
        setClearListener();
    }

    /**
     * Sets the ids of the views
     */
    private void setListView(){
        adapter = new CartAdapter(this, cart.getCart());
        listView.setAdapter(adapter);
    }


    private void setIds(){
        listView = findViewById(R.id.cart_LV);
        total = findViewById(R.id.total_TV_ID);
        cart = Cart.getInstance();
        clear = findViewById(R.id.clear_BTN_ID);
    }

    /**
     * Sets the total price of the cart
     */
    private void setTotal() {
        String totalPrice = "Total: " + cart.getTotalPrice();
        total.setText(totalPrice);
    }

    /**
     * Sets the clear button listener
     */
    private void setClearListener() {
        clear.setOnClickListener(view -> doClear());
    }

    /**
     * Clears the cart
     */
    private void doClear(){
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        cart.clearCart();
        setListView();
        setTotal();
    }
}

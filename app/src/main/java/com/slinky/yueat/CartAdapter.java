package com.slinky.yueat;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class CartAdapter extends BaseAdapter {
    Cart cart = Cart.getInstance();
    List<Cart.CartItem> cartList;
//    TextView itemName, itemQuantity, itemPrice, itemTotal;

    Context context;

    public CartAdapter(Context context, List<Cart.CartItem> cartList) {
        this.cartList = cartList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return cartList.size();
    }

    @Override
    public Object getItem(int pos) {
        return cartList.get(pos);
    }

    @Override
    public long getItemId(int pos) {
        return pos;
    }

    @Override
    public View getView(int pos, View view, ViewGroup viewGroup) {
        View newView = View.inflate(context, R.layout.cart_list_items, null);

//        setIds(newView);
//        setText(pos);

        TextView itemName = newView.findViewById(R.id.item_name_TV);
        TextView itemQuantity = newView.findViewById(R.id.num_TV);
        TextView itemPrice = newView.findViewById(R.id.monies_TV);
        TextView itemTotal = newView.findViewById(R.id.total_list_TV);

        itemName.setText(cartList.get(pos).getName());
        itemQuantity.setText(String.valueOf(cartList.get(pos).getQuantity()));
        itemPrice.setText(String.valueOf(cartList.get(pos).getPrice()));
        itemTotal.setText(String.valueOf(cartList.get(pos).getTotal()));

        return newView;
    }

 /*   private void setText(int pos) {
        itemName.setText(cartList.get(pos).getName());
        itemQuantity.setText(String.valueOf(cartList.get(pos).getQuantity()));
        itemPrice.setText(String.valueOf(cartList.get(pos).getPrice()));
        itemTotal.setText(String.valueOf(cartList.get(pos).getTotal()));
    }

    private void setIds(View view){
        itemName = view.findViewById(R.id.item_name_TV);
        itemQuantity = view.findViewById(R.id.num_TV);
        itemPrice = view.findViewById(R.id.monies_TV);
        itemTotal = view.findViewById(R.id.total_list_TV);
    }*/
}


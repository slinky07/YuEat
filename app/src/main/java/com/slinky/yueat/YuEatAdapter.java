package com.slinky.yueat;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class YuEatAdapter extends BaseAdapter {
    List<Food> data;
    Context context;

    public YuEatAdapter(Context context, List<Food> data){
        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int pos) {
        return data.get(pos);
    }

    @Override
    public long getItemId(int pos) {
        return pos;
    }

    @Override
    public View getView(int pos, View view, ViewGroup viewGroup) {
        View newView = View.inflate(context,R.layout.list_items, null);

        TextView tv_pizzaName = newView.findViewById(R.id.name_TV_ID);
        ImageView image = newView.findViewById(R.id.image_linear_ID);

        tv_pizzaName.setText(data.get(pos).getName());
        image.setImageResource(data.get(pos).getImg());

        return newView;
    }

}


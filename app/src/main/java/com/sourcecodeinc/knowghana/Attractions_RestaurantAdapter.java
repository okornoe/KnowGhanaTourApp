package com.sourcecodeinc.knowghana;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Attractions_RestaurantAdapter extends ArrayAdapter<ItemsOnListView> {
    public Attractions_RestaurantAdapter(@NonNull Activity context, ArrayList<ItemsOnListView> list_items) {
        super(context, 0, list_items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Checks if the existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.attraction_restaurant_items, parent,
                    false);

            ItemsOnListView currentItem = getItem(position);

            TextView attractionNameTextView = convertView.findViewById(R.id.attraction_name_text_view);
            attractionNameTextView.setText(currentItem.getAttractionName());
            attractionNameTextView.setTextSize(18);

            ImageView attractionImageView = convertView.findViewById(R.id.attraction_image);
            attractionImageView.setImageResource(currentItem.getImageResourceId());

        }
        return convertView;
    }
}

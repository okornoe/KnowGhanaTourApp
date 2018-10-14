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

public class HotelAdapter extends ArrayAdapter<ItemsOnListView> {
    public HotelAdapter(@NonNull Activity context, ArrayList<ItemsOnListView> list_items) {
        super(context, 0, list_items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Checks if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.hotel_layout, parent,
                    false);

            ItemsOnListView currentItem = getItem(position);

            TextView hotelNameTextView = listItemView.findViewById(R.id.hotel_name_text_view);
            hotelNameTextView.setText(currentItem.getHotelName());
            hotelNameTextView.setTextSize(18);

            TextView locationTextView = listItemView.findViewById(R.id.location_text_view);
            locationTextView.setText(currentItem.getLocation());
            locationTextView.setTextSize(18);

            TextView ratingTextView = listItemView.findViewById(R.id.rating_text_view);
            ratingTextView.setText(currentItem.getRatings());
            ratingTextView.setTextSize(18);

            ImageView hotelImageView = listItemView.findViewById(R.id.hotel_image);
            hotelImageView.setImageResource(currentItem.getImageResourceId());
        }
        return listItemView;
    }
}

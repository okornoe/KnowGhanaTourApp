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

public class ItemsOnListViewAdpater extends ArrayAdapter<ItemsOnListView> {

    public ItemsOnListViewAdpater(@NonNull Activity context, ArrayList<ItemsOnListView> list_items) {
        super(context, 0, list_items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Checks if the existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.items_on_list_view, parent,
                    false);
        }

        ItemsOnListView currentItem  = getItem(position);

        TextView regionNameTextView = convertView.findViewById(R.id.region_name_text_view);
        regionNameTextView.setText(currentItem.getRegionName());
        regionNameTextView.setTextSize(18);

        TextView regionalCapitalTextView = convertView.findViewById(R.id.region_capital_text_view);
        regionalCapitalTextView.setText(currentItem.getRegionCapital());
        regionalCapitalTextView.setTextSize(18);


        ImageView regionImageView = convertView.findViewById(R.id.region_image);

        if (currentItem.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            regionImageView.setImageResource(currentItem.getImageResourceId());
            // Make sure the view is visible
            regionImageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            regionImageView.setVisibility(View.GONE);
        }

        return convertView;
    }
}

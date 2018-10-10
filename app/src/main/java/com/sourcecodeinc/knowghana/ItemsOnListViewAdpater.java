package com.sourcecodeinc.knowghana;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
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
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.items_on_list_view, parent,
                    false);
        }

        ItemsOnListView currentItem  = getItem(position);

        TextView regionNameTextView = listItemView.findViewById(R.id.region_name_text_view);
        regionNameTextView.setText(currentItem.getRegionName());
        regionNameTextView.setTextSize(18);

        TextView regionalCapitalTextView = listItemView.findViewById(R.id.region_capital_text_view);
        regionalCapitalTextView.setText(currentItem.getRegionCapital());
        regionalCapitalTextView.setTextSize(18);

        return listItemView;
    }
}

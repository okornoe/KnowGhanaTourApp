package com.sourcecodeinc.knowghana;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view_layout, container, false);

        final ArrayList<ItemsOnListView> items = new ArrayList<ItemsOnListView>();
        items.add(new ItemsOnListView(getActivity().getString(R.string.auntie_annie), R.drawable.auntie_anne));
        items.add(new ItemsOnListView(getActivity().getString(R.string.burger_king), R.drawable.burger_king));
        items.add(new ItemsOnListView(getActivity().getString(R.string.dome), R.drawable.dome));
        items.add(new ItemsOnListView(getActivity().getString(R.string.hard_rock_cafe), R.drawable.hard_rock));
        items.add(new ItemsOnListView(getActivity().getString(R.string.olive_garden), R.drawable.olive_garden));
        items.add(new ItemsOnListView(getActivity().getString(R.string.perkins_restaurant), R.drawable.perkins));
        items.add(new ItemsOnListView(getActivity().getString(R.string.swift_restaurant), R.drawable.swift_restaurant));
        items.add(new ItemsOnListView(getActivity().getString(R.string.mckeown_restaurant), R.drawable.restaurants1));


        Attractions_RestaurantAdapter attractionsAdapter = new Attractions_RestaurantAdapter(getActivity(), items);

        ListView listView = rootView.findViewById(R.id.listView_layout);
        listView.setAdapter(attractionsAdapter);
        return rootView;

    }

}

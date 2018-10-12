package com.sourcecodeinc.knowghana;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelFragment extends Fragment {


    public HotelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view_layout, container, false);

        final ArrayList<ItemsOnListView> items = new ArrayList<ItemsOnListView>();
        items.add(new ItemsOnListView("Kempeksi Hotel",
                "Accra Central Business", "Five Star"));
        items.add(new ItemsOnListView("Kempeksi Hotel",
                "Accra Central Business", "Five Star"));
        items.add(new ItemsOnListView("Kempeksi Hotel",
                "Accra Central Business", "Five Star"));
        items.add(new ItemsOnListView("Kempeksi Hotel",
                "Accra Central Business", "Five Star"));
        items.add(new ItemsOnListView("Kempeksi Hotel",
                "Accra Central Business", "Five Star"));
        items.add(new ItemsOnListView("Kempeksi Hotel",
                "Accra Central Business", "Five Star"));
        items.add(new ItemsOnListView("Kempeksi Hotel",
                "Accra Central Business", "Five Star"));
        items.add(new ItemsOnListView("Kempeksi Hotel",
                "Accra Central Business", "Five Star"));
        items.add(new ItemsOnListView("Kempeksi Hotel",
                "Accra Central Business", "Five Star"));
        items.add(new ItemsOnListView("Kempeksi Hotel",
                "Accra Central Business", "Five Star"));
        HotelAdapter hotelAdapter = new HotelAdapter(getActivity(), items);

        ListView listView = rootView.findViewById(R.id.listView_layout);
        listView.setAdapter(hotelAdapter);
        return rootView;

    }


}

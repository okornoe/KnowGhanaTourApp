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
public class RegionFragment extends Fragment {


    public RegionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view_layout, container, false);

        final ArrayList<ItemsOnListView> items =  new ArrayList<ItemsOnListView>();
        items.add(new ItemsOnListView("Greater Accra Region", "Accra"));
        items.add(new ItemsOnListView("Central Region", "Cape Coast"));
        items.add(new ItemsOnListView("Western Region", "Takoradi"));
        items.add(new ItemsOnListView("Volta Region", "Ho"));
        items.add(new ItemsOnListView("Ashanti Region", "Kumasi"));
        items.add(new ItemsOnListView("Eastern Region", "Koforidua"));
        items.add(new ItemsOnListView("Brong Ahafo Region", "Sunyani"));
        items.add(new ItemsOnListView("Northern Region", "Tamale"));
        items.add(new ItemsOnListView("Upper West Region", "Wa"));
        items.add(new ItemsOnListView("Upper East Region", "Bolgatango"));
        ItemsOnListViewAdpater adapter = new ItemsOnListViewAdpater(getActivity(), items);

        ListView listView =  rootView.findViewById(R.id.listView_layout);
        listView.setAdapter(adapter);
        return rootView;

    }

}

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
public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view_layout, container, false);

        final ArrayList<ItemsOnListView> items = new ArrayList<ItemsOnListView>();
        items.add(new ItemsOnListView("Black Star Square"));
        items.add(new ItemsOnListView("Labadi Beach"));
        items.add(new ItemsOnListView("Elmina Castle"));
        items.add(new ItemsOnListView("Volta Lake"));
        items.add(new ItemsOnListView("Kakum National Park"));
        items.add(new ItemsOnListView("Mole National Park"));
        items.add(new ItemsOnListView("Kwame Nkrumah Mausoleum"));
        items.add(new ItemsOnListView("Cape Coast Castle"));
        items.add(new ItemsOnListView("James Town"));


        AttractionsAdapter attractionsAdapter = new AttractionsAdapter(getActivity(), items);

        ListView listView = rootView.findViewById(R.id.listView_layout);
        listView.setAdapter(attractionsAdapter);
        return rootView;

    }

}

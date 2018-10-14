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
        items.add(new ItemsOnListView("Black Star Square", R.drawable.black_star_square));
        items.add(new ItemsOnListView("Labadi Beach", R.drawable.labadi_pleasure_beach_hotel_accra));
        items.add(new ItemsOnListView("Elmina Castle", R.drawable.elmina_castle));
        items.add(new ItemsOnListView("Volta Lake", R.drawable.volta_lake));
        items.add(new ItemsOnListView("Kakum National Park", R.drawable.kakum_national_park));
        items.add(new ItemsOnListView("Mole National Park", R.drawable.mole_national_park));
        items.add(new ItemsOnListView("Kwame Nkrumah Mausoleum", R.drawable.kwame_nkrumah_mausoleum));
        items.add(new ItemsOnListView("James Town", R.drawable.jamestown_light_house__accra));


        AttractionsAdapter attractionsAdapter = new AttractionsAdapter(getActivity(), items);

        ListView listView = rootView.findViewById(R.id.listView_layout);
        listView.setAdapter(attractionsAdapter);
        return rootView;

    }

}

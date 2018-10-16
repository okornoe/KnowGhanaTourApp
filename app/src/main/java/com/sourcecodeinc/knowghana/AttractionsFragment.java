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
public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view_layout, container, false);

        final ArrayList<ItemsOnListView> items = new ArrayList<ItemsOnListView>();
        items.add(new ItemsOnListView(getActivity().getString(R.string.black_star_square), R.drawable.black_star_square));
        items.add(new ItemsOnListView(getActivity().getString(R.string.labadi_beach), R.drawable.labadi_pleasure_beach_hotel_accra));
        items.add(new ItemsOnListView(getActivity().getString(R.string.elmina_castle), R.drawable.elmina_castle));
        items.add(new ItemsOnListView(getActivity().getString(R.string.volta_lake), R.drawable.volta_lake));
        items.add(new ItemsOnListView(getActivity().getString(R.string.kakum_national_park), R.drawable.kakum_national_park));
        items.add(new ItemsOnListView(getActivity().getString(R.string.mole_national_park), R.drawable.mole_national_park));
        items.add(new ItemsOnListView(getActivity().getString(R.string.kwame_nkrumah_mausoleum), R.drawable.kwame_nkrumah_mausoleum));
        items.add(new ItemsOnListView(getActivity().getString(R.string.james_town), R.drawable.jamestown_light_house__accra));


        Attractions_RestaurantAdapter attractionsAdapter = new Attractions_RestaurantAdapter(getActivity(), items);

        ListView listView = rootView.findViewById(R.id.listView_layout);
        listView.setAdapter(attractionsAdapter);
        return rootView;

    }

}

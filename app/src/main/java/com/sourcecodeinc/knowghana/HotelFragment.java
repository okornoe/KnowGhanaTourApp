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
public class HotelFragment extends Fragment {


    public HotelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view_layout, container, false);

        final ArrayList<ItemsOnListView> items = new ArrayList<ItemsOnListView>();
        items.add(new ItemsOnListView(getActivity().getString(R.string.kempeski_hotel),
                getActivity().getString(R.string.accra_central_business), getActivity().getString(R.string.five_star), R.drawable.kempeski_hotel));
        items.add(new ItemsOnListView(getActivity().getString(R.string.holiday_inn_hotel),
                getActivity().getString(R.string.airport_city), getActivity().getString(R.string.four_star), R.drawable.holiday_inn_hotel));
        items.add(new ItemsOnListView(getActivity().getString(R.string.best_western_hotel),
                getActivity().getString(R.string.accra_central_business), getActivity().getString(R.string.three_star), R.drawable.best_western_hotel));
        items.add(new ItemsOnListView(getActivity().getString(R.string.airport_hotel),
                getActivity().getString(R.string.accra_central_business), getActivity().getString(R.string.three_star), R.drawable.airport_hotel));
        items.add(new ItemsOnListView(getActivity().getString(R.string.villa_gio_hotel),
                getActivity().getString(R.string.accra_central_business), getActivity().getString(R.string.five_star), R.drawable.villa_gio_hotel));
        items.add(new ItemsOnListView(getActivity().getString(R.string.tang_palace_hotel),
                getActivity().getString(R.string.roman_ridge), getActivity().getString(R.string.four_star), R.drawable.tang_palace_hotel));
        items.add(new ItemsOnListView(getActivity().getString(R.string.novotel_hotel),
                getActivity().getString(R.string.barnes_road), getActivity().getString(R.string.three_star), R.drawable.novotel));
        items.add(new ItemsOnListView(getActivity().getString(R.string.la_palm_royal_beach_hotel),
                getActivity().getString(R.string.labadi), getActivity().getString(R.string.five_star), R.drawable.labadi_pleasure_beach_hotel_accra));
        items.add(new ItemsOnListView(getActivity().getString(R.string.movenpick_hotel),
                getActivity().getString(R.string.airport_city), getActivity().getString(R.string.five_star), R.drawable.novotel));
        HotelAdapter hotelAdapter = new HotelAdapter(getActivity(), items);

        ListView listView = rootView.findViewById(R.id.listView_layout);
        listView.setAdapter(hotelAdapter);
        return rootView;

    }


}

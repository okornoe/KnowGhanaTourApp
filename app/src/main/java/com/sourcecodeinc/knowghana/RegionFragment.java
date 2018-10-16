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
public class RegionFragment extends Fragment {


    public RegionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view_layout, container, false);

        final ArrayList<ItemsOnListView> items =  new ArrayList<ItemsOnListView>();
        items.add(new ItemsOnListView(getActivity().getString(R.string.greater_accra_region), getActivity().getString(R.string.greater_accra_region)));
        items.add(new ItemsOnListView(getActivity().getString(R.string.central_region), getActivity().getString(R.string.central_capital)));
        items.add(new ItemsOnListView(getActivity().getString(R.string.western_region), getActivity().getString(R.string.western_capital)));
        items.add(new ItemsOnListView(getActivity().getString(R.string.volta_region), getActivity().getString(R.string.volta_capital), R.drawable.ho_region));
        items.add(new ItemsOnListView(getActivity().getString(R.string.ashanti_region), getActivity().getString(R.string.ashanti_capital)));
        items.add(new ItemsOnListView(getActivity().getString(R.string.eastern_region), getActivity().getString(R.string.eastern_capital)));
        items.add(new ItemsOnListView(getActivity().getString(R.string.brong_ahafo_region), getActivity().getString(R.string.brong_ahafo_capital)));
        items.add(new ItemsOnListView(getActivity().getString(R.string.northern_region), getActivity().getString(R.string.northern_capital)));
        items.add(new ItemsOnListView(getActivity().getString(R.string.upper_west_region), getActivity().getString(R.string.upper_west_capital)));
        items.add(new ItemsOnListView(getActivity().getString(R.string.upper_east_region), getActivity().getString(R.string.upper_east_capital)));
        ItemsOnListViewAdpater adapter = new ItemsOnListViewAdpater(getActivity(), items);

        ListView listView =  rootView.findViewById(R.id.listView_layout);
        listView.setAdapter(adapter);
        return rootView;

    }

}

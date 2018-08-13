package com.appsdj.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodFragment extends Fragment {

    public FoodFragment() {
        // Empty public constructor required
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        // Add new items in the list of Attractions
        attractions.add(new Attraction("Zizzi", "Amazing pizza and pasta",
                "Liverpool One", "6 Wall St, Liverpool L1 8JQ", "0151 655 1002", R.drawable.zizzi_logo));
        attractions.add(new Attraction("Cozy Club", "McDonald's posh alternative",
                "Liverpool One", "8 Wall St, Liverpool L1 8JQ", "0151 655 1004", R.drawable.cosy_club_logo));
        attractions.add(new Attraction("Yeh Rah", "Fantastic Thai cusine",
                "Liverpool One", "7 Wall St, Liverpool L1 8JQ", "0151 655 1003", R.drawable.yee_logo));
        attractions.add(new Attraction("Wagamama", "Delicious Chinese food",
                "Liverpool One", "5 Wall St, Liverpool L1 8JQ", "0151 655 1001", R.drawable.wagamama_logo));

        // create the adapter which will handle the list of attractions
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_food, R.color.food_background);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
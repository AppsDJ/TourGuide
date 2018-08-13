package com.appsdj.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class DrinkFragment extends Fragment {

    public DrinkFragment() {
        // Empty public constructor required
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        // Add new items in the list of Attractions
        attractions.add(new Attraction("Berry and Rye", "Great cocktails · Cosy · Casual",
                "Unit 17, Albert Dock", "Liverpool, L3 4AF", "07305 079675", R.drawable.berry_and_rye));
        attractions.add(new Attraction("Be At One Liverpool", "Lively bar for spicy cocktails",
                "11-13 Seel St", "Liverpool, L1 4AU", "0151 203 6101", R.drawable.be_at_one));
        attractions.add(new Attraction("Revolución de Cuba Liverpool", "Authentic Cuban experience",
                "48 Berry St", "Liverpool, L1 4JQ", "0151 203 1152", R.drawable.revolucion_cuba));
        attractions.add(new Attraction("Cavern Pub", "Drink where Beatles launched",
                "10 Mathew St", "Liverpool, L2 6RE", "0151 656 1004", R.drawable.cavern_pub));

        // create the adapter which will handle the list of attractions
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_drink, R.color.drink_background);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}

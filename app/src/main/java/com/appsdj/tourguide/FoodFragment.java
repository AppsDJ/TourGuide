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

        // get attraction details from string resources in array format to retrieve:
        // attractation name, description, address line 1, address line 2, telephone no.
        String[] zizzi = getResources().getStringArray(R.array.zizzi);
        String[] cozyClub = getResources().getStringArray(R.array.cozy_club);
        String[] yehRah = getResources().getStringArray(R.array.yeh_rah);
        String[] wagamama = getResources().getStringArray(R.array.wagamama);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        // Add new items in the list of Attractions
        attractions.add(new Attraction(zizzi[0], zizzi[1],
                zizzi[2], zizzi[3], zizzi[4], R.drawable.zizzi_logo));
        attractions.add(new Attraction(cozyClub[0], cozyClub[1],
                cozyClub[2], cozyClub[3], cozyClub[4], R.drawable.cosy_club_logo));
        attractions.add(new Attraction(yehRah[0], yehRah[1],
                yehRah[2], yehRah[3], yehRah[4], R.drawable.yee_logo));
        attractions.add(new Attraction(wagamama[0], wagamama[1],
                wagamama[2], wagamama[3], wagamama[4], R.drawable.wagamama_logo));

        // create the adapter which will handle the list of attractions
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_food, R.color.food_background);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
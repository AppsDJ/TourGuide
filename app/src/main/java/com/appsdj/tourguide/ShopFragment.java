package com.appsdj.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ShopFragment extends Fragment {

    public ShopFragment() {
        // Empty public constructor required
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        // Add new items in the list of Attractions
        attractions.add(new Attraction("MetQarter", "Fashion, Beauty & Food",
                "35 Whitechapel", "Liverpool, L1 6DA", "0151 645 4456", R.drawable.metqarter));
        attractions.add(new Attraction("Liverpool One", "All-in-one shopping trip",
                "88 - 90 Paradise Street", "Liverpool, L1 8JQ", "0151 644 1001", R.drawable.liverpool_one));
        attractions.add(new Attraction("Liverpool City Centre", "You name it, it's there!",
                "Church Street", "Liverpool, L1 4TQ", "0151 656 5435", R.drawable.liverpool_city_centre));
        attractions.add(new Attraction("Bold Street", "Shop for classics and vintage",
                "Bold Street", "Liverpool, L1 9JL", "0151 688 2316", R.drawable.bold_street));

        // create the adapter which will handle the list of attractions
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_shop, R.color.shop_background);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
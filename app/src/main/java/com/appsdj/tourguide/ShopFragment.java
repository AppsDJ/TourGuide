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

        // get attraction details from string resources in array format to retrieve:
        // attractation name, description, address line 1, address line 2, telephone no.
        String[] metQarter = getResources().getStringArray(R.array.met_qarter);
        String[] livOne = getResources().getStringArray(R.array.liv_one);
        String[] livCity = getResources().getStringArray(R.array.liv_city);
        String[] boldSt = getResources().getStringArray(R.array.bold_st);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        // Add new items in the list of Attractions
        attractions.add(new Attraction(metQarter[0], metQarter[1],
                metQarter[2], metQarter[3], metQarter[4], R.drawable.metqarter));
        attractions.add(new Attraction(livOne[0], livOne[1],
                livOne[2], livOne[3], livOne[4], R.drawable.liverpool_one));
        attractions.add(new Attraction(livCity[0], livCity[1],
                livCity[2], livCity[3], livCity[4], R.drawable.liverpool_city_centre));
        attractions.add(new Attraction(boldSt[0], boldSt[1],
                boldSt[2], boldSt[3], boldSt[4], R.drawable.bold_street));


        // create the adapter which will handle the list of attractions
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_shop, R.color.shop_background);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
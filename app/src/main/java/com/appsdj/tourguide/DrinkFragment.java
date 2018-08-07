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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        attractions.add(new Attraction("Wagamama", "Delicious Chinese food","Liverpool One", "5 Wall St, Liverpool L1 8JQ", "0151 655 1001"));
        attractions.add(new Attraction("Zizzi", "Amazing pizza and pasta", "Liverpool One", "5 Wall St, Liverpool L1 8JQ", "0151 655 1002"));
        attractions.add(new Attraction("Yeh Rah", "Fantastic Thai and Asian cusine", "Liverpool One", "5 Wall St, Liverpool L1 8JQ", "0151 655 1003"));
        attractions.add(new Attraction("McDonald's", "Last resort stomach filler", "Liverpool One", "5 Wall St, Liverpool L1 8JQ", "0151 655 1004"));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_drink);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

//        // Set a click listener to play the audio when the list item is clicked on
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//
//                // Get the Attraction object at the particular position clicked
//                Attraction attraction = attractions.get(position);
//            }
//        });

        return rootView;
    }
}

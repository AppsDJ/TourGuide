package com.appsdj.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FunFragment extends Fragment {

    public FunFragment() {
        // Empty public constructor required
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        // Add new items in the list of Attractions
        attractions.add(new Attraction("Imax Cinema, Odeon", "Amazing 3D cinema viewing",
                "Liverpool One", "25 Wall St, Liverpool L1 8JQ", "0151 656 1334", R.drawable.odeon_imax));
        attractions.add(new Attraction("Yellow Sub", "A Liverpool amusement center",
                "Brunswick Business Park", "Atlantic Way, Liverpool L3 4BE", "0844 412 0850", R.drawable.yellow_sub));
        attractions.add(new Attraction("VR-HERE", "Video arcade in Liverpool",
                "31 Paul St", "Liverpool, L3 6DX", "0151 695 1887", R.drawable.vr_here));
        attractions.add(new Attraction("Fun Casino Royale", "Corporate entertainment fun",
                "180 James St", "Liverpool L1 3RQ", "0151 657 2332", R.drawable.fun_casino));

        // create the adapter which will handle the list of attractions
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_fun, R.color.fun_background);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}

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

        // get attraction details from string resources in array format to retrieve:
        // attractation name, description, address line 1, address line 2, telephone no.
        String[] imaxCinema = getResources().getStringArray(R.array.imax_cinema);
        String[] yellowSub = getResources().getStringArray(R.array.yellow_sub);
        String[] vrHere = getResources().getStringArray(R.array.vr_here);
        String[] casino = getResources().getStringArray(R.array.casino);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        // Add new items in the list of Attractions
        attractions.add(new Attraction(imaxCinema[0], imaxCinema[1],
                imaxCinema[2], imaxCinema[3], imaxCinema[4], R.drawable.odeon_imax));
        attractions.add(new Attraction(yellowSub[0], yellowSub[1],
                yellowSub[2], yellowSub[2], yellowSub[4], R.drawable.yellow_sub));
        attractions.add(new Attraction(vrHere[0], vrHere[1],
                vrHere[2], vrHere[3], vrHere[4], R.drawable.vr_here));
        attractions.add(new Attraction(casino[0], casino[1],
                casino[2], casino[3], casino[4], R.drawable.fun_casino));

        // create the adapter which will handle the list of attractions
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_fun, R.color.fun_background);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}

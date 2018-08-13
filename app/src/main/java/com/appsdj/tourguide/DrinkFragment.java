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

        // get attraction details from string resources in array format to retrieve:
        // attractation name, description, address line 1, address line 2, telephone no.
        String[] berry = getResources().getStringArray(R.array.berry);
        String[] beAtOne = getResources().getStringArray(R.array.be_at_one);
        String[] revolucion = getResources().getStringArray(R.array.revolucion);
        String[] casino = getResources().getStringArray(R.array.cavern);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        // Add new items in the list of Attractions
        attractions.add(new Attraction(berry[0], berry[1],
                berry[2], berry[3], berry[4], R.drawable.berry_and_rye));
        attractions.add(new Attraction(beAtOne[0], beAtOne[1],
                beAtOne[2], beAtOne[3], beAtOne[4], R.drawable.be_at_one));
        attractions.add(new Attraction(revolucion[0], revolucion[1],
                revolucion[2], revolucion[3], revolucion[4], R.drawable.revolucion_cuba));
        attractions.add(new Attraction(casino[0], casino[1],
                casino[2], casino[3], casino[4], R.drawable.cavern_pub));

        // create the adapter which will handle the list of attractions
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_drink, R.color.drink_background);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}

package com.appsdj.tourguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AttractionAdapter extends ArrayAdapter<Attraction> {

    private int mColourResourceID;
    private int mBackgroundColorID;

    public AttractionAdapter(Activity context, ArrayList<Attraction> attractions, int colourResourceID, int backgroundColorID) {
        super(context, 0, attractions);
        mColourResourceID = colourResourceID;
        mBackgroundColorID = backgroundColorID;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // if the existing view is not reused, inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Attraction currentAttraction = getItem(position);

        /*
         * Find the respective views in the list_item.xml and set their corresponding values
         */
        ((TextView) listItemView.findViewById(R.id.attraction_name_text_view)).setText(currentAttraction.getmAttractionName());

        ((TextView) listItemView.findViewById(R.id.attraction_description_text_view)).setText(currentAttraction.getmAttractionDescription());

        ((TextView) listItemView.findViewById(R.id.attraction_address_line1_text_view)).setText(currentAttraction.getmAttractionAddress1());

        ((TextView) listItemView.findViewById(R.id.attraction_address_line2_text_view)).setText(currentAttraction.getmAttractionAddress2());

        ((TextView) listItemView.findViewById(R.id.attraction_telephone_text_view)).setText(currentAttraction.getmTelephonNO());


        ImageView imageView = (ImageView) listItemView.findViewById(R.id.attraction_image);
        imageView.setImageResource(currentAttraction.getImageResourceID());

        /* retrieve the image of an attraction and set its bg. color to be the same as
         * its description bg. color
         */
        int imageBackgroundColor = ContextCompat.getColor(getContext(), mBackgroundColorID);
        imageView.setBackgroundColor(imageBackgroundColor);

        View textContainer = listItemView.findViewById(R.id.attraction_details_container);

        int color = ContextCompat.getColor(getContext(), mColourResourceID);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}

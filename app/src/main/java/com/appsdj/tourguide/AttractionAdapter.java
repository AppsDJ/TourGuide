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

    public AttractionAdapter(Activity context, ArrayList<Attraction> attractions, int colourResourceID) {

        super(context, 0, attractions);
        mColourResourceID = colourResourceID;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Attraction currentAttraction = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView attractionName = (TextView) listItemView.findViewById(R.id.attraction_name_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        attractionName.setText(currentAttraction.getmAttractionName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView attractionDescription = (TextView) listItemView.findViewById(R.id.attraction_description_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        attractionDescription.setText(currentAttraction.getmAttractionDescription());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView addressLine1TextView = (TextView) listItemView.findViewById(R.id.attraction_address_line1_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        addressLine1TextView.setText(currentAttraction.getmAttractionAddress1());
        // Find the TextView in the list_item.xml layout with the ID version_number

        TextView addressLine2TextView = (TextView) listItemView.findViewById(R.id.attraction_address_line2_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        addressLine2TextView.setText(currentAttraction.getmAttractionAddress2());

        TextView telephonNOTextView = (TextView) listItemView.findViewById(R.id.attraction_telephone_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        telephonNOTextView.setText(currentAttraction.getmTelephonNO());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.attraction_image);

        if (currentAttraction.hasImage()) {
            imageView.setImageResource(currentAttraction.getImageResourceID());
            // make sure the image is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // otherwise make sure image is not visible (GONE so no space left by absence)
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.attraction_details_container);

        int color = ContextCompat.getColor(getContext(), mColourResourceID);

        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}

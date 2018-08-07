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

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColourResourceID;

    public WordAdapter(Activity context, ArrayList<Word> words, int colourResourceID) {

        super(context, 0, words);
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

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.attraction_name_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        miwokTextView.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.attraction_description_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        defaultTextView.setText(currentWord.getDefaulTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.attraction_image);

        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageResourceID());
            // make sure the image is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // otherwise make sure image is not visible (GONE so no space left by absence)
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.attraction_details_container);

        int color = ContextCompat.getColor(getContext(), mColourResourceID);

        textContainer.setBackgroundColor(color);


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}

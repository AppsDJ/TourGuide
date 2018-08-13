package com.appsdj.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ShopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        // get corresponding fragment to be displayed in container layout for activity
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new ShopFragment())
                .commit();
    }
}

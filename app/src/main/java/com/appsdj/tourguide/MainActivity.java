package com.appsdj.tourguide;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // get viewpager used for sliding between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // get category adapter that will retrieve corresponding fragments
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager());

        // set the adapter for the viewpager
        viewPager.setAdapter(adapter);

        // get the tab layout that will be the type of display used
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        // make use of viewpager within the tab layout
        tabLayout.setupWithViewPager(viewPager);
    }
}
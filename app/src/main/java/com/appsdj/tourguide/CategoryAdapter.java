package com.appsdj.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context context;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    // return the fragment at a particular position corresponding to an activity
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FoodFragment();
        } else if (position == 1) {
            return new DrinkFragment();
        } else if (position == 2) {
            return new ShopFragment();
        } else {
            return new FunFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.category_food);
        } else if (position == 1) {
            return context.getString(R.string.category_drink);
        } else if (position == 2) {
            return context.getString(R.string.category_shop);
        } else {
            return context.getString(R.string.category_fun);
        }
    }
}

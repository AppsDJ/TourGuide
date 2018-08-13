package com.appsdj.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    // return the fragment at a paticular position corresponding to an activity
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
            return mContext.getString(R.string.category_food);
        } else if (position == 1) {
            return mContext.getString(R.string.category_drink);
        } else if (position == 2) {
            return mContext.getString(R.string.category_shop);
        } else {
            return mContext.getString(R.string.category_fun);
        }
    }
}

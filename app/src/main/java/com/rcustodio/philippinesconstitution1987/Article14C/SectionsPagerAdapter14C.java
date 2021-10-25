package com.rcustodio.philippinesconstitution1987.Article14C;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.rcustodio.philippinesconstitution1987.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter14C extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{
            R.string.article_14_C_tab_text_10,
            R.string.article_14_C_tab_text_11,
            R.string.article_14_C_tab_text_12,
            R.string.article_14_C_tab_text_13};
    private final Context mContext;

    public SectionsPagerAdapter14C(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;

        switch (position)
        {
            case 0:
                fragment = new Article14Csection10Fragment();
                break;
            case 1:
                fragment = new Article14Csection11Fragment();
                break;
            case 2:
                fragment = new Article14Csection12Fragment();
                break;
            case 3:
                fragment = new Article14Csection13Fragment();
                break;
        }
        return  fragment;

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 4;
    }
}
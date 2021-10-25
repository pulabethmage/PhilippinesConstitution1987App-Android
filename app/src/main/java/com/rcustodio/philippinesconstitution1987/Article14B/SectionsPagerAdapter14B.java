package com.rcustodio.philippinesconstitution1987.Article14B;

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
public class SectionsPagerAdapter14B extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{
            R.string.article_14_B_tab_text_6,
            R.string.article_14_B_tab_text_7,
            R.string.article_14_B_tab_text_8,
            R.string.article_14_B_tab_text_9};
    private final Context mContext;

    public SectionsPagerAdapter14B(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;

        switch (position)
        {
            case 0:
                fragment = new Article14Bsection6Fragment();
                break;
            case 1:
                fragment = new Article14Bsection7Fragment();
                break;
            case 2:
                fragment = new Article14Bsection8Fragment();
                break;
            case 3:
                fragment = new Article14Bsection9Fragment();
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
package com.rcustodio.philippinesconstitution1987.Article09C;

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
public class SectionsPagerAdapter9C extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{
            R.string.article_9_C_tab_text_1,
            R.string.article_9_C_tab_text_2,
            R.string.article_9_C_tab_text_3,
            R.string.article_9_C_tab_text_4,
            R.string.article_9_C_tab_text_5,
            R.string.article_9_C_tab_text_6,
            R.string.article_9_C_tab_text_7,
            R.string.article_9_C_tab_text_8,
            R.string.article_9_C_tab_text_9,
            R.string.article_9_C_tab_text_10,
            R.string.article_9_C_tab_text_11};
    private final Context mContext;

    public SectionsPagerAdapter9C(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;

        switch (position)
        {
            case 0:
                fragment = new Article9Csection1Fragment();
                break;
            case 1:
                fragment = new Article9Csection2Fragment();
                break;
            case 2:
                fragment = new Article9Csection3Fragment();
                break;
            case 3:
                fragment = new Article9Csection4Fragment();
                break;
            case 4:
                fragment = new Article9Csection5Fragment();
                break;
            case 5:
                fragment = new Article9Csection6Fragment();
                break;
            case 6:
                fragment = new Article9Csection7Fragment();
                break;
            case 7:
                fragment = new Article9Csection8Fragment();
                break;
            case 8:
                fragment = new Article9Csection9Fragment();
                break;
            case 9:
                fragment = new Article9Csection10Fragment();
                break;
            case 10:
                fragment = new Article9Csection11Fragment();
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
        return 11;
    }
}
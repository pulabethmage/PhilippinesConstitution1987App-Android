package com.rcustodio.philippinesconstitution1987.Article09B;

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
public class SectionsPagerAdapter9B extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{
            R.string.article_9_B_tab_text_1,
            R.string.article_9_B_tab_text_2,
            R.string.article_9_B_tab_text_3,
            R.string.article_9_B_tab_text_4,
            R.string.article_9_B_tab_text_5,
            R.string.article_9_B_tab_text_6,
            R.string.article_9_B_tab_text_7,
            R.string.article_9_B_tab_text_8};
    private final Context mContext;

    public SectionsPagerAdapter9B(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;

        switch (position)
        {
            case 0:
                fragment = new Article9Bsection1Fragment();
                break;
            case 1:
                fragment = new Article9Bsection2Fragment();
                break;
            case 2:
                fragment = new Article9Bsection3Fragment();
                break;
            case 3:
                fragment = new Article9Bsection4Fragment();
                break;
            case 4:
                fragment = new Article9Bsection5Fragment();
                break;
            case 5:
                fragment = new Article9Bsection6Fragment();
                break;
            case 6:
                fragment = new Article9Bsection7Fragment();
                break;
            case 7:
                fragment = new Article9Bsection8Fragment();
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
        return 8;
    }
}
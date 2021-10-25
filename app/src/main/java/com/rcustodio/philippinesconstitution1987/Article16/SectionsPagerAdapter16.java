package com.rcustodio.philippinesconstitution1987.Article16;

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
public class SectionsPagerAdapter16 extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{
            R.string.article_16_tab_text_1,
            R.string.article_16_tab_text_2,
            R.string.article_16_tab_text_3,
            R.string.article_16_tab_text_4,
            R.string.article_16_tab_text_5,
            R.string.article_16_tab_text_6,
            R.string.article_16_tab_text_7,
            R.string.article_16_tab_text_8,
            R.string.article_16_tab_text_9,
            R.string.article_16_tab_text_10,
            R.string.article_16_tab_text_11,
            R.string.article_16_tab_text_12};
    private final Context mContext;

    public SectionsPagerAdapter16(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;

        switch (position)
        {
            case 0:
                fragment = new Article16section1Fragment();
                break;
            case 1:
                fragment = new Article16section2Fragment();
                break;
            case 2:
                fragment = new Article16section3Fragment();
                break;
            case 3:
                fragment = new Article16section4Fragment();
                break;
            case 4:
                fragment = new Article16section5Fragment();
                break;
            case 5:
                fragment = new Article16section6Fragment();
                break;
            case 6:
                fragment = new Article16section7Fragment();
                break;
            case 7:
                fragment = new Article16section8Fragment();
                break;
            case 8:
                fragment = new Article16section9Fragment();
                break;
            case 9:
                fragment = new Article16section10Fragment();
                break;
            case 10:
                fragment = new Article16section11Fragment();
                break;
            case 11:
                fragment = new Article16section12Fragment();
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
        return 12;
    }
}
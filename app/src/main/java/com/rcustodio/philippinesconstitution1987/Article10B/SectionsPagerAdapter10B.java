package com.rcustodio.philippinesconstitution1987.Article10B;

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
public class SectionsPagerAdapter10B extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{
            R.string.article_10_B_tab_text_15,
            R.string.article_10_B_tab_text_16,
            R.string.article_10_B_tab_text_17,
            R.string.article_10_B_tab_text_18,
            R.string.article_10_B_tab_text_19,
            R.string.article_10_B_tab_text_20,
            R.string.article_10_B_tab_text_21};
    private final Context mContext;

    public SectionsPagerAdapter10B(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;

        switch (position)
        {
            case 0:
                fragment = new Article10Bsection1Fragment();
                break;
            case 1:
                fragment = new Article10Bsection2Fragment();
                break;
            case 2:
                fragment = new Article10Bsection3Fragment();
                break;
            case 3:
                fragment = new Article10Bsection4Fragment();
                break;
            case 4:
                fragment = new Article10Bsection5Fragment();
                break;
            case 5:
                fragment = new Article10Bsection6Fragment();
                break;
            case 6:
                fragment = new Article10Bsection7Fragment();
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
        return 7;
    }
}
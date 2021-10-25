package com.rcustodio.philippinesconstitution1987.Article14D;

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
public class SectionsPagerAdapter14D extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{
            R.string.article_14_D_tab_text_14,
            R.string.article_14_D_tab_text_15,
            R.string.article_14_D_tab_text_16,
            R.string.article_14_D_tab_text_17,
            R.string.article_14_D_tab_text_18};
    private final Context mContext;

    public SectionsPagerAdapter14D(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;

        switch (position)
        {
            case 0:
                fragment = new Article14Dsection14Fragment();
                break;
            case 1:
                fragment = new Article14Dsection15Fragment();
                break;
            case 2:
                fragment = new Article14Dsection16Fragment();
                break;
            case 3:
                fragment = new Article14Dsection17Fragment();
                break;
            case 4:
                fragment = new Article14Dsection18Fragment();
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
        return 5;
    }
}
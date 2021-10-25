package com.rcustodio.philippinesconstitution1987.Article15;

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
public class SectionsPagerAdapter15 extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{
            R.string.article_15_tab_text_1,
            R.string.article_15_tab_text_2,
            R.string.article_15_tab_text_3,
            R.string.article_15_tab_text_4};
    private final Context mContext;

    public SectionsPagerAdapter15(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;

        switch (position)
        {
            case 0:
                fragment = new Article15section1Fragment();
                break;
            case 1:
                fragment = new Article15section2Fragment();
                break;
            case 2:
                fragment = new Article15section3Fragment();
                break;
            case 3:
                fragment = new Article15section4Fragment();
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
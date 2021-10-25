package com.rcustodio.philippinesconstitution1987.Article04;

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
public class SectionsPagerAdapter4 extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{
            R.string.article_3_tab_text_1,
            R.string.article_3_tab_text_2,
            R.string.article_3_tab_text_3,
            R.string.article_3_tab_text_4,
            R.string.article_3_tab_text_5};
    private final Context mContext;

    public SectionsPagerAdapter4(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;

        switch (position)
        {
            case 0:
                fragment = new Article4section1Fragment();
                break;
            case 1:
                fragment = new Article4section2Fragment();
                break;
            case 2:
                fragment = new Article4section3Fragment();
                break;
            case 3:
                fragment = new Article4section4Fragment();
                break;
            case 4:
                fragment = new Article4section5Fragment();
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
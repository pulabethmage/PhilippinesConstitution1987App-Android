package com.rcustodio.philippinesconstitution1987.Article12;

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
public class SectionsPagerAdapter12 extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{
            R.string.article_12_tab_text_1,
            R.string.article_12_tab_text_2,
            R.string.article_12_tab_text_3,
            R.string.article_12_tab_text_4,
            R.string.article_12_tab_text_5,
            R.string.article_12_tab_text_6,
            R.string.article_12_tab_text_7,
            R.string.article_12_tab_text_8,
            R.string.article_12_tab_text_9,
            R.string.article_12_tab_text_10,
            R.string.article_12_tab_text_11,
            R.string.article_12_tab_text_12,
            R.string.article_12_tab_text_13,
            R.string.article_12_tab_text_14,
            R.string.article_12_tab_text_15,
            R.string.article_12_tab_text_16,
            R.string.article_12_tab_text_17,
            R.string.article_12_tab_text_18,
            R.string.article_12_tab_text_19,
            R.string.article_12_tab_text_20,
            R.string.article_12_tab_text_21,
            R.string.article_12_tab_text_22};
    private final Context mContext;

    public SectionsPagerAdapter12(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;

        switch (position)
        {
            case 0:
                fragment = new Article12section1Fragment();
                break;
            case 1:
                fragment = new Article12section2Fragment();
                break;
            case 2:
                fragment = new Article12section3Fragment();
                break;
            case 3:
                fragment = new Article12section4Fragment();
                break;
            case 4:
                fragment = new Article12section5Fragment();
                break;
            case 5:
                fragment = new Article12section6Fragment();
                break;
            case 6:
                fragment = new Article12section7Fragment();
                break;
            case 7:
                fragment = new Article12section8Fragment();
                break;
            case 8:
                fragment = new Article12section9Fragment();
                break;
            case 9:
                fragment = new Article12section10Fragment();
                break;
            case 10:
                fragment = new Article12section11Fragment();
                break;
            case 11:
                fragment = new Article12section12Fragment();
                break;
            case 12:
                fragment = new Article12section13Fragment();
                break;
            case 13:
                fragment = new Article12section14Fragment();
                break;
            case 14:
                fragment = new Article12section15Fragment();
                break;
            case 15:
                fragment = new Article12section16Fragment();
                break;
            case 16:
                fragment = new Article12section17Fragment();
                break;
            case 17:
                fragment = new Article12section18Fragment();
                break;
            case 18:
                fragment = new Article12section19Fragment();
                break;
            case 19:
                fragment = new Article12section20Fragment();
                break;
            case 20:
                fragment = new Article12section21Fragment();
                break;
            case 21:
                fragment = new Article12section22Fragment();
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
        return 22;
    }
}
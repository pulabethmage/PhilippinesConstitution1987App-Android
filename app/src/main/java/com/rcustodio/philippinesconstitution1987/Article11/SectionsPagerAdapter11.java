package com.rcustodio.philippinesconstitution1987.Article11;

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
public class SectionsPagerAdapter11 extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{
            R.string.article_11_tab_text_1,
            R.string.article_11_tab_text_2,
            R.string.article_11_tab_text_3,
            R.string.article_11_tab_text_4,
            R.string.article_11_tab_text_5,
            R.string.article_11_tab_text_6,
            R.string.article_11_tab_text_7,
            R.string.article_11_tab_text_8,
            R.string.article_11_tab_text_9,
            R.string.article_11_tab_text_10,
            R.string.article_11_tab_text_11,
            R.string.article_11_tab_text_12,
            R.string.article_11_tab_text_13,
            R.string.article_11_tab_text_14,
            R.string.article_11_tab_text_15,
            R.string.article_11_tab_text_16,
            R.string.article_11_tab_text_17,
            R.string.article_11_tab_text_18};
    private final Context mContext;

    public SectionsPagerAdapter11(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;

        switch (position)
        {
            case 0:
                fragment = new Article11section1Fragment();
                break;
            case 1:
                fragment = new Article11section2Fragment();
                break;
            case 2:
                fragment = new Article11section3Fragment();
                break;
            case 3:
                fragment = new Article11section4Fragment();
                break;
            case 4:
                fragment = new Article11section5Fragment();
                break;
            case 5:
                fragment = new Article11section6Fragment();
                break;
            case 6:
                fragment = new Article11section7Fragment();
                break;
            case 7:
                fragment = new Article11section8Fragment();
                break;
            case 8:
                fragment = new Article11section9Fragment();
                break;
            case 9:
                fragment = new Article11section10Fragment();
                break;
            case 10:
                fragment = new Article11section11Fragment();
                break;
            case 11:
                fragment = new Article11section12Fragment();
                break;
            case 12:
                fragment = new Article11section13Fragment();
                break;
            case 13:
                fragment = new Article11section14Fragment();
                break;
            case 14:
                fragment = new Article11section15Fragment();
                break;
            case 15:
                fragment = new Article11section16Fragment();
                break;
            case 16:
                fragment = new Article11section17Fragment();
                break;
            case 17:
                fragment = new Article11section18Fragment();
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
        return 18;
    }
}
package com.rcustodio.philippinesconstitution1987.Article07;

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
public class SectionsPagerAdapter7 extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{
            R.string.article_7_tab_text_1,
            R.string.article_7_tab_text_2,
            R.string.article_7_tab_text_3,
            R.string.article_7_tab_text_4,
            R.string.article_7_tab_text_5,
            R.string.article_7_tab_text_6,
            R.string.article_7_tab_text_7,
            R.string.article_7_tab_text_8,
            R.string.article_7_tab_text_9,
            R.string.article_7_tab_text_10,
            R.string.article_7_tab_text_11,
            R.string.article_7_tab_text_12,
            R.string.article_7_tab_text_13,
            R.string.article_7_tab_text_14,
            R.string.article_7_tab_text_15,
            R.string.article_7_tab_text_16,
            R.string.article_7_tab_text_17,
            R.string.article_7_tab_text_18,
            R.string.article_7_tab_text_19,
            R.string.article_7_tab_text_20,
            R.string.article_7_tab_text_21,
            R.string.article_7_tab_text_22,
            R.string.article_7_tab_text_23};
    private final Context mContext;

    public SectionsPagerAdapter7(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;

        switch (position)
        {
            case 0:
                fragment = new Article7section1Fragment();
                break;
            case 1:
                fragment = new Article7section2Fragment();
                break;
            case 2:
                fragment = new Article7section3Fragment();
                break;
            case 3:
                fragment = new Article7section4Fragment();
                break;
            case 4:
                fragment = new Article7section5Fragment();
                break;
            case 5:
                fragment = new Article7section6Fragment();
                break;
            case 6:
                fragment = new Article7section7Fragment();
                break;
            case 7:
                fragment = new Article7section8Fragment();
                break;
            case 8:
                fragment = new Article7section9Fragment();
                break;
            case 9:
                fragment = new Article7section10Fragment();
                break;
            case 10:
                fragment = new Article7section11Fragment();
                break;
            case 11:
                fragment = new Article7section12Fragment();
                break;
            case 12:
                fragment = new Article7section13Fragment();
                break;
            case 13:
                fragment = new Article7section14Fragment();
                break;
            case 14:
                fragment = new Article7section15Fragment();
                break;
            case 15:
                fragment = new Article7section16Fragment();
                break;
            case 16:
                fragment = new Article7section17Fragment();
                break;
            case 17:
                fragment = new Article7section18Fragment();
                break;
            case 18:
                fragment = new Article7section19Fragment();
                break;
            case 19:
                fragment = new Article7section20Fragment();
                break;
            case 20:
                fragment = new Article7section21Fragment();
                break;
            case 21:
                fragment = new Article7section22Fragment();
                break;
            case 22:
                fragment = new Article7section23Fragment();
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
        return 23;
    }
}
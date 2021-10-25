package com.rcustodio.philippinesconstitution1987.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.rcustodio.philippinesconstitution1987.Article02.Article2section10Fragment;
import com.rcustodio.philippinesconstitution1987.Article02.Article2section11Fragment;
import com.rcustodio.philippinesconstitution1987.Article02.Article2section12Fragment;
import com.rcustodio.philippinesconstitution1987.Article02.Article2section13Fragment;
import com.rcustodio.philippinesconstitution1987.Article02.Article2section14Fragment;
import com.rcustodio.philippinesconstitution1987.Article02.Article2section15Fragment;
import com.rcustodio.philippinesconstitution1987.Article02.Article2section16Fragment;
import com.rcustodio.philippinesconstitution1987.Article02.Article2section17Fragment;
import com.rcustodio.philippinesconstitution1987.Article02.Article2section18Fragment;
import com.rcustodio.philippinesconstitution1987.Article02.Article2section19Fragment;
import com.rcustodio.philippinesconstitution1987.Article02.Article2section1Fragment;
import com.rcustodio.philippinesconstitution1987.Article02.Article2section20Fragment;
import com.rcustodio.philippinesconstitution1987.Article02.Article2section21Fragment;
import com.rcustodio.philippinesconstitution1987.Article02.Article2section22Fragment;
import com.rcustodio.philippinesconstitution1987.Article02.Article2section23Fragment;
import com.rcustodio.philippinesconstitution1987.Article02.Article2section24Fragment;
import com.rcustodio.philippinesconstitution1987.Article02.Article2section25Fragment;
import com.rcustodio.philippinesconstitution1987.Article02.Article2section26Fragment;
import com.rcustodio.philippinesconstitution1987.Article02.Article2section27Fragment;
import com.rcustodio.philippinesconstitution1987.Article02.Article2section28Fragment;
import com.rcustodio.philippinesconstitution1987.Article02.Article2section2Fragment;
import com.rcustodio.philippinesconstitution1987.Article02.Article2section3Fragment;
import com.rcustodio.philippinesconstitution1987.Article02.Article2section4Fragment;
import com.rcustodio.philippinesconstitution1987.Article02.Article2section5Fragment;
import com.rcustodio.philippinesconstitution1987.Article02.Article2section6Fragment;
import com.rcustodio.philippinesconstitution1987.Article02.Article2section7Fragment;
import com.rcustodio.philippinesconstitution1987.Article02.Article2section8Fragment;
import com.rcustodio.philippinesconstitution1987.Article02.Article2section9Fragment;
import com.rcustodio.philippinesconstitution1987.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{
            R.string.article_tab_text_1,
            R.string.article_tab_text_2,
            R.string.article_tab_text_3,
            R.string.article_tab_text_4,
            R.string.article_tab_text_5,
            R.string.article_tab_text_6,
            R.string.article_tab_text_7,
            R.string.article_tab_text_8,
            R.string.article_tab_text_9,
            R.string.article_tab_text_10,
            R.string.article_tab_text_11,
            R.string.article_tab_text_12,
            R.string.article_tab_text_13,
            R.string.article_tab_text_14,
            R.string.article_tab_text_15,
            R.string.article_tab_text_16,
            R.string.article_tab_text_17,
            R.string.article_tab_text_18,
            R.string.article_tab_text_19,
            R.string.article_tab_text_20,
            R.string.article_tab_text_21,
            R.string.article_tab_text_22,
            R.string.article_tab_text_23,
            R.string.article_tab_text_24,
            R.string.article_tab_text_25,
            R.string.article_tab_text_26,
            R.string.article_tab_text_27,
            R.string.article_tab_text_28};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;

        switch (position)
        {
            case 0:
                fragment = new Article2section1Fragment();
                break;
            case 1:
                fragment = new Article2section2Fragment();
                break;
            case 2:
                fragment = new Article2section3Fragment();
                break;
            case 3:
                fragment = new Article2section4Fragment();
                break;
            case 4:
                fragment = new Article2section5Fragment();
                break;
            case 5:
                fragment = new Article2section6Fragment();
                break;
            case 6:
                fragment = new Article2section7Fragment();
                break;
            case 7:
                fragment = new Article2section8Fragment();
                break;
            case 8:
                fragment = new Article2section9Fragment();
                break;
            case 9:
                fragment = new Article2section10Fragment();
                break;
            case 10:
                fragment = new Article2section11Fragment();
                break;
            case 11:
                fragment = new Article2section12Fragment();
                break;
            case 12:
                fragment = new Article2section13Fragment();
                break;
            case 13:
                fragment = new Article2section14Fragment();
                break;
            case 14:
                fragment = new Article2section15Fragment();
                break;
            case 15:
                fragment = new Article2section16Fragment();
                break;
            case 16:
                fragment = new Article2section17Fragment();
                break;
            case 17:
                fragment = new Article2section18Fragment();
                break;
            case 18:
                fragment = new Article2section19Fragment();
                break;
            case 19:
                fragment = new Article2section20Fragment();
                break;
            case 20:
                fragment = new Article2section21Fragment();
                break;
            case 21:
                fragment = new Article2section22Fragment();
                break;
            case 22:
                fragment = new Article2section23Fragment();
                break;
            case 23:
                fragment = new Article2section24Fragment();
                break;
            case 24:
                fragment = new Article2section25Fragment();
                break;
            case 25:
                fragment = new Article2section26Fragment();
                break;
            case 26:
                fragment = new Article2section27Fragment();
                break;
            case 27:
                fragment = new Article2section28Fragment();
                break;

        }
        return  fragment;


        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
     //   return PlaceholderFragment.newInstance(position + 1);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 28;
    }
}
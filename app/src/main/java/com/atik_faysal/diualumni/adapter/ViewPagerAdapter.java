package com.atik_faysal.diualumni.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.atik_faysal.diualumni.important.AboutProfile;
import com.atik_faysal.diualumni.important.HomeProfile;

/**
 * Created by USER on 2/23/2018.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter
{
        private int numberOfPage;
        private String user;

        public ViewPagerAdapter(FragmentManager fm, int numberOfPage)
        {
                super(fm);
                this.numberOfPage = numberOfPage;
        }

        @Override
        public Fragment getItem(int position) {
                Fragment object = null;
                switch (position) {
                        case 0:
                                object = new HomeProfile();
                                break;
                        case 1:
                                object = new AboutProfile();
                                break;
                }
                return object;
        }

        @Override
        public int getCount() {
                return numberOfPage;
        }

}
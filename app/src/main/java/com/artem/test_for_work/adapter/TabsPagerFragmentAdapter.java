package com.artem.test_for_work.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.artem.test_for_work.fragment.ExampleFragment;
import com.artem.test_for_work.fragment.ExampleFragment1;
import com.artem.test_for_work.fragment.ExampleFragment2;

public class TabsPagerFragmentAdapter extends FragmentPagerAdapter {

    private String[] tabs;
    public TabsPagerFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs=new String[]{
                "О нас",
                "Новости",
                "Контакты"
        };
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return ExampleFragment.getInstance();
            case 1:
               return ExampleFragment1.getInstance();
            case 2:
                return ExampleFragment2.getInstance();
        }


        return null;
    }



    @Override
    public int getCount() {
        return tabs.length;
    }
}

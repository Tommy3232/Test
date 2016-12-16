package com.artem.test_for_work.adapter;



import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.artem.test_for_work.fragment.AboutFragment;
import com.artem.test_for_work.fragment.AbstractTabFragment;
import com.artem.test_for_work.fragment.ContactFragment;
import com.artem.test_for_work.fragment.NewsFragment;

import java.util.HashMap;
import java.util.Map;


public class TabsFragmentAdapter extends FragmentPagerAdapter {
    private Context context;
    private Map<Integer, AbstractTabFragment> tabs;

    public TabsFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;

        initTabsMap(context);
    }


    @Override
    public CharSequence getPageTitle(int position) {

        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }


    @Override
    public int getCount() {
        return tabs.size();
    }

    private void initTabsMap(Context context) {
        tabs = new HashMap<>();
        tabs.put(0, AboutFragment.getInstance(context));
        tabs.put(1, NewsFragment.getInstance(context));
        tabs.put(2, ContactFragment.getInstance(context));
    }
}
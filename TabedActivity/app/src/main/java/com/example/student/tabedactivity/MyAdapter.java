package com.example.student.tabedactivity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Student on 7/14/2018.
 */

public class MyAdapter extends FragmentPagerAdapter {

    private  final List<Fragment>  fragments = new ArrayList<>();
    private  final List<String>  fragmentsTitles = new ArrayList<>();

    public MyAdapter (FragmentManager fm){
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentsTitles.get(position);
    }

    public void  addFragment (Fragment fragment , String title){
        fragments.add(fragment);
        fragmentsTitles.add(title);
    }
}

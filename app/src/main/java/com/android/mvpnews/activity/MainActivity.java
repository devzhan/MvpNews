package com.android.mvpnews.activity;


import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;

import com.android.mvpnews.R;
import com.android.mvpnews.base.BaseActivity;
import com.android.mvpnews.base.BaseFragment;
import com.android.mvpnews.fragment.FootFragment;
import com.android.mvpnews.fragment.HomeFragment;
import com.android.mvpnews.fragment.ToolsFragment;

import java.util.ArrayList;

public class MainActivity extends BaseActivity implements FootFragment.SelecteListener {
    private static final String TAG = "MainActivity";
    private FootFragment mFootFragment;
    private FragmentManager mFragmentManager;
    private FragmentTransaction transaction;
    private ArrayList<BaseFragment> fragments = new ArrayList<>();
    private HomeFragment mHomeFragment;
    private ToolsFragment mToolsFragment;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setToolBarTitle("news");



    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        mHomeFragment = HomeFragment.newInstance("home", "home");
        mToolsFragment = ToolsFragment.newInstance("tools", "tools");
        fragments.add(mHomeFragment);
        fragments.add(mToolsFragment);
        setCurrentFragment(0);
    }

    private void setCurrentFragment(int pos) {
        BaseFragment fragment = fragments.get(pos);
        mFragmentManager = getSupportFragmentManager();
        transaction = mFragmentManager.beginTransaction();
        transaction.replace(R.id.fl_content, fragment);
        transaction.commit();
    }

    @Override
    public void selecte(int pos) {
        Log.i(TAG,"pos==="+pos);
        setCurrentFragment(pos);
    }
}

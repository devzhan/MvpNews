package com.android.mvpnews.fragment;

import android.os.Bundle;

import com.android.mvpnews.R;
import com.android.mvpnews.base.BaseFragment;

public class ToolsFragment extends BaseFragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    public static ToolsFragment newInstance(String param1, String param2) {
        ToolsFragment fragment = new ToolsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.tool_fragment;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    protected void initView() {

    }
}

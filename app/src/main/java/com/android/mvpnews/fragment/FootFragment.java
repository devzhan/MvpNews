package com.android.mvpnews.fragment;



import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.android.mvpnews.R;
import com.android.mvpnews.base.BaseFragment;

public class FootFragment extends BaseFragment implements RadioGroup.OnCheckedChangeListener {

    private RadioGroup mRadioGroup;
    private SelecteListener mSelecteListener;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.foot_fragment;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    protected void initView() {
        mRadioGroup = rootView.findViewById(R.id.rg_bar);
        mRadioGroup.setOnCheckedChangeListener(this);

    }



    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
        switch (checkedId) {
            case R.id.rb_home:
                mSelecteListener.selecte(0);
                break;
            case R.id.rb_tool:
                mSelecteListener.selecte(1);
                break;
            default:
                Toast.makeText(getActivity(), "secret", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onAttach(Context activity) {
        super.onAttach(activity);
        mSelecteListener = (SelecteListener) activity;
    }

    public interface SelecteListener {
         void selecte(int pos);
    }
}


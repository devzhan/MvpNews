package com.android.mvpnews.biz;


import com.android.mvpnews.bean.User;

public interface OnLoginListener {

    void loginSuccess(User user);

    void loginFailed();
}

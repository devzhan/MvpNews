package com.android.mvpnews.biz;

public interface IUserBiz {

        public void login(String username, String password, OnLoginListener loginListener);

}

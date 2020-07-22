package com.itheima.login.service;

import com.itheima.login.dao.LoginDao;

public class LoginService {
    public Boolean login(String username, String password)  throws Exception{

        LoginDao loginDao = new LoginDao();


        return loginDao.login(username,password);
    }
}

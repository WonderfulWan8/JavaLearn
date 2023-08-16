package com.imooc.mall.service;

import com.imooc.mall.exception.ImoocMallException;
import com.imooc.mall.model.pojo.User;


public interface UserService {
    User getUserById();
    void reggister(String userName, String password) throws ImoocMallException;

    User login(String userName, String password)  throws ImoocMallException;

    void updateInfomation(User user) throws ImoocMallException;

    boolean checkAdminRole(User user);

}

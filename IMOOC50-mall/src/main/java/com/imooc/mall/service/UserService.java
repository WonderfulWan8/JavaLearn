package com.imooc.mall.service;

import com.imooc.mall.exception.ImoocMallException;
import com.imooc.mall.model.pojo.User;
import org.springframework.stereotype.Service;


public interface UserService {
    User getUserById();
    void reggister(String userName, String password) throws RuntimeException;
}

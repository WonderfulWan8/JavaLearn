package com.imooc.mall.service.impl;

import com.imooc.mall.exception.ImoocMallException;
import com.imooc.mall.exception.ImoocMallExceptionEnum;
import com.imooc.mall.model.dao.UserMapper;
import com.imooc.mall.model.pojo.User;
import com.imooc.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserById() {
        return userMapper.selectByPrimaryKey(1);
    }

    @Override
    public void reggister(String userName, String password) throws ImoocMallException {
        //查询用户是否存在，不允许重名
        try {
            User result = userMapper.selectByName(userName);
            System.out.println("result:"+result);
            if(result != null){
                throw new ImoocMallException(ImoocMallExceptionEnum.NAME_EXISTED);
            }
//        写到 数据库
            User user =new User();
            user.setUsername(userName);
            user.setPassword(password);
            int count = userMapper.insertSelective(user);
            if(count == 0){
                throw new ImoocMallException(ImoocMallExceptionEnum.INSERT_FAILED);
            }
        } catch (ImoocMallException e) {
            throw new ImoocMallException(ImoocMallExceptionEnum.NAME_EXISTED);
        }
    }
}












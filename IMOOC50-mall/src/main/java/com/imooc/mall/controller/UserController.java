package com.imooc.mall.controller;

import com.imooc.Imooc50MallApplication;
import com.imooc.mall.common.ApiRestResponse;
import com.imooc.mall.common.Constant;
import com.imooc.mall.exception.ImoocMallException;
import com.imooc.mall.exception.ImoocMallExceptionEnum;
import com.imooc.mall.model.dao.UserMapper;
import com.imooc.mall.model.pojo.User;
import com.imooc.mall.service.UserService;
import io.netty.util.internal.StringUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * 描述：     用户控制器
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/test")
    @ResponseBody
    public User personalPage() {
        return userService.getUserById();
    }

    /**
     * 注册接口
     * @param userName
     * @param password
     * @return
     * @throws ImoocMallException
     */
    @ApiOperation("注册接口")
    @PostMapping("/register")
    @ResponseBody
    public ApiRestResponse register(@RequestParam("userName") String userName, @RequestParam("password") String password) throws ImoocMallException {
        if (StringUtils.isEmpty(userName)) {
            return ApiRestResponse.error(ImoocMallExceptionEnum.NEED_USER_NAME);
        }
        if (StringUtils.isEmpty(password)) {
            return ApiRestResponse.error(ImoocMallExceptionEnum.NEED_USER_PASSWORD);
        }
        if (password.length() < 8) {
            return ApiRestResponse.error(ImoocMallExceptionEnum.PASSWORD_TOO_SHORT);
        }
        userService.reggister(userName, password);

        return ApiRestResponse.success();
    }

    /**
     * 登录接口
     * @param userName
     * @param password
     * @param session
     * @return
     */
    @ApiOperation("用户登录")
    @PostMapping("/login")
    @ResponseBody
    public ApiRestResponse login(@RequestParam("userName") String userName, @RequestParam("password") String password, HttpSession session) {
        if (StringUtils.isEmpty(userName)) {
            return ApiRestResponse.error(ImoocMallExceptionEnum.NEED_USER_NAME);
        }
        if (StringUtils.isEmpty(password)) {
            return ApiRestResponse.error(ImoocMallExceptionEnum.NEED_USER_PASSWORD);
        }
        User user = userService.login(userName, password);
//        避免直接被获取到用户密码
        user.setPassword(null);
//        将登录的用过户放到session中 ，保持登录态
        session.setAttribute(Constant.IMOOC_MALL_USER, user);

        return ApiRestResponse.success(user);
    }

    /**
     * 更新用户签名
     * @param session
     * @param sigature
     * @return
     */
    @ApiOperation("更新用户签名")
    @PostMapping("/user/update")
    @ResponseBody
    public ApiRestResponse updateUserInfo(HttpSession session, @RequestParam("sigature") String sigature) {
        User currentUser = (User) session.getAttribute(Constant.IMOOC_MALL_USER);
        if (currentUser == null) {
            return ApiRestResponse.error(ImoocMallExceptionEnum.NEED_LOGIN);
        }
        User user = new User();
//         设置新的user对象id为当前登录用户的id 方便数据库后续查询
        user.setId(currentUser.getId());
        user.setPersonalizedSignature(sigature);
        userService.updateInfomation(user);
        return ApiRestResponse.success();
    }

    /**
     * 登出接口
     * @param session
     * @return
     */
    @ApiOperation("登出接口")
    @PostMapping("/user/logout")
    @ResponseBody
    public ApiRestResponse logout(HttpSession session) {
        session.removeAttribute(Constant.IMOOC_MALL_USER);
        return ApiRestResponse.success();
    }

    /**
     * 管理员登录接口
     * @param userName
     * @param password
     * @param session
     * @return
     */
    @ApiOperation("管理员登录接口")
    @PostMapping("adminLogin")
    @ResponseBody
    public ApiRestResponse adminLogin(@RequestParam("userName") String userName, @RequestParam("password") String password, HttpSession session) {
        if (StringUtils.isEmpty(userName)) {
            return ApiRestResponse.error(ImoocMallExceptionEnum.NEED_USER_NAME);
        }
        if (StringUtils.isEmpty(password)) {
            return ApiRestResponse.error(ImoocMallExceptionEnum.NEED_USER_PASSWORD);
        }
        User user = userService.login(userName, password);
        //判断是否为超级管理员
        if (userService.checkAdminRole(user)) {

//        避免直接获取到 用户 密码
            user.setPassword(null);
//        将登录的用户放到session中 保持登录态
            session.setAttribute(Constant.IMOOC_MALL_USER, user);
        }else {
            return ApiRestResponse.error(ImoocMallExceptionEnum.NEED_ADMIN);
        }
        return  ApiRestResponse.success();
    }
}
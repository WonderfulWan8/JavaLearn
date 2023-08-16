package com.imooc.mall.util;

import com.imooc.mall.common.Constant;
import org.apache.tomcat.util.codec.binary.Base64;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 描述：MD5加密工具
 */
public class MD5Utils {
    public static String getMD5Str(String strvalue) throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        return Base64.encodeBase64String(md5.digest((strvalue+ Constant.SALT).getBytes()));
    }
    //测试生成 md5的值
    public static void main(String[] args) throws NoSuchAlgorithmException {
        System.out.println(getMD5Str("1233"));
    }

}

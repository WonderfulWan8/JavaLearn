package com.imooc.lambda;

import java.util.Random;
import java.util.function.Function;

/**
 * 利用Function函数式接口生成定长随机字符串
 */
public class FunctionSample {
    public static void main(String[] args) {
        Function<Integer, String> radomStringFunction = l -> {
            String chars = "abcdefghijklmnopqrstuvwxyz0123456789";
            StringBuffer sb = new StringBuffer();
            Random random = new Random();
            for (int i = 0; i < l; i++) {
                int position = random.nextInt(chars.length());
                sb.append(chars.charAt(position));

            }
            return sb.toString();
        };
        String radomString = radomStringFunction.apply(9);
        System.out.println(radomString);
    }
}

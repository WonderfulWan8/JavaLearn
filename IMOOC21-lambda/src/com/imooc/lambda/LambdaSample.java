package com.imooc.lambda;

public class LambdaSample {
    public static void main(String[] args) {
//        条件：lambda表达式 只能实现有且仅有一个抽象方法的接口 Java称之为 函数式接口
//        1、标准使用方式
        MathOperation addition   = (Integer a, Integer b) -> {
            System.out.println("加法运算");
            return a + b +0f;
        };
        System.out.println(addition.operation(5,3));
//        2、Lambda允许省略参数类型
        MathOperation subtraction = (a, b) -> a - b + 0f;
        System.out.println(subtraction.operation(5,3));
//        3、Lambda允许省略参数括号
        MathOperation multiplication = (a, b) -> a * b + 0f;
        System.out.println(multiplication.operation(5,3));

    }
}

package com.imooc.junit;

public class Caculartor {
    public int add(int a,int b){
        return a+b;
    }
    public int minus(int a,int b){
        return  a-b;
    }
    public int multip(int a,int b){
        return a*b;
    }
    public int divide(int a,int b){
        if(b==0){
            throw new RuntimeException("除数不能为0");
        }
        return a/b;
    }

}

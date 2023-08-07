package com.imooc.junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class CaculartorTest1 {
    Caculartor cal  = new Caculartor();
    @Test
    public void add() {
        ;
        System.out.println(cal.add(1,2));
    }

    @Test
    public void minus() {
        ;
        System.out.println(cal.minus(1,2));
    }

    @Test
    public void multip() {
        System.out.println(cal.multip(3,4));
    }

    @Test
    public void divide() {
        System.out.println(cal.divide(2,1));
    }
}
package com.hml.service;

public class B {

    private A a;

    public B() {
        System.out.println("B 创建了");
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }
}
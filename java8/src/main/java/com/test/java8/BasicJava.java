package com.test.java8;

import java.util.BitSet;

public class BasicJava {

    public static void main(String[] args) {

        System.out.println("main method()");

        BasicJava b = new BasicJava();
        b.m1();

        Runnable r = ()-> System.out.println("method with lambda");
        r.run();


    }

    public void m1(){
        System.out.println("m1() with out lambda expression");
    }



}

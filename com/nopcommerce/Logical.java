package com.nopcommerce;

public class Logical {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a<10 & a<20);
        System.out.println(a<10 || a<20);
        System.out.println(!(a<10 & a<20));
    }
}

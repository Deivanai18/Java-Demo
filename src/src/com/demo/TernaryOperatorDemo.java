package com.demo;

public class TernaryOperatorDemo {
    public static void main(String args[])
    {
        int x, y;
        x = 20;
        y = (x == 1) ? 1: 0;
        System.out.println(y);
        y = (x == 20) ? 1: 0;
        System.out.println(y);
        System.out.println("1: True,0: False");
    }
}

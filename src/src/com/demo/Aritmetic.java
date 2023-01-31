package com.demo;

public class Aritmetic {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Aritmetic art = new Aritmetic();
        System.out.println("Addition of two number:" + art.add(5, 10));
        System.out.println("subtraction of two number:" + art.sub(15, 10));
        System.out.println("multiplication of two number:" + art.mul(15, 5));
        System.out.println("division of two number:" + art.div(10, 5));
    }
}


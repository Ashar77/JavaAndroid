package com.company;

public class functions {

    public static void main(String[] args) {
        System.out.println(average(1,2,3));
        ClassEx b = new ClassEx();
        b.method1();
    }

    public static double average(int a ,int b, int c){
        return ((a+b+c)/3.0);
    }
}

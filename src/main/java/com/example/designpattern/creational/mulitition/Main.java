package com.example.designpattern.creational.mulitition;

public class Main {

    public static void main(String[] args) {
        Multition m1 = Multition.getInstance(MultitionType.ONE);
        Multition m2 = Multition.getInstance(MultitionType.TWO);
        Multition m3 = Multition.getInstance(MultitionType.THREE);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }
}

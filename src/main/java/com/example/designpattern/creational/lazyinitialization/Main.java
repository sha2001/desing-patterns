package com.example.designpattern.creational.lazyinitialization;

public class Main {


    public static void main(String[] args) {

        Product p2 = new Product();
        System.out.println(p2);
        System.out.println("Get Complex part");
        p2.getComplexPart();
        System.out.println(p2);


    }
}

package com.example.designpattern.creational.virtualproxy;

public class Main {

    public static void main(String[] args) {
        Light light = new Light("Test", "stop", false);

        System.out.println(light);

        Heavy heavy = light.convert();
        System.out.println(heavy);
    }
}

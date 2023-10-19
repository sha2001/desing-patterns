package com.example.designpattern.builder;

import java.time.LocalDate;

public class Main {

    public static void main(String... args) {

        Sample sample = Sample.builder()
                .startDate(LocalDate.now())
                .name("NAME")
                .value(123456)
                .anotherClass(AnotherClass.builder()
                        .anotherString("azerty")
                        .anInt(98765)
                        .build())
                .build();

        System.out.println(sample);
    }
}

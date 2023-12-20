package com.example.designpattern.creational.lazyinitialization;


import lombok.Getter;
import lombok.ToString;

import java.util.Collection;

@Getter
@ToString
public class ComplexPart {
    private String heavyInitialization;

    public ComplexPart() {

        try {
            Thread.sleep(2000);
        heavyInitialization = "loading time 2 sec";
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

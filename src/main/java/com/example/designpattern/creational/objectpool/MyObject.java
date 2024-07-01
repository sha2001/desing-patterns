package com.example.designpattern.creational.objectpool;

import lombok.ToString;

import java.util.concurrent.atomic.AtomicInteger;

public class MyObject {

    private static final AtomicInteger counter = new AtomicInteger(0);
    private final int id;

     public MyObject() {
        id = counter.incrementAndGet();
     }

    @Override
    public String toString() {
        return "MyObject{" +
                "id=" + id +
                '}';
    }
}

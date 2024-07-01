package com.example.designpattern.creational.objectpool;

public class MyObjectPool extends ObjectPool<MyObject>{
    @Override
    protected MyObject create() {
        return new MyObject();
    }
}

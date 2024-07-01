package com.example.designpattern.creational.objectpool;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {

        var pool = new MyObjectPool();
        log.info("pool {}", pool);
        MyObject o1 = pool.retrieve();
        log.info("o1 {}", o1);
        log.info("pool {}", pool);
        MyObject o2 = pool.retrieve();
        log.info("o2 {}", o2);
        log.info("pool {}", pool);
        MyObject o3 = pool.retrieve();
        log.info("o3 {}", o3);
        log.info("pool {}", pool);

        pool.release(o1);
        log.info("pool {}", pool);
        pool.release(o2);
        log.info("pool {}", pool);

        MyObject o4 = pool.retrieve();
        log.info("o4 {}", o4);
        log.info("pool {}", pool);
        MyObject o5 = pool.retrieve();
        log.info("o5 {}", o5);
        log.info("pool {}", pool);
    }
}

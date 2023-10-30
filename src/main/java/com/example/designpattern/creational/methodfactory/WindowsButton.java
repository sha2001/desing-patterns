package com.example.designpattern.creational.methodfactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WindowsButton implements Button {
    @Override
    public void render() {
        log.info("Render a Windows button") ;
    }

    @Override
    public void onClick() {
        log.info("Click on a Windows Button");
    }
}

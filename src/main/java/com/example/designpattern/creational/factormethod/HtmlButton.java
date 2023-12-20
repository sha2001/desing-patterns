package com.example.designpattern.creational.factormethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HtmlButton implements Button{
    @Override
    public void render() {
        log.info("Render an htlm button");
    }

    @Override
    public void onClick() {
        log.info("Click on an html button");
    }
}

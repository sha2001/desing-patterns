package com.example.designpattern.abstractfactory;

public class MacButton implements Button {

    @Override
    public void click() {
       System.out.println("Mac Button clicked");
    }
    
}

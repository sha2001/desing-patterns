package com.example.designpattern.abstractfactory;

public class WinButton  implements Button{
    @Override
    public void click() {
       System.out.println("Win Button clicked");
    }
}

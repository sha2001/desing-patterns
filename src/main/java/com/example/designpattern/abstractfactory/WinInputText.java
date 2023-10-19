package com.example.designpattern.abstractfactory;

public class WinInputText implements InputText {
    @Override
    public void setText(String text) {
        System.out.println("Set " + text + " in Win InputText");    
    }
}

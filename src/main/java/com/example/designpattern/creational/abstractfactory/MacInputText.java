package com.example.designpattern.creational.abstractfactory;

public class MacInputText implements InputText{

    @Override
    public void setText(String text) {
        System.out.println("Set " + text + " in Mac InputText");    
    }

}

package com.example.designpattern.creational.abstractfactory;

public class MacGuiFactory implements GuiFactory{

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public InputText createInputText() {
        return new MacInputText();
    }
    
}

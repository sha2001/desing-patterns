package com.example.designpattern.abstractfactory;

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

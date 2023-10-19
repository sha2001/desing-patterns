package com.example.designpattern.abstractfactory;

public class WinGuiFactory  implements GuiFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public InputText createInputText() {
        return new WinInputText();
    }
}

package com.example.designpattern.creational.abstractfactory;

public interface GuiFactory {
    Button createButton();
    InputText createInputText();
}
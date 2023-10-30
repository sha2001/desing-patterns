package com.example.designpattern.creational.abstractfactory;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        GuiFactory guiFactory;
        if (args.length  !=1) {
            throw new UnsupportedOperationException("Provide a OS name to generate the GUI " + Arrays.toString(OS.values()));
        }
        OS os = OS.valueOf(args[0].toUpperCase().trim());
        switch (os) {
            case WIN:
                guiFactory = new WinGuiFactory();
                break;
            case MAC:
                guiFactory = new MacGuiFactory();
                break;
            default:
                throw new UnsupportedOperationException("Cannot generate gui for not yet supported" + args[0]);
        }

        Button button1 = guiFactory.createButton();
        Button button2 = guiFactory.createButton();
        InputText inputText = guiFactory.createInputText();

        button1.click();
        button2.click();
        inputText.setText("This is mac test");

    }
}
package com.example.designpattern.creational.factormethod;



import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        if (args.length  !=1) {
            throw new UnsupportedOperationException("Provide a interface name to generate the GUI " + Arrays.toString(Interface.values()));
        }
        Interface anInterface = Interface.valueOf(args[0].toUpperCase().trim());

        Dialog dialog;
        switch (anInterface) {
            case WINDOWS:
                dialog = new WindowsDialog();
                break;
            case WEB:
                dialog = new HtmlDialog();
                break;
            default:
                throw new UnsupportedOperationException("Cannot generate gui for not yet supported" + args[0]);
        }
        dialog.renderWindow();
    }
}
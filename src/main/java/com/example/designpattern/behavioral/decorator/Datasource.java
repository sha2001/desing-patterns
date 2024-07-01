package com.example.designpattern.behavioral.decorator;

/**
 * Datasource
    define method that will be implemented by concrete classes and overridden by the decorator.
 */
public interface Datasource {
    String read();
    void write(String data);
}

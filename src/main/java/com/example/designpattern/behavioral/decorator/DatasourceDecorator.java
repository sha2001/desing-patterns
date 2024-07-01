package com.example.designpattern.behavioral.decorator;

/**
 * The base decorator class follows the same interface as the
 * other components.
 * The primary purpose of this class is to define the wrapping interface for all concrete decorators.
 * The default implementation of the wrapping code might include  a field for storing a wrapped component and the means to initialize it.
 */
class DataSourceDecorator implements Datasource {
    private Datasource wrappee;

    DataSourceDecorator(Datasource source) {
        this.wrappee = source;
    }

    @Override
    public void write(String data) {
        wrappee.write(data);
    }

    @Override
    public String read() {
        return wrappee.read();
    }
}

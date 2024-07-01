package com.example.designpattern.behavioral.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CompressionDecorator extends DataSourceDecorator {
    CompressionDecorator(Datasource source) {
        super(source);
    }

    @Override
    public void write(String data) {
        log.info("Compressing data");
        super.write(data);
    }

    @Override
    public String read() {
        log.info("Decompressing data");
        return super.read();
    }
}

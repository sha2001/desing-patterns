package com.example.designpattern.behavioral.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {
        Datasource source = new FileDatasource("test.txt");
        source.write("Hello World");
        log.info("content {}",  source.read());

        Datasource compressed = new CompressionDecorator(source);
        compressed.write("Hello World");
        log.info("compressed content {}",compressed.read());

        Datasource encrypted = new EncryptionDecorator(source);
        encrypted.write("Hello World");
        log.info("encrypted content {}",encrypted.read());




        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDatasource("OutputDemo.txt")));
        encoded.write(salaryRecords);
        log.info("Read plain: {}", encoded.read());
        Datasource plain = new FileDatasource("OutputDemo.txt");
        log.info("Read plain: {}", plain.read());



    }
}

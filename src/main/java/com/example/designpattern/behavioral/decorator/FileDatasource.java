package com.example.designpattern.behavioral.decorator;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Concrete implementation of Datasource
 * Default implementation of read and write methods
 * This class reads and writes data to a file
 */
@Slf4j
@RequiredArgsConstructor
public final class FileDatasource implements Datasource {

    private final String filename;

    @Override
    public String read() {
        try {
            String content =  Files.readString(Paths.get(filename));
            log.info("Reading data from file: {} ", content);
            return  content;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void write(String data) {

        try {
            Files.writeString(Paths.get(filename), data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

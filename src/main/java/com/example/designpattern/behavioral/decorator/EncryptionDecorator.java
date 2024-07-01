package com.example.designpattern.behavioral.decorator;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Base64;

/**
 * Concrete Decorators call the wrapped object and alter its result in some way.
 *
 */
@Slf4j
public class EncryptionDecorator extends DataSourceDecorator {
    EncryptionDecorator(Datasource source) {
        super(source);
    }

    @Override
    public void write(String data) {
        log.info("Encrypting data");
        String encoded = new String(Base64.getEncoder().encode(data.getBytes()));
        log.info("encoded string {}",encoded);
        super.write(encoded);
        log.info("Data encrypted");
    }

    @Override
    public String read() {
        log.info("Decrypting data");
        String content = super.read();
        return new String(Base64.getDecoder().decode(content));
    }
}

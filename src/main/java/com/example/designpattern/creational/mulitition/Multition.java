package com.example.designpattern.creational.mulitition;

import lombok.Synchronized;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class Multition {
    private static final Map<MultitionType, Multition> instances = new EnumMap<>(MultitionType.class);

    private MultitionType type;

    private Multition(MultitionType type) {
        this.type = type;
    }

    @Synchronized
    public static Multition getInstance(MultitionType type) {
        if (instances.containsKey(type)) {
            return instances.get(type);
        }
        Multition multition = new Multition(type);
        instances.put(type, multition);
        return multition;
    }

    @Override
    public String toString() {
        return "Multition{" +
                "type=" + type +
                '}';
    }
}

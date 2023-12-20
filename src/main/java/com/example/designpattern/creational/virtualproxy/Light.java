package com.example.designpattern.creational.virtualproxy;

public class Light implements Behavour{
    private String name;
    private String action;
    private boolean started;

    public Light(String name, String action, boolean started) {
        this.name = name;
        this.action = action;
        this.started = started;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAction() {
        return action;
    }

    @Override
    public boolean isStarted() {
        return started;
    }

    Heavy convert(){
        return new Heavy(name, action, 10, started );
    }

    @Override
    public String toString() {
        return "Heavy{" +
                "name='" + name + '\'' +
                ", action='" + action + '\'' +
                ", started=" + started +
                '}';
    }
}

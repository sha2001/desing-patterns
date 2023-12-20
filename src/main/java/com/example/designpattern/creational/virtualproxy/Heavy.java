package com.example.designpattern.creational.virtualproxy;

public class Heavy implements Behavour {

    private String name;
    private String action;

    private int number;

    private boolean started;

    public Heavy(String name, String action, int number, boolean started) {
        this.name = name;
        this.action = action;
        this.number = number;
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

    public void start() {
        started = true;
    }

    public void stop() {
        started= false;
    }

    @Override
    public String toString() {
        return "Heavy{" +
                "name='" + name + '\'' +
                ", action='" + action + '\'' +
                ", number=" + number +
                ", started=" + started +
                '}';
    }
}

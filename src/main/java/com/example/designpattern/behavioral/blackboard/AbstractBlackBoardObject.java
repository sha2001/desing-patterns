package com.example.designpattern.behavioral.blackboard;

public class AbstractBlackBoardObject implements BlackBoardObject {

    protected boolean isReady;
    @Override
    public boolean isReady() {
        return isReady;
    }
    public void setReady(boolean isReady) {
        this.isReady = isReady;
    }
}

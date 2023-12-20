package com.example.designpattern.behavioral.blackboard;

import java.util.Observable;

public abstract class AbstractBlackBoard extends Observable implements BlackBoard {
    public void addBlackBoardObject(BlackBoardObject blackBoardObject) {

        setChanged();
        notifyController(blackBoardObject);
    }

    public void notifyController(BlackBoardObject blackBoardObject) {
        notifyObservers(blackBoardObject);
    }
}

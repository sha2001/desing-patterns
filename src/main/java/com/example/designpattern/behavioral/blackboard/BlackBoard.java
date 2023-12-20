package com.example.designpattern.behavioral.blackboard;

public interface BlackBoard {
    void addBlackBoardObject(BlackBoardObject blackBoardObject);

    void notifyController(BlackBoardObject blackBoardObject);
}

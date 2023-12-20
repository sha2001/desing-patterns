package com.example.designpattern.behavioral.blackboard;

public interface KnowledgeSource extends Runnable {
    boolean canHandle(BlackBoardObject blackBoardObject, BlackBoard blackBoard);

    BlackBoardObject process(BlackBoardObject blackBoardObject) throws Exception;

    void updateBlackBoardObject(BlackBoardObject blackBoardObject);
}

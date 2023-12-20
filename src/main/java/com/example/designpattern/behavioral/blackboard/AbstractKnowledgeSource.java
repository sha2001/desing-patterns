package com.example.designpattern.behavioral.blackboard;

public abstract class AbstractKnowledgeSource implements KnowledgeSource {
    protected BlackBoardObject blackBoardObject;
    protected BlackBoard blackBoard;

    public void run() {
        try {
            updateBlackBoardObject(process(blackBoardObject));
        } catch (Exception ex) {
            //TODO: log the exception
        }
    }

    public void updateBlackBoardObject(BlackBoardObject blackBoardObject) {
        blackBoard.addBlackBoardObject(blackBoardObject);
    }
}

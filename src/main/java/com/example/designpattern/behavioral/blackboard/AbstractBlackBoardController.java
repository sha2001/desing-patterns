package com.example.designpattern.behavioral.blackboard;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class AbstractBlackBoardController implements BlackBoardController {
    protected List<KnowledgeSource> knowledgeSourceList = new ArrayList<>();

    public void update(Observable observable, Object object) {

        ExecutorService executorService = Executors.newFixedThreadPool(1);

        if (((BlackBoardObject) object).isReady())
            execOutcome((BlackBoardObject) object);
        else {
            for (KnowledgeSource ks : knowledgeSourceList) {
                if (ks.canHandle((BlackBoardObject) object, (AbstractBlackBoard) observable)) {
                    enrollKnowledgeSource(ks, executorService);
                    break;
                }
            }
        }

        executorService.shutdown();
    }

    public void setKnowledgeSourceList(List<KnowledgeSource> knowledgeSourceList) {
        this.knowledgeSourceList = knowledgeSourceList;
    }

    public void enrollKnowledgeSource(KnowledgeSource knowledgeSource, ExecutorService executorService) {
        executorService.execute(knowledgeSource);
    }
}

package com.example.designpattern.behavioral.blackboard;

import java.util.List;
import java.util.concurrent.ExecutorService;

public interface BlackBoardController {
     void setKnowledgeSourceList(List<KnowledgeSource> knowledgeSourceList);

     void enrollKnowledgeSource(KnowledgeSource knowledgeSource, ExecutorService executorService);

     void execOutcome(BlackBoardObject blackBoardObject);
}

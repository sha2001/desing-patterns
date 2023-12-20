package com.example.designpattern.behavioral.blackboard.sample.knowledgesource;

import com.example.designpattern.behavioral.blackboard.AbstractKnowledgeSource;
import com.example.designpattern.behavioral.blackboard.BlackBoard;
import com.example.designpattern.behavioral.blackboard.BlackBoardObject;
import com.example.designpattern.behavioral.blackboard.sample.blackboardobject.DeltaSpeedDataBBO;
import com.example.designpattern.behavioral.blackboard.sample.blackboardobject.FrontVehicleBlackBoardObject;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FrontVehicleKnowledgeSource extends AbstractKnowledgeSource {
    @Override
    public boolean canHandle(BlackBoardObject blackBoardObject, BlackBoard blackBoard) {

        if (blackBoardObject instanceof FrontVehicleBlackBoardObject) {
            this.blackBoardObject = blackBoardObject;
            this.blackBoard = blackBoard;
            return true;
        }
        return false;
    }

    @Override
    public BlackBoardObject process(BlackBoardObject blackBoardObject) throws Exception {
        BlackBoardObject deltaSpeedDataBBO = new DeltaSpeedDataBBO();

        try {
            //pretend the KS is working
            Thread.sleep(1000);
        } catch (InterruptedException iex) {
            //
        }

        log.info("==>> FrontVehicleDataKS processed FrontVehicleDataBBO");
        return deltaSpeedDataBBO;
    }
}

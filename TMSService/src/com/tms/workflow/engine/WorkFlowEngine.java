/**
 * @version $Id$
 * Create date: Oct 16, 2013
 * Create by: enixjin
 */
package com.tms.workflow.engine;

import com.tms.workflow.process.Step;

/**
 * Class description goes here
 * @author enixjin
 *
 */
public class WorkFlowEngine {
    //todo
    
    public <P extends Process> void startProcess(P porcess){
        
    }
    
    public <S extends Step> void doStep(S step){
        
    }
    
    public <S extends Step,P extends Process> S getNextStep(P process){
        return null;
    }

}

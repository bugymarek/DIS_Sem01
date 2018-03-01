/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

import java.awt.image.ReplicateScaleFilter;
import java.util.ArrayList;

/**
 *
 * @author Bugy
 */
public abstract class MonteCarlo {
    private double currentProbability; 
    private double currentExperiment;
    private double success;
    private Command command;
    private boolean runnable;
    private double replicationsCount;
    
    public MonteCarlo(int count, Command c){
        this.replicationsCount = count;
        this.currentProbability = 0;
        this.command = c;
        this.success = 0;
        this.runnable = true;
    }
    
    public void doReprications(double count) {
        this.replicationsCount = count;
        for (double i = 1; i <= count; i++) {
            if(!runnable)return;
            simulate();
            this.currentExperiment = i;
            if(this.command != null) {
                command.run();
            }
        }
    }

    public double getCurrentProbability() {
        return success/currentExperiment;
    }

    public void setCurrentProbability(double currentProbability) {
        this.currentProbability = currentProbability;
    }
    
    

    public void setCommand(Command command) {
        this.command = command;
    }

    public double getCurrentExperiment() {
        return currentExperiment;
    }  

    public double getSuccess() {
        return success;
    }
    
    public void incrementSuccess(){
        success++;
    }

    public void setRunnable(boolean runnable) {
        this.runnable = runnable;
    }

    public double getReplicationsCount() {
        return replicationsCount;
    }
    
    abstract void simulate();
}

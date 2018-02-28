/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

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
    
    public MonteCarlo(int count, Command c){
        this.currentProbability = 0;
        this.command = c;
        this.success = 0;
    }
    
    public void doReprications(double count) {
        for (double i = 1; i <= count; i++) {
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
    
    abstract void simulate();
}

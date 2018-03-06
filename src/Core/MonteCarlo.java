/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;
/**
 *
 * @author Bugy
 */
public abstract class MonteCarlo {
    private double currentExperiment;
    private double success;
    private Command command;
    private boolean runnable;
    private double replicationsCount;
    private final int modulo = 1000;
    
    public MonteCarlo(int count){
        this.replicationsCount = count;
        this.command = null;
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

    public int getModulo() {
        return modulo;
    }
      
    abstract void simulate();
}

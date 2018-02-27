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
public abstract class Replications {
    private double currentProbability; 
   
    public Replications(){
        this.currentProbability = 0;
    }
    
    public double doReprications(double count) {
        double countTrue = 0;
        for (double i = 1; i <= count; i++) {
            if (doMonteCarlo()) {
                countTrue++;
            }
            this.currentProbability = countTrue/i;
        }
       return countTrue/count;
    }

    public double getCurrentProbability() {
        return currentProbability;
    }
    
    abstract boolean doMonteCarlo();
}

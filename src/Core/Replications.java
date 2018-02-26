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

    public double doReprications(int count) {
        int countTrue = 0;
        for (int i = 0; i < count; i++) {
            if (doMonteCarlo()) {
                countTrue++;
            }
        }
       return countTrue/count;
    }

    abstract boolean doMonteCarlo();
}

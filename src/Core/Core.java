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
public class Core extends Replications {
    public Core(){
        super();
        super.doReprications(80); 
    }

    @Override
    boolean doMonteCarlo() {
        System.out.println("Replikujem");
        return true;
    }
}

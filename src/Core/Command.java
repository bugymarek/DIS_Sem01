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
public abstract class Command {
    private Simulation Task;
    
    public Command(Simulation task){
        this.Task = task;
    }
    public abstract void run();
}

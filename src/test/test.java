/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Core.Command;
import Core.Simulation;
import Core.TaskA;
import Core.TaskB;
import java.util.ArrayList;

/**
 *
 * @author Bugy
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count = 10000000;
        TaskA a = new TaskA(count, 6, null);    
        Command c = createCommand(a, count);
        a.setCommand(c);
        a.replicate();
        
         TaskB b = new TaskB(10000000, 6, null);
         c = createCommand(b, count);
         b.setCommand(c);
         b.replicate();
    }
    private static Command createCommand(Simulation task, int count){
         Command c = new Command(task) {
            @Override
             public void run() {
                 if(task.getCurrentExperiment() == count)
                System.out.println(task.getCurrentProbability());
            }
        };
        return c;
    }
    
}

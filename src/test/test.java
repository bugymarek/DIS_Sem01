/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Core.TaskA;
import Core.TaskB;

/**
 *
 * @author Bugy
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TaskA a = new TaskA(10000000, 3);      
        TaskB b = new TaskB(10000000, 3);
    }
    
}

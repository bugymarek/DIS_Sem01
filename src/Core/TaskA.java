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
public class TaskA extends Simulation{
    
    public TaskA(int count, int doors) {
        super(count, doors);
    }

    @Override
    void simulate() {
        createDoors();
        int carDoor = generateCarDoor();
        int firstChoice = generateFirstChoice();
        if(carDoor == firstChoice){
           incrementSuccess(); 
        } 
    }
    
}

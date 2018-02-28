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
public class TaskB extends Simulation{
    
     public TaskB(int count, int doors, Command command) {
        super(count, doors, command);
    }

    @Override
    void simulate() {
        int carDoor = generateCarDoor();
        int firstChoice = generateFirstChoice();
        int animalDoor = openAnimalDoor(carDoor, firstChoice);
        int secondChoice = generateSecondChoice(animalDoor, firstChoice);
        if(carDoor == secondChoice){
           incrementSuccess(); 
           //System.out.println(getSuccess());
        }
    }
}

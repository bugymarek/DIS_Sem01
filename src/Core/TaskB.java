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
public class TaskB extends MonteCarlo{
    
     public TaskB(int count, int doors) {
        super(count, doors);
    }

    @Override
    boolean doMonteCarlo() {
        int carDoor = generateCarDoor();
        int firstChoice = generateFirstChoice();
        int animalDoor = openAnimalDoor(carDoor, firstChoice);
        int secondChoice = generateSecondChoice(animalDoor, firstChoice);
        return carDoor == secondChoice;
    }
}

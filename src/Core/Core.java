/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Bugy
 */
public class Core extends Replications {
    private Random generatorSeed;
    private Random generatorCar;
    private Random generatorFirstChoice;
    private Random generatorAnimalDoor;
    private Random generatorSecondChoice;
    private int Doors;
    
    public Core(int count, int doors){
        super();
        this.Doors = doors;
        createRandoms();
        double probability =  super.doReprications(count); 
        System.out.println("Pravdepodobnost: " +  probability);
    }

    @Override
    boolean doMonteCarlo() {
        int carDoor = generateCarDoor();
        int firstChoice = generateFirstChoice();
        int animalDoor = generateAnimalDoor(carDoor);
        //int secondChoice = generateSecondChoice(carDoor, firstChoice);
        return carDoor == firstChoice;
    }

    private void createRandoms() {
        generatorSeed = new Random();
        generatorCar = new Random(generatorSeed.nextInt());
        generatorFirstChoice = new Random(generatorSeed.nextInt());
        generatorAnimalDoor = new Random(generatorSeed.nextInt());
        generatorSecondChoice = new Random(generatorSeed.nextInt());      
    }
    
    private int generateCarDoor(){
        return generatorCar.nextInt(Doors);
    }
    
    private int generateFirstChoice(){
        return generatorFirstChoice.nextInt(Doors);
    }
    
    private int generateAnimalDoor(int carDoor){
        while(true){
          int doorRnd = generatorAnimalDoor.nextInt(Doors);
          if(doorRnd != carDoor){
              return doorRnd;
          }   
        }
    }
    
    private int generateSecondChoice(int carDoor, int firstChoice){
        while(true){
            int secondChoiceDoor = generatorSecondChoice.nextInt(Doors);
            if(secondChoiceDoor != carDoor && secondChoiceDoor != firstChoice){
                return secondChoiceDoor;
            }
        }
    }
    
    
}

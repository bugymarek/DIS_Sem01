/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

import java.util.Random;

/**
 *
 * @author Bugy
 */
public abstract class MonteCarlo extends Replications{
    private Random generatorSeed;
    private Random generatorCar;
    private Random generatorFirstChoice;
    private Random generatorAnimalDoor;
    private Random generatorSecondChoice;
    private final int Doors;
    
    public MonteCarlo(int count, int doors){
        super();
        this.Doors = doors;
        createRandoms();
        double probability =  super.doReprications(count); 
        System.out.println("Pravdepodobnost: " +  probability);
    }

    private void createRandoms() {
        generatorSeed = new Random();
        generatorCar = new Random(generatorSeed.nextInt());
        generatorFirstChoice = new Random(generatorSeed.nextInt());
        generatorAnimalDoor = new Random(generatorSeed.nextInt());
        generatorSecondChoice = new Random(generatorSeed.nextInt());      
    }
    
    public int generateCarDoor(){
        return generatorCar.nextInt(Doors);
    }
    
    public int generateFirstChoice(){
        return generatorFirstChoice.nextInt(Doors);
    }
    
    public int generateAnimalDoor(int carDoor){
        while(true){
          int doorRnd = generatorAnimalDoor.nextInt(Doors);
          if(doorRnd != carDoor){
              return doorRnd;
          }   
        }
    }
    
    public int generateSecondChoice(int animalDoor, int firstChoice){
        while(true){
            int secondChoiceDoor = generatorSecondChoice.nextInt(Doors);
            if(secondChoiceDoor != animalDoor && secondChoiceDoor != firstChoice){
                return secondChoiceDoor;
            }
        }
    }

    @Override
    abstract boolean doMonteCarlo();
    }

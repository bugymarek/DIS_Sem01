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
    private Random generatorOpenAnimalDoor;
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
        generatorOpenAnimalDoor = new Random(generatorSeed.nextInt());
        generatorSecondChoice = new Random(generatorSeed.nextInt());      
    }
    
    public int generateCarDoor(){
        return generatorCar.nextInt(Doors);
    }
    
    public int generateFirstChoice(){
        return generatorFirstChoice.nextInt(Doors);
    }
    
    public int openAnimalDoor(int carDoor, int firstChoice){
        int doorRnd = generatorOpenAnimalDoor.nextInt(Doors - 2);
        return checkCorrectChoice(carDoor, firstChoice, doorRnd);
        
        //Test
//        System.out.println("Car: "+ carDoor + " Choice:" + firstChoice + " open door: " + doorRnd);
//        if(doorRnd == 9 )System.out.println("----------------------------------------------> " +doorRnd);
//        if(carDoor == doorRnd || firstChoice == doorRnd) {
//            System.out.print("error. Not open door with animal");
//            return 0;
//        }
    }
    
    public int generateSecondChoice(int animalDoor, int firstChoice){
            int secondChoiceDoor = generatorSecondChoice.nextInt(Doors - 2);
            return checkCorrectChoice(firstChoice, animalDoor, secondChoiceDoor);    
    }
    
    private int checkCorrectChoice(int firstDoor, int secondDoor, int randomDoor){
        while(randomDoor == firstDoor || randomDoor == secondDoor){
            randomDoor++;
        }
        return randomDoor;
    }

    @Override
    abstract boolean doMonteCarlo();
    }

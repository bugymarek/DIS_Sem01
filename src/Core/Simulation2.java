///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Core;
//
//import java.util.ArrayList;
//import java.util.Random;
//
///**
// *
// * @author Bugy
// */
//public abstract class Simulation2 extends MonteCarlo{
//    private Random generatorSeed;
//    private Random generatorCar;
//    private Random generatorFirstChoice;
//    private Random generatorOpenAnimalDoor;
//    private Random generatorSecondChoice;
//    private final int Doors;
//    private ArrayList<Integer> animalDorrs;
//    private ArrayList<Integer> availableDoors;
//    
//    
//    public Simulation2(int count, int doors){
//        super();
//        this.Doors = doors;
//        createRandoms();
//        double probability =  super.doReprications(count); 
//        System.out.println("Pravdepodobnost: " +  probability);
//    }
//
//    private void createRandoms() {
//        generatorSeed = new Random(10);
//        generatorCar = new Random(generatorSeed.nextInt());
//        generatorFirstChoice = new Random(generatorSeed.nextInt());
//        generatorOpenAnimalDoor = new Random(generatorSeed.nextInt());
//        generatorSecondChoice = new Random(generatorSeed.nextInt());      
//    }
//    
//    public int generateCarDoor(){
//        int carDoor = generatorCar.nextInt(animalDorrs.size());
//        animalDorrs.remove(carDoor);
//        return carDoor;
//    }
//    
//    public int generateFirstChoice(){
//        int firstChoice = generatorFirstChoice.nextInt(availableDoors.size());
//        //removeFromArr(firstChoice);
//        for(int i = 0; i < animalDorrs.size(); i++){
//            if(animalDorrs.get(i) == firstChoice){
//                animalDorrs.remove(i);
//                break;
//            }
//        }
//        availableDoors.remove(firstChoice);
//        return firstChoice;
//    }
//    
//    public void openAnimalDoor(){    
//        int doorRnd = generatorOpenAnimalDoor.nextInt(animalDorrs.size());
//        for(int i = 0; i < availableDoors.size(); i++){
//            if(availableDoors.get(i) == doorRnd){
//                availableDoors.remove(i);
//                break;
//            }
//        }
//        
//        //Test
////        System.out.println("Car: "+ carDoor + " Choice:" + firstChoice + " open door: " + doorRnd);
////        if(doorRnd == 9 )System.out.println("----------------------------------------------> " +doorRnd);
////        if(carDoor == doorRnd || firstChoice == doorRnd) {
////            System.out.print("error. Not open door with animal");
////            return 0;
////        }
//    }
//    
//    public int generateSecondChoice(){
//            int secondChoiceIndex = generatorSecondChoice.nextInt(availableDoors.size());
//            return availableDoors.get(secondChoiceIndex);    
//    }
//
//    @Override
//    abstract boolean simulate();
//
//    public void createDoors() {
//        animalDorrs = new ArrayList<>();
//        availableDoors = new ArrayList<>();
//        for(int i = 0; i < Doors; i++){
//            animalDorrs.add(i);
//            availableDoors.add(i);
//        }
//    }
//    }

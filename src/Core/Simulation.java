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
public abstract class Simulation extends MonteCarlo {

    private Random generatorSeed;
    private Random generatorCar;
    private Random generatorFirstChoice;
    private Random generatorOpenAnimalDoor;
    private Random generatorOpenAnimalDoor2;
    private Random generatorSecondChoice;
    private final int ReplicationCount;
    private final int Doors;
    private ArrayList<Integer> availableModeratorDoors;
    private ArrayList<Integer> availableCompetitorDoors;

    public Simulation(int count, int doors) {
        super(count);
        this.Doors = doors;
        this.ReplicationCount = count;
        createRandoms();
    }

    public void replicate() {
        super.doReprications(ReplicationCount);
        //System.out.println("Pravdepodobnost: " +  probability);
    }

    private void createRandoms() {
        generatorSeed = new Random(100);
        generatorCar = new Random(generatorSeed.nextInt());
        generatorFirstChoice = new Random(generatorSeed.nextInt());
        generatorOpenAnimalDoor = new Random(generatorSeed.nextInt());
        generatorOpenAnimalDoor2 = new Random(generatorSeed.nextInt());
        generatorSecondChoice = new Random(generatorSeed.nextInt());
    }

    public int generateCarDoor() {
        //System.out.println("-----------------------------------------------------");
        int carDoor = generatorCar.nextInt(availableModeratorDoors.size());
        //System.out.println("Auto: " + carDoor);
        availableModeratorDoors.remove(carDoor);
        //printArr("Mozne dvere pre moderatora", availableModeratorDoors);
        return carDoor;
    }

    public int generateFirstChoice() {
        int firstChoice = generatorFirstChoice.nextInt(availableCompetitorDoors.size());
        //removeFromArr(firstChoice);
        //System.out.println("Sutaziaci: " + firstChoice);
        for (int i = 0; i < availableModeratorDoors.size(); i++) {
            if (availableModeratorDoors.get(i) == firstChoice) {
                availableModeratorDoors.remove(i);
                break;
            }
        }
        //printArr("Mozne dvere pre moderatora", availableModeratorDoors);
        availableCompetitorDoors.remove(firstChoice);
        //printArr("Mozne dvere pre sutaziaceho", availableCompetitorDoors);
        return firstChoice;
    }

    public void openAnimalDoor() {
        int doorRndIndex;
        if (availableModeratorDoors.size() == availableCompetitorDoors.size()) {
            // competitor choice door where is car
            doorRndIndex = generatorOpenAnimalDoor.nextInt(availableModeratorDoors.size());
        } else {
            // // competitor choice door where is not car, so we heve to use other random generator
            doorRndIndex = generatorOpenAnimalDoor2.nextInt(availableModeratorDoors.size());
        }
        int doorOpen = availableModeratorDoors.get(doorRndIndex);
        //System.out.println("Moderator otvoril: " + doorOpen);
        for (int i = 0; i < availableCompetitorDoors.size(); i++) {
            if (availableCompetitorDoors.get(i) == doorOpen) {
                availableCompetitorDoors.remove(i);
                break;
            }
        }
    }

    public int generateSecondChoice() {
        int secondChoiceIndex = generatorSecondChoice.nextInt(availableCompetitorDoors.size());
        return availableCompetitorDoors.get(secondChoiceIndex);
    }

    @Override
    abstract void simulate();

    public void createDoors() {
        availableModeratorDoors = new ArrayList<>();
        availableCompetitorDoors = new ArrayList<>();
        for (int i = 0; i < Doors; i++) {
            availableModeratorDoors.add(i);
            availableCompetitorDoors.add(i);
        }
    }

    private void printArr(String name, ArrayList<Integer> arr) {
        System.out.print(name);
        System.out.print("[ ");
        for (int doorNumber : arr) {
            System.out.print(doorNumber);
            System.out.print(" , ");
        }
        System.out.println(" ]");
    }
}

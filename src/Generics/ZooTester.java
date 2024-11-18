package Generics;

import PolymorphicAnimals.*;

import java.util.ArrayList;
import java.util.HashMap;

/*
used for generic methods
 */
public class ZooTester {
    public static void main(String[] args) {

        Zoo<Animal> newZoo = new Zoo<>();

        ArrayList<Animal> zoo = new ArrayList<>();

        zoo.add(new Dog("Fiona", 4, "Black", true));
        zoo.add(new Panda("Po", 16, "White and Black"));
        zoo.add(new RedPanda("Priya", 2, "Red and White"));

        ArrayList<Dog> kennel = new ArrayList<>();
        kennel.add(new Dog("Fiona", 5, "Black", true));
        kennel.add(new Dog("Bruce", 3, "Chocolate", true));
        kennel.add(new Dog("Glory", 8, "Yellow", true));

        ArrayList<Snake> listOfSnakes = new ArrayList<>();
        listOfSnakes.add(new Copperhead("Steve",12,"Copper",false));
        listOfSnakes.add(new Copperhead("Jeff",5,"Copper",false));
        listOfSnakes.add(new BallPython("Randy",4,"Copper",false));

        ArrayList<Amphibian> listOfAmphibians = new ArrayList<>();
        listOfAmphibians.add(new Frog("Bob",5,"green"));
        listOfAmphibians.add(new Salamander("Alice",7,"purple"));
        listOfAmphibians.add(new Frog("Katherine",5,"Red"));

        playWithAnimals(zoo);
        playWithAnimals(kennel);
        playWithAnimals(listOfSnakes);
        playWithAnimals(listOfAmphibians);
    }

    private static void playWithAnimals(ArrayList<? extends Animal> listOfAnimals){
        for(Animal o : listOfAnimals){
            System.out.println("Playing with " + o.getName());
        }
    }

    private static void playWithAnimal(Animal animal){
        System.out.println("Playing with " + animal.getName());
    }
}

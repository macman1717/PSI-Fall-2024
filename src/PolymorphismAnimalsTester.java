import PolymorphicAnimals.*;

import java.util.ArrayList;
import java.util.Collections;

public class PolymorphismAnimalsTester {
    public static void main(String[] args) {

        System.out.println("Maggots".compareTo("Flies"));
        ArrayList<Animal> zoo = new ArrayList<>();

        zoo.add(new Dog("Fiona",4,"Black",true));
        zoo.add(new Panda("Po",16,"White and Black"));
        zoo.add(new RedPanda("Priya",2,"Red and White"));
        zoo.add(new Frog("Kermit",69,"Green"));
        zoo.add(new Salamander("Fiona",4,"Black and Yellow"));
        zoo.add(new Copperhead("Bob", 14, "Copper", true));



        for(Animal animal: zoo){
            System.out.println((animal.getDiet()));
        }

        Collections.sort(zoo);
        System.out.println();
        for(Animal animal: zoo){
            System.out.println((animal.getDiet()));
        }

       ArrayList<Pet> pets = new ArrayList<>();
       pets.add(new Dog("Dog food", "House", true,true,"Yellow",true));

       for(Pet pet : pets){
           playWithPet(pet);
       }

       ArrayList<Integer> ints = new ArrayList<>();
       for(int i = 0; i <= 10; i++){
           ints.add((int) (Math.random() * 100));
       }

       System.out.println(ints);

       Collections.sort(ints);

       System.out.println(ints);

    }

    public static void pokeAnimal(Animal animal){
        animal.makeNoise();
    }

    public static void playWithPet(Pet pet){
        pet.playWithOwner();
    }
}

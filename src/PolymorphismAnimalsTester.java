import PolymorphicAnimals.*;

import java.util.ArrayList;
import java.util.Collections;

public class PolymorphismAnimalsTester {
    public static void main(String[] args) {

        System.out.println("Maggots".compareTo("Flies"));
        ArrayList<Animal> zoo = new ArrayList<>();
        zoo.add(new Dog("Meat","forest",true,true,"Brown",false));
        zoo.add(new Panda("Bamboo","China",false,false,"Black and White"));
        zoo.add(new RedPanda("Tree-leaves","South-East Asia",true,false,"Red and White"));
        zoo.add(new Frog("Flies","swamps",true,true));
        zoo.add(new Salamander("Maggots","swamp",true,true));
        zoo.add(new Copperhead("Vermin", "South-East America", true, true, "Copper", 90));


        for(Animal animal: zoo){
            System.out.println((animal.getDiet()));
        }

        Collections.sort(zoo);
        System.out.println();
        for(Animal animal: zoo){
            System.out.println((animal.getDiet()));
        }
//
//        ArrayList<Pet> pets = new ArrayList<>();
//        pets.add(new Dog("Dog food", "House", true,true,"Yellow",true));
//
//        for(Pet pet : pets){
//            playWithPet(pet);
//        }

//        ArrayList<Integer> ints = new ArrayList<>();
//        for(int i = 0; i <= 10; i++){
//            ints.add((int) (Math.random() * 100));
//        }
//
//        System.out.println(ints);
//
//        Collections.sort(ints);
//
//        System.out.println(ints);
    }

    public static void pokeAnimal(Animal animal){
        animal.makeNoise();
    }

    public static void playWithPet(Pet pet){
        pet.playWithOwner();
    }
}

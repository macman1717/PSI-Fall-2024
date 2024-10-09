import PolymorphicAnimals.*;

import java.util.ArrayList;

public class PolymorphismAnimalsTester {
    public static void main(String[] args) {
        ArrayList<Animal> zoo = new ArrayList<>();
        zoo.add(new Dog("Fiona",4,"Black",true));
        zoo.add(new Panda("Po",16,"White and Black"));
        zoo.add(new RedPanda("Priya",2,"Red and White"));
        zoo.add(new Frog("Kermit",69,"Green"));
        zoo.add(new Salamander("Fiona",4,"Black and Yellow"));
        zoo.add(new Copperhead("Bob", 14, "Copper", true));

        for(Animal animal: zoo){
            pokeAnimal(animal);
        }

        for(Animal animal: zoo){
            System.out.println(animal);
        }
    }

    public static void pokeAnimal(Animal animal){
        animal.makeNoise();
    }
}

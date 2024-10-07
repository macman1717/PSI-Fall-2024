import PolymorphicAnimals.*;

import java.util.ArrayList;

public class PolymorphismAnimalsTester {
    public static void main(String[] args) {
        ArrayList<Animal> zoo = new ArrayList<>();
        zoo.add(new Dog("meat","forest",true,true,"Brown",false));
        zoo.add(new Panda("Bamboo","China",false,false,"Black and White"));
        zoo.add(new RedPanda("Tree-leaves","South-East Asia",true,false,"Red and White"));
        zoo.add(new Frog("Flies","swamps",true,true));
        zoo.add(new Salamander("Flies","swamp",true,true));

        for(Animal animal: zoo){
            pokeAnimal(animal);
        }
    }

    public static void pokeAnimal(Animal animal){
        animal.makeNoise();
    }
}

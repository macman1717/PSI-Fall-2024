package PolymorphicAnimals;

public class Salamander extends Amphibian{
    public Salamander(String diet, String location, boolean isPrey, boolean isPredator) {
        super(diet, location, isPrey, isPredator);
    }

    @Override
    public void makeNoise(){
        System.out.println("I am a salamander");
    }
}

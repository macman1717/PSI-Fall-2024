package PolymorphicAnimals;

public class Frog extends Amphibian{
    public Frog(String diet, String location, boolean isPrey, boolean isPredator) {
        super(diet, location, isPrey, isPredator);
    }

    @Override
    public void makeNoise(){
        System.out.println("Ribbet");
    }
}

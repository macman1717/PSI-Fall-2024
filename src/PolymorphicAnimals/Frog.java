package PolymorphicAnimals;

public class Frog extends Amphibian implements Pet{
    public Frog(String diet, String location, boolean isPrey, boolean isPredator) {
        super(diet, location, isPrey, isPredator);
    }

    @Override
    public void makeNoise(){
        System.out.println("Ribbet");
    }

    @Override
    public void playWithOwner() {
        System.out.println("I'm eating flies.");
    }
}

package PolymorphicAnimals;


public class Frog extends Amphibian implements Pet{
    public Frog(String name, int ageInYears, String color) {
        super(name, ageInYears, color);
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

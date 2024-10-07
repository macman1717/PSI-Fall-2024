package PolymorphicAnimals;

public abstract class Amphibian extends Animal{
    private String bloodTemp;
    public Amphibian(String diet, String location, boolean isPrey, boolean isPredator) {
        super(diet, location, isPrey, isPredator);
        bloodTemp = "Cold Blooded";
    }

}

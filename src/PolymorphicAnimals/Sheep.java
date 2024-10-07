package PolymorphicAnimals;

public class Sheep extends Mammal{
    public Sheep(String diet, String location, boolean isPrey, boolean isPredator, String furColor) {
        super(diet, location, isPrey, isPredator, furColor);
    }

    @Override
    public void makeNoise() {

    }
}

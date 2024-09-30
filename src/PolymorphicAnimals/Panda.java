package PolymorphicAnimals;

public class Panda extends Mammal{
    public Panda(String diet, String location, boolean isPrey, boolean isPredator, String furColor) {
        super(diet, location, isPrey, isPredator, furColor);
    }

    @Override
    public void makeNoise() {
        System.out.println("I freaking love Bamboo!");
    }
}

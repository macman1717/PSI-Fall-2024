package PolymorphicAnimals;

public class RedPanda extends Panda{
    public RedPanda(String diet, String location, boolean isPrey, boolean isPredator, String furColor) {
        super(diet, location, isPrey, isPredator, furColor);
    }

    @Override
    public void makeNoise() {
        System.out.println("I am the cutest, and I'm not fat like my parent class");
    }

}

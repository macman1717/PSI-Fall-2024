package PolymorphicAnimals;

public class Dog extends Mammal implements Pet {
    private boolean isPet;

    public Dog(String diet, String location, boolean isPrey, boolean isPredator, String furColor, boolean isPet) {
        super(diet, location, isPrey, isPredator, furColor);
        this.isPet = isPet;
    }

    @Override
    public void makeNoise() {
        System.out.println("BARK BARK BARK BARK!");
    }

    public boolean isPet() {
        return isPet;
    }

    public void setPet(boolean pet) {
        isPet = pet;
    }

    @Override
    public void playWithOwner() {
        System.out.println("I'm playing fetch.");
    }
}

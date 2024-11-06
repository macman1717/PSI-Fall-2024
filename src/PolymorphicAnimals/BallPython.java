package PolymorphicAnimals;


public class BallPython extends Snake implements Pet{
    public BallPython(String name, int ageInYears, String color, boolean isVenomous) {
        super(name, ageInYears, color, isVenomous);
    }

    @Override
    public void makeNoise() {
        System.out.println("I am a Ball Python, Slither!!!");
    }

    @Override
    public void playWithOwner() {
        System.out.println("I'm wrapping around my owner's hand.");
    }
}

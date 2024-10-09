package PolymorphicAnimals;

public class BallPython extends Snake implements Pet{
    public BallPython(String diet, String location, boolean isPrey, boolean isPredator, String scaleColor, int daysInEgg) {
        super(diet, location, isPrey, isPredator, scaleColor, daysInEgg);
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

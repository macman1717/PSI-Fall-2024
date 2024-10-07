package PolymorphicAnimals;

public class BallPython extends Snake {
    public BallPython(String diet, String location, boolean isPrey, boolean isPredator, String scaleColor, int daysInEgg) {
        super(diet, location, isPrey, isPredator, scaleColor, daysInEgg);
    }

    @Override
    public void makeNoise() {
        System.out.println("I am a Ball Python, Slither!!!");
    }
}

package PolymorphicAnimals;

public class Alligator extends Reptile{
    public Alligator(String diet, String location, boolean isPrey, boolean isPredator, String scaleColor, int daysInEgg) {
        super(diet, location, isPrey, isPredator, scaleColor, daysInEgg);
    }

    @Override
    public void makeNoise() {

    }
}

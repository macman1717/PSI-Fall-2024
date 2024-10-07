package PolymorphicAnimals;

public abstract class Snake extends Reptile{
    public Snake(String diet, String location, boolean isPrey, boolean isPredator, String scaleColor, int daysInEgg) {
        super(diet, location, isPrey, isPredator, scaleColor, daysInEgg);
    }
}

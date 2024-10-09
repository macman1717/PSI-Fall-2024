package PolymorphicAnimals;

public class Copperhead extends Snake{
    public Copperhead(String diet, String location, boolean isPrey, boolean isPredator, String scaleColor, int daysInEgg) {
        super(diet, location, isPrey, isPredator, scaleColor, daysInEgg);
    }

    @Override
    public void makeNoise() {
        System.out.println("HHHSSSsssss");
    }
}

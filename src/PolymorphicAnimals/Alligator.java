package PolymorphicAnimals;

public class Alligator extends Reptile{
    public Alligator(String name, int ageInYears, String color, boolean isVenomous) {
        super(name, ageInYears, color, isVenomous);
    }

    @Override
    public void makeNoise() {

    }
}
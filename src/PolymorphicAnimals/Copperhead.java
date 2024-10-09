package PolymorphicAnimals;

public class Copperhead extends Reptile{
    public Copperhead(String name, int ageInYears, String color, boolean isVenomous) {
        super(name, ageInYears, color, isVenomous);
    }

    @Override
    public void makeNoise() {
        System.out.println("HHHSSSsssss");
    }
}

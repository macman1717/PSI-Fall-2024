package PolymorphicAnimals;

public abstract class Reptile extends Animal{
    private String scaleColor;
    private int daysInEgg;
    private boolean isVenomous;


    public Reptile(String diet, String location, boolean isPrey, boolean isPredator, String scaleColor, int daysInEgg) {
        super(diet, location, isPrey, isPredator);
        this.scaleColor = scaleColor;
        this.daysInEgg = daysInEgg;
    }

    public void layEggs(){
        System.out.println("laying eggs");
    }

    public boolean isVenomous() {
        return isVenomous;
    }

    public void setVenomous(boolean venomous) {
        isVenomous = venomous;
    }

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    public int getDaysInEgg() {
        return daysInEgg;
    }

    public void setDaysInEgg(int daysInEgg) {
        this.daysInEgg = daysInEgg;
    }
}

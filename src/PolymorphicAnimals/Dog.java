package PolymorphicAnimals;

public class Dog extends Mammal implements Pet {
    private boolean isPet;

    public Dog(String name, int ageInYears, String color, boolean isPet) {
        super(name, ageInYears, color);
        this.isPet = isPet;
    }

    @Override
    public void makeNoise() {
        System.out.println("BARK BARK BARK BARK!");
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(super.toString());
        sb.append(", isPet=").append(isPet);
        return sb.toString();
    }

    public boolean isPet() {
        return isPet;
    }

    public void setPet(boolean pet) {
        isPet = pet;
    }

    @Override
    public String playWithOwner() {
        return "I'm playing fetch.";
    }
}

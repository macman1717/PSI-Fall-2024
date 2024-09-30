package PolymorphicAnimals;

public class Mammal extends Animal {
    private String furColor;

    public Mammal(String diet, String location, boolean isPrey, boolean isPredator, String furColor) {
        super(diet, location, isPrey, isPredator);
        this.furColor = furColor;
        this.isWarmBlooded = true;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(super.toString());
        sb.append("furColor='").append(furColor).append('\'');
        sb.append(", isWarmBlooded=").append(isWarmBlooded);
        return sb.toString();
    }

    public void drinkMilk(){
        System.out.println("I love not being lactose intolerant.");
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
}

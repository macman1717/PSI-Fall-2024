package PolymorphicAnimals;

public abstract class Animal implements Comparable<Animal>{
    private String diet;
    private String location;
    private boolean isPrey;
    private boolean isPredator;
    public boolean isWarmBlooded;

    public Animal(String diet, String location, boolean isPrey, boolean isPredator) {
        this.diet = diet;
        this.location = location;
        this.isPrey = isPrey;
        this.isPredator = isPredator;
    }


    public abstract void makeNoise();
    public void eat(String food){
        System.out.println("Eating " + food + ", nom nom nom.");
    }

    public void sleep(){
        System.out.println("ZZZZzzzz");
    }

    public void roam(){
        System.out.println("I am moving around!");
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("diet='").append(diet).append('\'');
        sb.append(", location='").append(location).append('\'');
        sb.append(", isPrey=").append(isPrey);
        sb.append(", isPredator=").append(isPredator);
        return sb.toString();
    }

    public boolean isWarmBlooded() {
        return isWarmBlooded;
    }

    public void setWarmBlooded(boolean warmBlooded) {
        isWarmBlooded = warmBlooded;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isPrey() {
        return isPrey;
    }

    public void setPrey(boolean prey) {
        isPrey = prey;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    @Override
    public int compareTo(Animal o){
        if(this.getDiet().compareTo(o.getDiet()) == 0){
            return 0;
        }else if(this.getDiet().compareTo(o.getDiet()) > 0){
            return -1;
        }else {
            return 1;
        }
//        return this.getDiet().compareTo(o.getDiet());
    }
}

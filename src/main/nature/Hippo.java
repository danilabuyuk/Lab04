package nature;

public class Hippo extends Animal{
    public Hippo(String name) {
        super(name);
    }
    public void eat() {
        System.out.println("slurp...");
        super.setHungerLevel(getHungerLevel() - 1);
    }
    public void makeNoise() {
        System.out.println("blub...");
    }
}
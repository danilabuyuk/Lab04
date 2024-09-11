package nature;

public class Wolf extends Canine{
    public Wolf(String name) {
        super(name);
    }
    public void eat() {
        System.out.println("rip with teeth...");
        super.setHungerLevel(getHungerLevel() - 2);
    }
    public void makeNoise() {
        System.out.println("growl...");
    }
}

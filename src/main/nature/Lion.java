package nature;

public class Lion extends Feline {
    public Lion(String name) {
        super(name);
    }
    public void eat() {
        System.out.println("rip with teeth...");
        super.setHungerLevel(getHungerLevel() - 2);
    }
    @Override public void makeNoise() {
        System.out.println("roar...");
    }
}

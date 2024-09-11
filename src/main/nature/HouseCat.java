package nature;

public class HouseCat extends Feline implements Pet {
    public HouseCat(String name) {
        super(name);
    }
    public void eat() {
        System.out.println("crunch crunch...");
        super.setHungerLevel(getHungerLevel() - 3);
    }
    public void play() {
        System.out.println("frolic...");
    }
    public void beFriendly() {
        System.out.println("purr...");
    }
}

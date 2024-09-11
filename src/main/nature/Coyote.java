package nature;

public class Coyote extends Canine{
    public Coyote(String name) {
        super(name);
    }
    public void eat() {
        System.out.println("gnaws...");
        super.setHungerLevel(getHungerLevel() - 2);
    }
    public void makeNoise() {
        System.out.println("howl...");
    }
}


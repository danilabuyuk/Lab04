package nature;

public abstract class Animal {
    //FIELDS
    protected String name;
    protected int hungerLevel = 0;
    //FIELDS

    //CONSTRUCTOR
    public Animal(String name) {
        setName(name);
    }
    //CONSTRUCTOR

    //GETTERS
    public String getName() {
        return name;
    }
    public int getHungerLevel() {
        return hungerLevel;
    }
    //GETTERS

    //SETTERS
    public void setName(String name) {
        this.name = name;
    }
    public void setHungerLevel(int hungerLevel) {
        if(hungerLevel > 10) {this.hungerLevel = 10;}
        else if(hungerLevel < 0) {this.hungerLevel = 0;}
        else {this.hungerLevel = hungerLevel;}
    }
    //SETTERS

    //FUNCTIONS
    public void sleep() {
        System.out.println("sleeping...");
        setHungerLevel(10);
    }
    public void roam() {
        System.out.println("moving around...");
        setHungerLevel(getHungerLevel() + 1);
    }
    public abstract void eat();
    public abstract void makeNoise();
    //FUNCTIONS
}

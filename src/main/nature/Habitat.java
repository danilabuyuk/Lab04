package nature;

import java.util.ArrayList;

public class Habitat {
    //FIELDS
    private String name;
    private double latitude;
    private double longitude;
    private ArrayList<Animal> animals = new ArrayList<Animal>();
    //FIELDS

    //CONSTRUCTOR
    public Habitat(String name, double lat, double lon) {
        setName(name);
        setLatitude(lat);
        setLongitude(lon);
    }
    //CONSTRUCTOR

    //GETTERS
    public String getName() {return name;}
    public double getLatitude() {return latitude;}
    public double getLongitude() {return longitude;}
    public int getNumOfAnimals() {return animals.size();}
    //GETTERS

    //SETTERS
    public void setName(String name) {
        this.name = name;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    //SETTERS

    //FUNCTIONS
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
    public void testAnimals() {
        System.out.println(name);
        System.out.println(latitude);
        System.out.println(longitude);
        System.out.println(getNumOfAnimals());
        for(Animal i : animals) {
            i.sleep();
            i.makeNoise();
            i.eat();
            i.roam();
            if( i instanceof Pet) {
                ((Pet)i).play();
                ((Pet)i).beFriendly();
            }
        }
    }
    //FUNCTIONS
}

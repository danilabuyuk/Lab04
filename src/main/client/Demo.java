package nature;

/**
 * Demo used to manually test the program.
 * 
 * @author 
 * @version 
 */
public class Demo
{
	/**
     * Runs the demo.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args)
    {
        Habitat demo = new Habitat("test", 17, 38);
        demo.addAnimal(new Coyote("a"));
        demo.addAnimal(new Dog("b"));
        demo.addAnimal(new Hippo("c"));
        demo.addAnimal(new HouseCat("d"));
        demo.addAnimal(new Lion("e"));
        demo.addAnimal(new Ocelot("f"));
        demo.addAnimal(new SiameseCat("g"));
        demo.addAnimal(new Wolf("h"));
        demo.testAnimals();
    }
}

// Hedgehog implements the animal interface
public class hedgehog implements Animal {
    @Override
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The hedgehog Grunt Grunt");
    }

    @Override
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }

    @Override
    public void color() {
        System.out.println("The hedgehog is brown");
    }
}

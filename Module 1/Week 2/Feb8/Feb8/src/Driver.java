public class Driver {
    public static void main(String[] args){
        Cat Anna = new Cat("Anna", 5, "Zyad");
        Dog Toby = new Dog("Toby", 10, "Zyad");
        Snake Snakey = new Snake("Snakey", 2, "Joe");
        Tiger Joe = new Tiger("Joe", 1, "Mike Tyson");
        Panda Po = new Panda("Po", 25, "Kung Fu Panda");

        System.out.println(Anna + ". " + Anna.speak());
        System.out.println(Toby + ". " + Toby.speak());
        System.out.println(Snakey + ". " + Snakey.speak());
        System.out.println(Joe + ". " + Joe.speak() +" " + "And my owner is " + Joe.owner);
        System.out.println(Po + ". " + Po.speak() + " " + "And I am " + Po.age + " years old.");

    }

}

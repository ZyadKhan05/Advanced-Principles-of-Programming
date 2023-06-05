// This program was completed by Zyad Khan for CIS-232-01 Lab #1 on 2/1/23
// The purpose of this program is to get the attributes from the sub class from the user and gets the attributes from the super class, which both are displayed to the user.


import java.util.Scanner; // import the scanner method

public class main {
    public static void main (String[] args){

        // Display Purpose of Program
        System.out.println("The purpose of this program is get the attributes from the sub class from the user and gets the attributes from the super class, which both are displayed to the user. ");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the Name of the Character: ");
        String name = player.getName(keyboard.next());
        System.out.println("Enter the Color of the Character");
        System.out.println("(Black, Blue, Green, Pink, Red, White, Yellow): ");
        String color = player.getColor(keyboard.next());
        System.out.println("(Beast, Fairy, Giant, Goblin, Knight): ");
        System.out.println("Enter the Species of the Character: ");
        String species = player.getSpecies(keyboard.next());

        player player = new player();
        double speed = player.getSpeed();
        double strength = player.getStrength();
        boolean personality = player.getPersonality();

        String type;
        if (personality) {
            type = "Good";
        }
        else {
            type = "Bad";
        }


        System.out.printf("Loading Character...");
        System.out.printf("\nName: %s \nColor: %s \nSpecies: %s\nSpeed: %.2f \nStrength: %.2f\nGood or Bad?: %s \n", name, color,species, speed, strength, type);


    }
}

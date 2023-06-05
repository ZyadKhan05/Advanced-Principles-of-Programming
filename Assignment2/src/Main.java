// This program was completed by Zyad Khan for CIS-232-01 Assignment 2 on 2/15/2023
// The purpose of this program is to implement face interface using methods in order to display a Face type image and color.

import java.util.Scanner; // import the Scanner class
public class Main {
    public static void main (String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("The purpose of this program is to implement face interface using methods in order to display a Face type image and color.");

        // Initialize the choice variable to use for the menu
        int choice;

        System.out.println("============================");
        System.out.println("|   Robot Face Generator   |");
        System.out.println("============================");
        System.out.println("| Options:                 |");
        System.out.println("|        1. Happy Face     |");
        System.out.println("|        2. Sad Face       |");
        System.out.println("|        3. Angry Face     |");
        System.out.println("|        4. Surprised Face |");
        System.out.println("|        5. Exit           |");
        System.out.println("============================");

        // Ask the user to select an option from the menu in order to generate a face using the Keyboard class that is created to prevent exceptions
        choice = Keyboard.inInt("Select option from the Menu: ");

        // Intialize the boolean variable to use for the menu to be true so that the menu can be used as long as the user selects a valid option
        boolean run = true;
        // While the run variable is true, the switch statement will run until the user selects a valid option to exit
        while (run) {
            // Switch method to have the user select an option from the menu
            switch (choice) {
                // Happy Face method
                case 1:
                    Happy happyFace = new Happy();
                    happyFace.level = Keyboard.inInt("Select your level: ");
                    happyFace.eyebrow();
                    happyFace.eyes();
                    happyFace.nose();
                    happyFace.mouth();
                    happyFace.color();
                    choice = Keyboard.inInt("Choice Again? Enter in your choice again or 5 to exit: ");
                    break;

                case 2:
                    // Sad Face method
                    Sad sadFace = new Sad();
                    sadFace.level = Keyboard.inInt("Select your level: ");
                    sadFace.eyebrow();
                    sadFace.eyes();
                    sadFace.nose();
                    sadFace.mouth();
                    sadFace.color();
                    choice = Keyboard.inInt("Choice Again? Enter in your choice again or 5 to exit: ");
                    break;

                case 3:
                    // Angry Face method
                    Angry angryFace = new Angry();
                    angryFace.level = Keyboard.inInt("Select your level: ");
                    angryFace.eyebrow();
                    angryFace.eyes();
                    angryFace.nose();
                    angryFace.mouth();
                    angryFace.color();
                    choice = Keyboard.inInt("Choice Again? Enter in your choice again or 5 to exit: ");
                    break;

                case 4:
                    // Angry Face method
                    Surprised surprisedFace = new Surprised();
                    surprisedFace.level = Keyboard.inInt("Select your level: ");
                    surprisedFace.eyebrow();
                    surprisedFace.eyes();
                    surprisedFace.nose();
                    surprisedFace.mouth();
                    surprisedFace.color();
                    choice = Keyboard.inInt("Choice Again? Enter in your choice again or 5 to exit: ");
                    break;

                case 5:
                    // Exit option
                    System.out.println("Exit selected... Goodbye!!");
                    run = false; // end the while loop
                    break;

                default: // any other integer that is not valid
                    System.out.println("Input Error... Please select a correct value from the menu");
                    choice = Keyboard.inInt("Select option again: ");
                    break;
            }
        }
    }
}


// Instead of using the Java Scanner class, we use this class Keyboard which will catch and handle exceptions
class Keyboard {
    public static void printPrompt(String prompt) {
        System.out.print(prompt + " "); // Printing the prompt String from Keyboard
    }


    public static void scannerMethod() {
        int read; // Variable to view the byte value of input
        try {
            while ((System.in.available()) != 0) // While there are bytes that can be read from the input
                read = System.in.read(); // Reads the next byte of data from the input
        }
        catch (java.io.IOException e) { // If there are any Java IO errors, input out an error rather than crashing
            System.out.println("Java IO Error");
        }
    }

    public static String inString(String prompt) {
        scannerMethod();
        printPrompt(prompt); // Prints the prompt
        return inString();
    }

    public static String inString() {
        int aChar;
        String s = "";
        boolean finished = false;

        while (!finished) {
            try {
                aChar = System.in.read();
                if (aChar < 0 || (char) aChar == '\n')
                    finished = true;
                else if ((char) aChar != '\r') // Moves cursor to the beginning of the line
                    s = s + (char) aChar; // Enter into string
            }

            catch (java.io.IOException e) { // If there are any IO exception errors, print out error message
                System.out.println("Input error");
                finished = true;
            }
        }
        return s;
    }

    public static int inInt(String prompt) {
        while (true) {
            scannerMethod();
            printPrompt(prompt);
            try {
                return Integer.valueOf(inString().trim()).intValue();
            }

            catch (NumberFormatException e) {
                System.out.println("Invalid input. Not an integer");
            }
        }
    }

    public static char inChar(String prompt) {
        int aChar = 0;
        scannerMethod();
        printPrompt(prompt);
        try {
            aChar = System.in.read();
        }
        catch (java.io.IOException e) {
            System.out.println("Input error");
        }
        scannerMethod();
        return (char) aChar;
    }

    public static double inDouble(String prompt) {
        while (true) {
            scannerMethod();
            printPrompt(prompt);
            try {
                return Double.valueOf(inString().trim()).doubleValue();
            }
            catch (NumberFormatException e) {
                System.out
                        .println("Invalid input. Not a floating point number");
            }
        }
    }
}



// This program was completed by Zyad Khan for CIS-232-01 Assignment 3 on 2/27/2023
// The purpose of this program is to prompt the user to choose an option from the menu which are:
// reading and writing to binary files and random access files. The program has input validation for the user's choice
// and exception handling for the features of the program.

import java.io.*; // Import the java.io package
import java.util.Scanner; // Import the Scanner class
public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("The purpose of this program is to prompt the user to choose an option from the menu which are: ");
        System.out.println("Reading and writing to binary files and random access files.");
        System.out.println("The program has input validation for the user's choice and exception handling for the features of the program.");

        Scanner scanner = new Scanner(System.in);

        int choice;
        String fileName;
        String fileContents;
        int position;

        System.out.println("===================================");
        System.out.println("|    Write & Read Binary File     |");
        System.out.println("===================================");
        System.out.println("| Options:                        |");
        System.out.println("|   1. Write a Binary File        |");
        System.out.println("|   2. Read a Binary File         |");
        System.out.println("|   3. Write a Random-Access File |");
        System.out.println("|   4. Read a Random-Access File  |");
        System.out.println("|   5. Delete a File              |");
        System.out.println("|   6. Exit                       |");
        System.out.println("===================================");

        // Ask the user to select an option from the menu in order to generate a
        choice = Keyboard.inInt("Select option from the Menu: ");

        // Intialize the boolean variable to use for the menu to be true so that the menu can be used as long as the user selects a valid option
        boolean run = true;
        // While the run variable is true, the switch statement will run until the user selects a valid option to exit
        while (run) {
            // Switch method to have the user select an option from the menu
            switch (choice) {
                case 1:
                    fileName = Keyboard.inString("Please enter the name of the file you would like to create: ");
                    fileContents = Keyboard.inString("Please enter the " + fileName + ".dat contents: ");
                    WriteBinaryFile.Write(fileName, fileContents);
                    choice = Keyboard.inInt("Choice Again? Enter in your choice again or 6 to exit: ");
                    break;

                case 2:
                    fileName = Keyboard.inString("Please enter the name of the file you would like to read: ");
                    ReadBinaryFile.Read(fileName);
                    // Figure out how to re-ask the name for the file
                    choice = Keyboard.inInt("Choice Again? Enter in your choice again or 6 to exit: ");
                    break;

                case 3:
                    fileName = Keyboard.inString("Please enter the name of the file you would like to create: ");
                    fileContents = Keyboard.inString("Please enter the " + fileName + ".dat contents: ");
                    WriteRandomAccessFile.Write(fileName, fileContents);
                    choice = Keyboard.inInt("Choice Again? Enter in your choice again or 6 to exit: ");
                    break;

                case 4:
                    fileName = Keyboard.inString("Please enter the name of the file you would like to read: ");
                    position = Keyboard.inInt("Please enter which Random Character that you would like to access: ");
                    ReadRandomAccessFile.Read(fileName, position, true);
                    // Figure out how to re-ask the name for the file
                    choice = Keyboard.inInt("Choice Again? Enter in your choice again or 6 to exit: ");
                    break;

                case 5:
                    fileName = Keyboard.inString("Please enter the name and extension of the file that you would like to delete: ");
                    DeletingFile.Delete(fileName);
                    choice = Keyboard.inInt("Choice Again? Enter in your choice again or 6 to exit: ");
                    break;

                case 6:
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
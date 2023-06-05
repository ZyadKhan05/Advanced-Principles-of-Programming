import java.io.*;

// This program opens a binary file and prints the contents of an int array to the file.
public class WriteBinaryFile {
    public static void main(String[] args) throws IOException {
        // Create an array
        int[] numbers = {2, 4, 6, 8, 10, 12, 14};


        // Open Binary File for output
        FileOutputStream fstream = new FileOutputStream("Numbers.dat");
        DataOutputStream outputFile = new DataOutputStream(fstream);

        System.out.println("Writing to the file...");

        // Write the array of elements
        for (int i = 0; i < numbers.length; i++) {
            outputFile.writeInt(numbers[i]);
        }

        // Close the file
        outputFile.close();
        System.out.println("Done!");
    }
}

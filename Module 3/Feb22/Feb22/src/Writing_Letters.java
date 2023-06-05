import java.io.*;

// This program demonstrates creating random access files.
public class Writing_Letters {
    public static void main(String[] args) throws IOException {

        // Letters from the program
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        System.out.println("Opening the file...");

        RandomAccessFile randomFile = new RandomAccessFile("Letters.dat", "rw");

        System.out.println("Writing data to the file...");

        for (int i = 0; i < letters.length; i++) {
            randomFile.writeChar(letters[i]);
        }

        randomFile.close();
        System.out.println("Done!");
    }
}

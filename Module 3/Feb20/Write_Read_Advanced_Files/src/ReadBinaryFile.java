import java.io.*; // Import the java.io package

// This program opens a binary file and reads and displays the contents of the file.
public class ReadBinaryFile {
    public static void main(String[] args) throws IOException {
        int number; // holds the numbers being read
        boolean endOfFile = false; // End of file flag

        // Open Numbers.dat as a binary File
        FileInputStream fiStream = new FileInputStream("Numbers.dat");
        DataInputStream inputFile = new DataInputStream(fiStream);

        System.out.println("Reading file... ");

        while (!endOfFile){
            try {
                number = inputFile.readInt();
                System.out.print(number + " ");
            }
            catch (EOFException e){
                endOfFile = true;
            }
        }
        // Close the file
        inputFile.close();
        System.out.println("\nDone!");
    }
}

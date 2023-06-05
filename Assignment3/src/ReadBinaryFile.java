import java.io.*; // Import the java.io package

// This program opens a binary file and reads and displays the contents of the file.
public class ReadBinaryFile {
    static void Read(String fileName) throws IOException {
        String content; // holds the numbers being read
        boolean endOfFile = false; // End of file flag
        boolean exists;

        File Fo = new File(fileName+".dat");
        if (Fo.exists()) {
        }
        else {
            System.out.println("File does not exist");
            exists = false;
            return;
        }

        // Open Numbers.dat as a binary File
        FileInputStream fiStream = new FileInputStream(fileName+".dat");
        DataInputStream inputFile = new DataInputStream(fiStream);

        System.out.println("Reading file... ");

        while (!endOfFile){
            try {
                content = inputFile.readUTF();
                System.out.print(content + " ");
            }
            catch (EOFException e){
                endOfFile = true;
            }
        }
        // Close the file
        inputFile.close();
        System.out.println("\nDone! File closed...");
    }
}

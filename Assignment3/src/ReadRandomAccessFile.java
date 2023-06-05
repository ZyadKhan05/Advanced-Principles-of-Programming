import java.io.*;

// This program opens a Random Access File and displays the contents of the file
public class ReadRandomAccessFile {
    static void Read(String fileName, int position, boolean status) throws IOException {
        boolean exists;
        final int CHAR_Size = 2;
        long byteNum;
        char ch;
        boolean endOfFile = false;

        File Fo = new File(fileName+".dat");
        if (Fo.exists()) {
        }
        else {
            System.out.println("File does not exist");
            status = false;
            return;

        }

        if (status) {
            // Open the file
            RandomAccessFile randomFile = new RandomAccessFile(fileName + ".dat", "r");

            byteNum = CHAR_Size * position;
            randomFile.seek(byteNum);

            while (!endOfFile) {
                try {
                    // Read the character stored at this location
                    ch = randomFile.readChar();
                    System.out.print(ch);

                }
                catch (EOFException e) {
                    endOfFile = true;
                }
            }

            // Close the file
            randomFile.close();
            System.out.println("\nCompleted! The Random Access File has been closed.");
        }
    }
}

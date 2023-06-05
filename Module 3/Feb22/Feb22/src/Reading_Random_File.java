import java.io.*;

// This program will demonstrate reading random access files. Note: Reading letters at certain locations
public class Reading_Random_File {
    public static void main(String[] args) throws IOException {
        final int CHAR_Size = 2;
        long byteNum;
        char ch;

        // Open the file
        RandomAccessFile randomFile = new RandomAccessFile("Letters.dat", "r");

        byteNum = CHAR_Size * 1;
        randomFile.seek(byteNum);

        // Read the character stored at this location
        ch = randomFile.readChar();
        System.out.print(ch);

        byteNum = CHAR_Size * 6;
        randomFile.seek(byteNum);

        // Read the character stored at this location
        ch = randomFile.readChar();
        System.out.print(ch);

        // Close the file
        randomFile.close();

    }
}

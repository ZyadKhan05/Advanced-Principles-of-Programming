import java.io.*;

// This program will demonstrate an already existing file error.
public class File_Already_Exists_Example {
    public static void main(String[] args) {
        try {
            File Fo = new File("Example1.txt");
            if (Fo.createNewFile()) {
                System.out.println("File created: " + Fo.getName());
            }
            else {
                System.out.println("File already exists: " + Fo.getName());
            }
        }
        catch (IOException e) {
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
    }
}

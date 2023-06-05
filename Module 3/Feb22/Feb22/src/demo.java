import java.io.*;
import java.util.Scanner;

// https://www.youtube.com/watch?v=aw9yxKLenBc
public class demo {
    public static void main(String[] args) throws IOException {

        PrintWriter pw;
        try {
             pw = new PrintWriter("myFile.txt");
            pw.println("Hello World");
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }

        File f = new File("myFile2.txt");
        Scanner fs = null;

        try {
            fs = new Scanner(f);
            System.out.println(fs.nextLine());
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } finally {
            if (fs != null)
                fs.close();
        }

    }
}

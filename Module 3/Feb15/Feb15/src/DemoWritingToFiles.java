
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DemoWritingToFiles {

    public static void main(String[] args) throws IOException {
        File file1 = new File("warmup.txt");

        FileWriter fw = new FileWriter(file1);

        PrintWriter pw = new PrintWriter(fw);

        for (int i = 0; i <15; i++){
            pw.println("Line " + i + "a full line of text");
        }
        pw.println("Name: Zyad Khan");
        pw.println("Carroll Email Address: zkhan@carrollcc.edu");

        pw.close();
    }
}

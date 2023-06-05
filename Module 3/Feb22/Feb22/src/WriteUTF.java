import java.io.*;


// This program writes a binary file while a series of strings using the UTF-8 encoding
public class WriteUTF {
    public static void main(String[] args) throws IOException {

        String names[] = {"Justin", "Hank", "Rob", "Donna", "Jimmy"};

        FileOutputStream fstream = new FileOutputStream("UTFNames.dat");
        DataOutputStream outputFile = new DataOutputStream(fstream);
        System.out.println("Writing the names to the file...");

        for (int i = 0; i < names.length; i++) {
            outputFile.writeUTF(names[i]);
        }
        System.out.println("Done!");
        outputFile.close();
    }
}

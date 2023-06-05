import java.io.*; // Import the java.io package

// This program creates a Binary File and  writes user input to the file.
class WriteBinaryFile {
    static void Write(String fileName, String fileContents) throws IOException {
        // if the file already exists, do not allow the user to overwrite it.
        try {
            File Fo = new File(fileName+".dat");
            if (Fo.createNewFile()) {
                System.out.println("File created: " + Fo.getName());
            }
            else {
                System.out.println(Fo.getName() + " already exists, you cannot do that. Please try again ");
                return;
            }
        }
        catch (IOException e) {
            System.out.println("An error has occurred");
            e.printStackTrace();
        }


        // Open Binary File for output
        FileOutputStream fstream = new FileOutputStream(fileName+".dat");
        DataOutputStream outputFile = new DataOutputStream(fstream);

        System.out.println("Writing to the file...");

        // Write the array of elements
        outputFile.writeUTF(fileContents);

        // Close the file
        outputFile.close();
        System.out.println("Done!");
    }
}
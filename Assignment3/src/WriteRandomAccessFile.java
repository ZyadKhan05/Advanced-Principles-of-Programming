import java.io.*; // import java.io package

// Class that will allow program to write Random Access Files
 public class WriteRandomAccessFile {
     static void Write(String fileName, String fileContents) throws IOException {
        // If file exists already, do not allow the file to be overwritten
         try {
             File Fo = new File(fileName+".dat");
             if (Fo.createNewFile()) {
                 System.out.println("File created: " + Fo.getName());
             }
             else {
                 System.out.println(Fo.getName() + " already exists, you cannot do that. Please try again.");
                 return;
             }
         }
         // Exception if file does not exist
         catch (IOException e) {
             System.out.println("An error has occurred");
             e.printStackTrace();
         }

         System.out.println("Opening the file...");

         // Create a RandomAccessFile object using the filename inputted by the user
         RandomAccessFile randomFile = new RandomAccessFile(fileName + ".dat", "rw");

         System.out.println("Writing data to the file...");

         char[] content = fileContents.toCharArray();
         // print content to the file
         for (int i = 0; i < content.length; i++) {
             randomFile.writeChar(content[i]);
         }

         // close the file
         randomFile.close();
         System.out.println("Done!");
     }
  }


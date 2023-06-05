import java.io.*; // import the java.io package

public class DeletingFile {
        public static void Delete(String fileName) throws IOException {
            File File_Object = new File(fileName); // create a file object using the user inputted file name

            if (File_Object.delete()){
                System.out.println("Deleting file...");
                System.out.println(File_Object.getName() + " has been deleted. "); // prints out confirmation for deletion
            }
            // if the file does not exist, then print an error message
            else {
                System.out.println("Failed to delete the file " + File_Object.getName()+ ". Please try again with a valid file.");
            }
        }
}

import java.io.*;
// This program will demonstrate how to delete text files.
public class File_Delete_Example {
        public static void main(String[] args) throws IOException {
              File File_Object = new File("Example1.txt");

              if (File_Object.delete()){
                      System.out.println("The deleted file is " + File_Object.getName());
              }
              else {
                      System.out.println("Failed to delete the file " + File_Object.getName());
              }
        }
}

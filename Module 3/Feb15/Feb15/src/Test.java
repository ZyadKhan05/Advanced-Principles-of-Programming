import java.io.*;

public class Test {
    public void main(String[] args) throws IOException{}{


        File inputFile = new File("file.txt");

        while (inputFile.hasNext()){
            System.out.println(inputFile.nextLine());
        }
        inputFile.close();
    }
}

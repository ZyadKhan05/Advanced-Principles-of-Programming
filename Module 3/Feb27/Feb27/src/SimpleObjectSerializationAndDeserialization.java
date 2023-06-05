import java.io.*;

class Demo implements java.io.Serializable {
    private static final long serialVersionUID = 129348938L;

    transient int a;
    static int b;
    String name;
    int age;

    public Demo(String name, int age, int a, int b) {
        this.name = name;
        this.age = age;
        this.a = a;
        this.b = b;
    }

    public class serialExample {
        public static void printData(Demo object1){
            System.out.println("name = " + object1.name);
            System.out.println("age = " + object1.age);
            System.out.println("a = " + object1.a);
            System.out.println("b = " + object1.b);
        }
    }
    public static void main(String[] args) throws IOException {
        Demo object = new Demo("Zyad", 17, 10101, 01012023);
        String fileName = "object.txt";

        try {
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(object);

            out.close();
            file.close();

            System.out.println("Object has been serialized\n" + "Data before Serialization: " );
            Demo.serialExample.printData(object);
            object.b = 2000;
        }
        catch (IOException e) {
            System.out.println("IOException is Caught");
        }
        object = null;

        // deserialize
        try {
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(file);

            object = (Demo) in.readObject();
            in.close();
            file.close();
            System.out.println("Object has been Deserialized\n" + "Data after Deserialization: " );
            Demo.serialExample.printData(object);
        }
        catch (IOException e) {
            System.out.println("IOException is Caught");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
}
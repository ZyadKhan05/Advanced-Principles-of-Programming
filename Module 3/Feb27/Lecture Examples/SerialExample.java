import java.io.*;
/**
 * Justin Frock CIS232 Feb 27th
 * This program will demonstrate how to serialize an object and save it to a text file
 * and then deserialize that object from the text file
 */

public class SerialExample {
    // This is what prints the data of the employee
    public static void printData(Employee newObject)
    {

        System.out.println("Employee Name: " + newObject.name);
        System.out.println("Employee Age: " + newObject.age);
        System.out.println("Employee ID#: " + newObject.id);

    }

    //Main Driver method
    public static void main(String[] args)
    {
        Employee object = new Employee("Bob", 26, 1002); // Create object
        String filename = "EmployeeData.txt"; //name the text file

        System.out.println("Now Starting the Serializing process...");
        // Begin the Serialization process
        try {

            // Saving of object in a file
            FileOutputStream file = new FileOutputStream
                    (filename);
            ObjectOutputStream out = new ObjectOutputStream
                    (file);

            // Method for serialization of object
            out.writeObject(object);

            out.close();
            file.close();

            System.out.println("-------------------------------");
            System.out.println("Object has been serialized");
            System.out.println("Employee Object Below:");
            printData(object);
            System.out.println("-------------------------------");

        }

        catch (IOException ex) {
            System.out.println("IOException is caught");
        }

        object = null;

        System.out.println("Now Starting the Deserializing process...");
        // Begining the Deserialization Process
        try {

            // Reading the object from a file
            FileInputStream file = new FileInputStream
                    (filename);
            ObjectInputStream in = new ObjectInputStream
                    (file);

            // Method for deserialization of object
            object = (Employee)in.readObject();

            in.close();
            file.close();
            System.out.println("-------------------------------");
            System.out.println("Object has been deserialized");
            System.out.println("Employee Object Below:");
            printData(object);
            System.out.println("-------------------------------");

        }

        catch (IOException ex) {
            System.out.println("IOException is caught");
        }

        catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException" +
                    " is caught");
        }
    }
}

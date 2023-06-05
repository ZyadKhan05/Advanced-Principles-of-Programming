import java.io.Serializable;

/**
 * Justin Frock CIS232 Feb 27
 * This is the Employee class for the SerialExample
 */
class Employee implements Serializable {
    String name;
    int age;
    int id;

    // Default constructor
    public Employee(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
}

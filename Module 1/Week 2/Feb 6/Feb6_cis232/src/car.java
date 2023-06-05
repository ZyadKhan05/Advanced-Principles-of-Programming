public class car extends vehicle{
    public String model = "Prius";

    public static void main(String[] args){


        // Create a car object
        car myCar = new car();

        // Car honks
        myCar.honk();

        // Display the value and the vehicle class names
        System.out.println(myCar.brand + " " + myCar.model);
    }
}

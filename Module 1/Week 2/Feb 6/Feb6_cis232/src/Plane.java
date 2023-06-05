// Base Class
public class Plane {
    public int altitude;
    public int speed;

    // Constructor Made
    public Plane(int altitude, int speed){
        this.altitude = altitude;
        this.speed = speed;
    }

    // Make the plane go down
    public void goDown(int descent){
        altitude -= descent;
    }
    // Make the plane go up
    public void goUp(int rise){
        altitude += rise;
    }
    // to string method
    public String toString(){
        return ("The planes altitude is " + altitude + ". The speed of the plane is " + speed + ". ");
    }
}

public class boeing extends Plane{
    public int length;

    // Constructor for boeing class
    public boeing(int altitude, int speed, int length){
        super(altitude, speed);
        this.length = length;
    }
    public void setLength(int newValue){
        length = newValue;
    }

    // To string method
    public String toString(){
        return (super.toString() + "The plane's length is " + length);
    }
}

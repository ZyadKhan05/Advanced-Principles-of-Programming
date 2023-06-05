public class Dog extends Domestic{
    public Dog(String n, int a, String o){
        super(n, a, o, "dog");
    }

    public String speak(){
        return super.speak() + "woof!";
    }
}

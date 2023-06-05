public class Cat extends Domestic{
    public Cat (String n, int a, String o){
        super(n, a, o, "cat");
    }

    public String speak(){
        return super.speak() + "meow!";
    }
}

public class Panda extends Exotic{
    public Panda(String n, int a, String o){
        super(n, a, o, "panda");
    }
    public String speak(){
        return super.speak() + "panda noise!";
    }
}

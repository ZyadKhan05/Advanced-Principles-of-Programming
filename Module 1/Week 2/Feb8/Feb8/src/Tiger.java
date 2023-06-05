public class Tiger extends Exotic{
    public Tiger(String n, int a, String o){
        super(n, a, o, "tiger");
    }
    public String speak(){
        return super.speak() + "rawr!";
    }
}

public class Snake extends Exotic {
    public Snake(String n, int a, String o){
        super(n, a, o, "snake");
    }
    public String speak(){
        return super.speak() + "ssssss!";
    }
}

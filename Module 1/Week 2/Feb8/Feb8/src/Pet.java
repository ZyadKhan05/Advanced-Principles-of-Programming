public class Pet {
    protected String name;
    protected int age;
    protected String owner;
    protected String type;

    public Pet(String n, int a, String o, String t){
        name = n;
        age = a;
        owner = o;
        type = t;
    }

    public String getOwner(){
        return owner;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public String toString(){
        return name + " the " + type;
    }

    public int getAge() {
        return age;
    }

    public String speak(){
        return "I am a " + type + " and I say ";
    }
}

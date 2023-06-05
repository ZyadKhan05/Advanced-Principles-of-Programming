public class Domestic extends Pet{
    protected int cutnessFactor;

    public Domestic(String n, int a, String o, String t){
        super(n, a, o, t);
        if (t.equals("cat")){
            cutnessFactor = 7;
        }
        else if(t.equals("dog")){
            cutnessFactor = 8;
        }
        else {
            cutnessFactor = 6;
        }
    }

    public int getCutenessFactor(){
        return cutnessFactor;
    }

    public void setCutenessFactor(int cute){
      cutnessFactor = cute;
    }
    public String toString(){
        return "I am " + super.toString() + " and I have a cuteness factor of " + cutnessFactor;

    }
}

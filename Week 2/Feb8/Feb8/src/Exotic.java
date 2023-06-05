public class Exotic extends Pet {
    protected int dangerFactor;

    public Exotic (String n, int a, String o, String t){
        super(n,a,o,t);
        if (t.equals("snake")){
            dangerFactor = 7;
        }
        else if(t.equals("tiger")){
            dangerFactor = 8;
        }
        else if(t.equals("panda")){
            dangerFactor = 5;
        }
    }
    public int getDangerFactor(){
        return dangerFactor;
    }
    public void setDangerFactor(int d){
        dangerFactor = d;
    }

    @Override
    public String toString() {
        return "I am " + super.toString() + " and I have a DANGER factor of " + dangerFactor;
    }
}

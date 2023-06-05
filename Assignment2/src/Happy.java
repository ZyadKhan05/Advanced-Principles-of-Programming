// Implements the Face Interface
public class Happy implements Face{

    int level;

    public void eyebrow(){
        System.out.println("    --- ---");
    }
    @Override
    public void eyes() {
        System.out.println("     0   0");
    }
    @Override
    public void nose() {
        System.out.println("       > ");
    }

    @Override
    public void mouth() {
        if (level == 1){
            System.out.println(" ',          ,'  ");
            System.out.println("   '-......-'   ");
        }
        else if (level == 2){
            System.out.println("'              '  ");
            System.out.println(" ',          ,'  ");
            System.out.println("   '-......-'   ");
        }



    }
    public void color(){
        System.out.println("The face color is Green.");
    }


}

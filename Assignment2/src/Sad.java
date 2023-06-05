public class Sad implements Face{

    int level;

    public void eyebrow(){
        System.out.println("    /    / ");    }
    @Override
    public void eyes() {
        if (level == 1) {
            System.out.println("     0   0");
            System.out.println("          `");
        }
        else if(level == 2){
            System.out.println("     0   0");
            System.out.println("          `");
            System.out.println("           `");
        }
    }


    @Override
    public void nose() {
        System.out.println("       > ");
    }

    @Override
    public void mouth() {
        if (level == 1) {
            System.out.println("    .------. ");
            System.out.println("   '        ' ");
        }
        else if(level == 2){
            System.out.println("    .------. ");
            System.out.println("   '        ' ");
            System.out.println("  '          ' ");
        }
    }
    public void color(){
        System.out.println("The face color is Blue.");
    }

}

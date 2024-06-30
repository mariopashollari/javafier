package ushtrim;

public class Kuti {
    int gjatesi;
    int gjeresi;
    int lartesi;

    public Kuti(){}
    public Kuti(int gjatesi, int gjeresi, int lartesi){
        this.gjatesi= gjatesi;
        this. gjeresi= gjeresi;
        this. lartesi= lartesi;
    }
    public int vellimi(){
        return gjatesi*gjeresi*lartesi;
    }


}

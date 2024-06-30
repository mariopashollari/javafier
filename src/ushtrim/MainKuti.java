package ushtrim;

public class MainKuti {
    public static void main(String[] args) {
        Kuti kuti1= new Kuti(4,7,9);
        Kuti kuti2= new Kuti(3,5,7);

        //System.out.println("vellimi i kutise se pare:"+kuti1.gjatesi*kuti1.gjeresi*kuti1.lartesi);
        //System.out.println("vellimi i kutise se dyte:"+kuti2.gjatesi*kuti2.gjeresi* kuti2.lartesi);
        System.out.println("vellimi i kutise se pare:"+kuti1.vellimi());
        System.out.println("vellimi i kutise se dyte:"+kuti2.vellimi());

    }
}

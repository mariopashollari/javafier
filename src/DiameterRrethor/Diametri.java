package DiameterRrethor;

import java.util.Random;
import java.util.Scanner;

public class Diametri {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Jep diametrin");
        float diameter=scanner.nextFloat();
        float rrezja=diameter/2;
        double perimetri=2*Math.PI*rrezja;
        System.out.println("Perimetri eshte:"+perimetri);

    }
}

package Task8;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double vlera=llogaritje();
        System.out.println(vlera);

    }

    public static double llogaritje() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos numrin e pare: ");
        float n1 = scanner.nextFloat();
        System.out.println("Vendos operatorin");
        char operatori = scanner.next().charAt(0);
        System.out.println("Vendos numrin e dyte: ");
        float n2 = scanner.nextFloat();
        switch (operatori) {
            case '+':
                return n1 + n2;

            case '-':
                return n1 - n2;

            case '*':
                return n1 * n2;

            case '/':
                if (n2 == 0) {
                    System.out.println("Pjestimi me 0 nuk ka kuptim!");
                }
                else {
                return n1 / n2;}

            default:
                System.out.println("Invalid result: ");
        }

        return Integer.MIN_VALUE;
    }
}

package ushtrimi5;

import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jep nje numer:");
        int numri= scanner.nextInt();
        for (int i=2;i<numri;i++){
            if (isPrime(i)){
                System.out.println(i);

            }
        }





    }
    public static boolean isPrime(int numri){
        for (int i = 2; i<numri;i++){
            if (numri %i==0){
                return false;

            }

        }
        return true;

    }
}

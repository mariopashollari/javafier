package Ushtrim7;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Vendosni nje numer: ");
        int index= scanner.nextInt();
        if (index>=0){
                System.out.println(Fibonacci.fibo(index)+ " ");

            }
            else {
                System.out.println("Numri nuk eshte i sakte");
        }


    }
}

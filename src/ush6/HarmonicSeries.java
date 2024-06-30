package ush6;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jep nje numer:");
        int n = scanner.nextInt();
        double sum=0;
        for (int i=1;i<=n;i++){
            System.out.println("shuma : "+sum+" interacioni: "+i);
            sum=sum+(double) 1/i;}
        System.out.println(sum);
        }
    }

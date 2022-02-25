package com.company;

import java.util.Scanner;

public class Feladat4 {
    public static void main(String[] args) {
        Scanner szkenner = new Scanner(System.in);
        System.out.print("Kérem az első számot: ");
        int szam1 = szkenner.nextInt();
        System.out.print("Kérem a második számot: ");
        int szam2 = szkenner.nextInt();
        System.out.println("A szám összege "+(szam1 + szam2));
        System.out.println("A szám különbsége "+(szam1 - szam2));
        System.out.println("A szám szorzata "+(szam1 * szam2));
        System.out.println("A szám hányadosa "+(float)szam1 / (float)szam2);

    }
}

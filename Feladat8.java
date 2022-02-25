package com.company;

import java.util.Scanner;

public class Feladat8 {
    public static void main(String[] args) {
        Scanner szkenner = new Scanner(System.in);
        System.out.print("Kérem az első pozitív egész számot: ");
        int szam1 = szkenner.nextInt();
        System.out.print("Kérem a második pozitiv egész számot: ");
        int szam2 = szkenner.nextInt();
        int szamtani = ((szam1+szam2)/2);
        double mertani = Math.sqrt(szam1*szam2);
        System.out.println("A két szám számtani közepe: "+szamtani);
        System.out.printf("A két szám mértani közepe: %.2f", mertani);
    }
}

package com.company;

import java.util.Scanner;

public class Feladat9 {
    public static void main(String[] args) {
        Scanner szkenner = new Scanner(System.in);
        System.out.print("Kérem az első együtthatót: ");
        int szam1 = szkenner.nextInt();
        System.out.print("Kérem a második együtthatót: ");
        int szam2 = szkenner.nextInt();
        System.out.println("Kérem a harmadik együtthatót: ");
        int szam3 = szkenner.nextInt();
        double egyikgyök = - szam2 - Math.pow(szam2,2 - 4 * szam1 * szam3) / (2 * szam1);
        double masikgyok=(-szam2+Math.sqrt(Math.pow(szam2,2)-4*szam1*szam3))/2*szam1;
        double megoldas=egyikgyök+masikgyok;
        System.out.println(String.valueOf(megoldas));
    }
}

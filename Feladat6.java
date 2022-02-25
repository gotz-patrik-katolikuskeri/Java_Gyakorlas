package com.company;

import java.util.Scanner;

public class Feladat6 {
    public static void main(String[] args) {
        Scanner szkenner = new Scanner(System.in);
        System.out.print("Kérem az első egész számot: ");
        int szam1 = szkenner.nextInt();
        System.out.print("Kérem a második számot: ");
        int szam2 = szkenner.nextInt();
        System.out.print("Kérem a harmadik számot: ");
        int szam3 = szkenner.nextInt();
        if (szam1 < szam2){
            System.out.println(szam1);
        }
        else if (szam2 < szam3){
            System.out.println(szam2);
        }
        else {
            System.out.println(szam3);
        }

    }
}

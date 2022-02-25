package com.company;

import java.util.Scanner;

public class Feladat3 {
    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);
        System.out.print("Kérek egy számot: ");
        int szam = konzol.nextInt();
        System.out.println(szam * 2);
    }
}

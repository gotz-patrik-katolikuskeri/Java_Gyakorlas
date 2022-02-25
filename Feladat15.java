package com.company;

import java.util.Scanner;

public class Feladat15 {
    public static void main(String[] args) {
        Scanner szkenner = new Scanner(System.in);
        System.out.print("Kérek egy számot: ");
        int szam = szkenner.nextInt();
        if ( szam % 3 == 0 && szam % 9 == 0){
            System.out.println("Szám osztható hárommal és kilenccel!");
        }
        else if (szam % 4 == 0){
            System.out.println("A szám osztható néggyel!");
        }
        else{
            System.out.println("A szám egyikkel sem osztható!");
        }
    }
}

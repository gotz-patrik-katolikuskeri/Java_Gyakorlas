package com.company;

import java.util.Scanner;

public class Feladat24 {
    public static void main(String[] args) {
        Scanner szkenner = new Scanner(System.in);
        System.out.print("Kérem a pozitív egész számot: ");
        int szam = szkenner.nextInt();
        int szamlalo = 0;
        while (szamlalo != szam){
            System.out.printf("%d",szamlalo++);
        }
    }
}

package com.company;

import java.util.Scanner;

public class Feladat2 {
    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);
        System.out.print("Kérem a nevét: ");
        String nev = konzol.next();
        System.out.println("Hello " +nev);
    }
}

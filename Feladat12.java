package com.company;

import java.util.Scanner;

public class Feladat12 {
    public static void main(String[] args) {
        Scanner szkenner = new Scanner(System.in);
        System.out.print("Kérem az első élt: ");
        int a = szkenner.nextInt();
        System.out.print("Kérem a második élt: ");
        int b = szkenner.nextInt();
        System.out.print("Kérem a harmaik élt: ");
        int c = szkenner.nextInt();
        int terfogat = a*b*c;
        int felszin = 2 * (a * b + a * c + b * c);
        System.out.printf("Felszin: ", felszin);
        System.out.printf("Terfogat: ", terfogat);

    }
}

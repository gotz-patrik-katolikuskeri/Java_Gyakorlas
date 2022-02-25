package com.company;

import java.util.Scanner;

public class Feladat13 {
    public static void main(String[] args) {
        Scanner szkenner = new Scanner(System.in);
        System.out.print("Kérem a kör átmérőjét: ");
        int atmero = szkenner.nextInt();
        double terulet = Math.pow(atmero,2) * Math.PI;
        double kerulet = 2*atmero*Math.PI;
        System.out.printf("A Kör területe: %.2f ",terulet);
        System.out.println();
        System.out.printf("A kör kerülete: %.2f ", kerulet);
    }
}

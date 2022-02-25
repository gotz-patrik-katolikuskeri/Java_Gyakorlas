package com.company;

import java.util.Scanner;

public class Feladat11 {
    public static void main(String[] args) {
        Scanner szkenner = new Scanner(System.in);
        System.out.print("Kérem az első befogót: ");
        int befog1 = szkenner.nextInt();
        System.out.print("Kérem a második befogót");
        int befog2 = szkenner.nextInt();
        double atfogo = Math.sqrt(Math.pow(befog1,2)+ Math.pow(befog2,2));
        System.out.printf("Az átfogó: %.2f",atfogo);
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner szkenner = new Scanner(System.in);
        System.out.print("Kérem a pozitív egész számot: ");
        int szam = szkenner.nextInt();
        int szamlalo = 0;
        while (szamlalo != szam){
            System.out.printf("%d\t",szamlalo++);
        }
    }
}

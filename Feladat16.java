package com.company;

import java.util.Scanner;

public class Feladat16 {
    public static void main(String[] args) {
        Scanner szkenner = new Scanner(System.in);
        System.out.print("Kérem az hőmérsékletet");
        int homerseklet = szkenner.nextInt();
        System.out.print("Adja meg hogy Celsiusból Fahrenheitba vagy Fahrenheitból Celsiusba akar váltani: ");
        String eldontes = szkenner.nextLine();
        double CeltoFahr = homerseklet*1.8000+32.00;
        double FahrtoCel = homerseklet-32/1.8000;
        String CF = "CeltoFahr";
        String FC = "FahrtoCel";
        if (){

        }


    }
}

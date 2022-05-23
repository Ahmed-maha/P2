package de.hrw.progra2.assignment1;

import java.util.Scanner;

public class FirstSteps {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int z;
        double a, v;
        double pi = 3.142;

        System.out.println("Willkommen beim Pizzaprogramm. Geben Sie den Radius der Pizza an: ");
        z = scanner.nextInt();

        System.out.println("Geben Sie die Hoehe der Pizza an: ");
        a = scanner.nextDouble();

        v = pi * z * z * a;

        System.out.println("Die Pizza hat ein gerundetes Volumen von V = " + v + " Kubikzentimetern.");

        if (v < 800){
            System.out.println("Es handelt sich um eine kleine Pizza.");
        } else if (v >= 800 && v < 1100){
            System.out.println("Es handelt sich um eine mittlere Pizza.");
        } else if (v >= 1100){
            System.out.println("Es handelt sich um eine große Pizza.");
        }


    }

}

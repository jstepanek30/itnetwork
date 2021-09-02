package Kalkulacka;

import java.util.Scanner;

public class OOPKalkulacka {
    public static void main(String[] args) {
        Kalkulacka calc = new Kalkulacka();
        Scanner s = new Scanner(System.in);
        System.out.println("Zadej 1. číslo:");
        calc.cislo1 = Double.parseDouble(s.nextLine());
        System.out.println(calc.cislo1);
        System.out.println("Zadej 2. číslo:");
        calc.cislo2 = Double.parseDouble(s.nextLine());
        System.out.println(calc.cislo2);
        System.out.println("Součet je: " + calc.scitani(calc.cislo1,calc.cislo2));
        System.out.println("Rozdíl je: " + calc.odcitani(calc.cislo1,calc.cislo2));
        System.out.println("Součin je: " + calc.nasobeni(calc.cislo1,calc.cislo2));
        System.out.println("Podíl je: " + calc.deleni(calc.cislo1,calc.cislo2));
    }
}

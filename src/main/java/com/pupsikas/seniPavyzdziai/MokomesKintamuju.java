package com.pupsikas.seniPavyzdziai;

public class MokomesKintamuju {

    public static void main(String[] args) {
        System.out.println("sveikas pasauli");

        int sveikasSkaicius = 0;
        System.out.println(sveikasSkaicius);

        char simbolis = 'a';
        System.out.println(simbolis);

        char simbolis2 = '?';
        System.out.println(simbolis2);

        String simboliuKratinys = "As noriu valgyti:)";
        System.out.println(simboliuKratinys);

        double nesveikasSkaicius = 1.5;
        System.out.println(nesveikasSkaicius);

        Sudekduskaicius(5,10.89);

        SudauginkSkaicius(2,6.12);

        System.out.println("--------------------------------------");

        atimtis(2, 1.5);

        spauzdintsimboli("?*-++++++651cfgh");
    }

    public static double Sudekduskaicius (int skaicius, double nesveikaskaicius){
        double suma = skaicius + nesveikaskaicius;
        System.out.println(suma);
        return suma;
    }

    public static double SudauginkSkaicius (int sveikasskaicius, double nesveikasskaicius){
        double suma = Sudekduskaicius(sveikasskaicius, nesveikasskaicius);
        double sandauga = suma * 2;
        System.out.println(sandauga);
        return sandauga;
    }

    public static void atimtis (int sveikasskaicius, double nesveikasskaicius) {
       // double suma = Sudekduskaicius(sveikasskaicius, nesveikasskaicius);
        System.out.println("--------------------------------------");
        double sandauga = SudauginkSkaicius(sveikasskaicius, nesveikasskaicius);
        System.out.println("--------------------------------------");
        double rezultatas = sandauga - 5;
        System.out.println(rezultatas);
    }

    public static void spauzdintsimboli (String simbolis){
        int suma = 100;
        int skaicius = 2;
        for (int i = 0; i < 10; i++) {
//            System.out.println(simbolis);
//            System.out.println(i);
//           // System.out.println(suma+i);
//            suma = suma +i;
//            System.out.println(suma);
//            skaicius = skaicius * 2;
//            System.out.println(skaicius);
//            System.out.println(":*");
            suma = suma - 2;
            System.out.println(suma);


        }
        System.out.println(skaicius);
    }
}

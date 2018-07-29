package com.pupsikas.seniPavyzdziai;

import com.sun.corba.se.spi.ior.ObjectKey;

public class Sudukas {
    public static void main(String[] args) {
        System.out.println("Sveikas pasauli");

//        int SveikasSkaicius = 0;
//        double NesveikasSkaicius = 1.5;
//        String SimboliuKratinys = "a?1";
//        char Simbolis = 'a';
//        System.out.println(SveikasSkaicius);
//        System.out.println(NesveikasSkaicius);
//        System.out.println(SimboliuKratinys);
//        System.out.println(Simbolis);
//
//        --------------------------------------------------------------------------------------------------
//
//        String DuTukstanciaiAstuonioliktimetai = "Su ";
//        String SeptintasMenuo = "gimimo";
//        String AntraDiena = " diena ;*";
//        String YpatingaData = DuTukstanciaiAstuonioliktimetai + SeptintasMenuo + AntraDiena;
//        System.out.println(YpatingaData);
//        System.out.println("P. S. Labai cia ilgai galvojau tokia nesamone, tai nesijuok :D");

//                ------------------------------------------------------------------------------------------------------------

//       String i= "Bandymas";
//       int a = 25;
//       System.out.println("kintamasis i="+i+" kintamasis a="+a);

//        int masyvas = [21, 52, 31, 45, 3];
//        for (int i = 0; i < masyvas.lenght; i++){
//            if (masyvas == 3){
//                System.out.println("Trys");
//            } else {
//                System.out.println("Ne trys");
//            }
//        }

//                        ----------------------------------------------------------------------------------------------------

//        int masyvas = [21, 52, 31, 45, 3];
//        int Kiekistrejetu = 0;
//        for (int i = 0; i < masyvas.lenght; i++){
//            if (masyvas[i]==3){
//              Kiekistrejetu += 1;
//            }
//        }
//        System.out.println(Kiekistrejetu);

//                                -----------------------------------------------------------------------------------------------------

//        int Skaicius = 0;
//        int[] Masyvas = {5, 110, 56, 12, 3};
//        for (int i = 0; i < Masyvas.length; i++) {
//            if (Skaicius == 1) {
//                System.out.print(Masyvas[i] + " ");
//            }
//        }
//        for (int i = Masyvas.length - 1; i >= 0; i--) {
//            if (Skaicius == 0) {
//                System.out.print(Masyvas[i] + " ");
//            }
//        }

//        --------------------------------------------------------------------------------------------------------

//        SpauzdinkMasyva( 1);
//        SpauzdinkMasyva( 0);

//        --------------------------------------------------------------------------------------------------------

          IsrinkKiekSkaiciuMazesniUzDesimt(20);

    }

    public static void IsrinkKiekSkaiciuMazesniUzDesimt(int IrasykSkaiciuDesimt) {
        int[] Masyvas = {10, 64, 11, 90, 22, 568, 4, 16, 8, 0, 178};
        int KiekisMazesniuSkaiciuUzDesimt = 0;
        for (int i = 0; i < Masyvas.length; i++) {
            if (Masyvas[i] < IrasykSkaiciuDesimt) {
                KiekisMazesniuSkaiciuUzDesimt += 1;
            }
        }
            System.out.println(KiekisMazesniuSkaiciuUzDesimt);

    }

//    -------------------------------------------------------------------------------------------------------------

//    public static void SpauzdinkMasyva(int skaicius) {
//        int[] Masyvas = {5, 110, 56, 12, 3};
//        for (int i = 0; i < Masyvas.length; i++) {
//            if (skaicius == 1) {
//                System.out.print(Masyvas[i] + " ");
//            }
//        }
//        System.out.println();
//        for (int i = Masyvas.length - 1; i >= 0; i--) {
//            if (skaicius == 0) {
//                System.out.print(Masyvas[i] + " ");
//            }
//        }
//    }


}









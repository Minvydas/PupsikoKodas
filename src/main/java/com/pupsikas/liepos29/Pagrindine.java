package com.pupsikas.liepos29;

public class Pagrindine {
    public static void main(String[] args) {
        IsspauzdinkBendraRezultata();
        apskaiciuokImonesBalansa();
    }

    private static void apskaiciuokImonesBalansa() {

    }

    public static void IsspauzdinkBendraRezultata() {
        int[] UzZmoniuDarba = {1300, 1500, 1800, 1543, 1983, 1723, 1234, 1753, 1120, 600, 987, 7653, 150000};
        int[] UzNiekucius = {12, 93, 812, 3451, 987, 37, 1, 123, 445, 1234, 111, 456, 123, 623, 12356, 1234, 543, 9123, 99, 12, 15, 23, 100};
        int[] PajamosUzDovanas = {91234, 123, 5412, 123, 5123, 1235, 11154, 12356, 12356, 54123};

        int DarboSuma = 0;
        for (int elementas : UzZmoniuDarba) {
            DarboSuma += elementas;
        }
        int UzNiekuciusSuma = 0;
        for (int i = 0; i < UzNiekucius.length; i++) {
            UzNiekuciusSuma += UzNiekucius[i];
        }
        int BendrosIslaidos = 0;
        BendrosIslaidos = DarboSuma + UzNiekuciusSuma;

        int PajamuSuma = 0;
        for (int i = 0; i < PajamosUzDovanas.length; i++) {
            PajamuSuma += PajamosUzDovanas[i];
        }
        int IsejauIPliusaArIMinusa = 0;
        IsejauIPliusaArIMinusa = PajamuSuma - BendrosIslaidos;

        if (IsejauIPliusaArIMinusa > 0) {
            System.out.println("Bendra pajamu suma:" + " " + IsejauIPliusaArIMinusa);
        } else {
            if (IsejauIPliusaArIMinusa < 0)
                System.out.println("Jums si puota kainavo:" + " " + IsejauIPliusaArIMinusa);
        }
    }


}



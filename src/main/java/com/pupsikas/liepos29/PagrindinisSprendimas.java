package com.pupsikas.liepos29;

public class PagrindinisSprendimas {

    public static void main(String[] args) {
        apskaiciuokVestuviuBalansa();
        apskaiciuokImonesBalansa();
    }

    private static void apskaiciuokImonesBalansa() {

    }

    private static void apskaiciuokVestuviuBalansa() {
        int[] uzZmoniuDarba = {1300, 1500, 1800, 1543, 1983, 1723, 1234, 1753, 1120, 600, 987, 7653};
        int[] uzNiekucius = {12, 93, 812, 3451, 987, 37, 1, 123, 445, 1234, 111, 456, 123, 623, 12356, 1234, 543, 9123, 99, 12, 15, 23, 100};
        int[] pajamosUzDovanas = {91234, 123, 5412, 123, 5123, 1235, 11154, 12356, 12356, 54123};

        int sumaUzZmoniuDarba = susumuokMasyva(uzZmoniuDarba);
        int sumaUzNiekucius = susumuokMasyva(uzNiekucius);
        int sumaPajamosUzDovanas = susumuokMasyva(pajamosUzDovanas);

        int rezultatas = sumaPajamosUzDovanas - sumaUzNiekucius - sumaUzZmoniuDarba;

        spausdinkRezultata(rezultatas);
    }

    public static int susumuokMasyva(int[] masyvas){
        int suma = 0;
        for (int elementas : masyvas) {
            suma += elementas;
        }
        return suma;
    }

    public static void spausdinkRezultata(int suma){
        if (suma > 0){
            System.out.println("Bendra pajamu suma:" + suma);
        } else {
            System.out.println("Bendra islaidu suma:" + suma);
        }

    }
}

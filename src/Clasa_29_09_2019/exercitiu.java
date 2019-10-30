package Clasa_29_09_2019;

public class exercitiu {
    public static void main(String[] args) {
        int[] arrayOfInts = {10, 15, 20, 25, 31, 3000, 333, 98, 99};
        int nrNumerePare = 0; // contor de numere pare
        int nrNumereImpare = 0;
        for (int i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] % 2 == 0) { //Am gasit un nr par
                System.out.print(arrayOfInts[i] + " ");
                nrNumerePare++; //  Incrementez valoarea contorului
            } else {
                nrNumereImpare++;
            }
        }
        System.out.println("\nIn sir am " + nrNumerePare + " numere pare si " + nrNumereImpare + " numere impare!");
        System.out.println("\nIn sir am " + nrNumerePare + " numere pare si " + (arrayOfInts.length - nrNumerePare) + " numere impare!");
        //clase test = new clase();// teste de chemare din alta clasa
        //test.var1=1;// test de chemare din alta clasa
    }
}

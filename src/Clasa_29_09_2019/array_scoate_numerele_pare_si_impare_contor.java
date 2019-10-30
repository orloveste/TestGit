package Clasa_29_09_2019;

public class array_scoate_numerele_pare_si_impare_contor {
    public static void main(String[] args) {
        int numerePare = 0; // contorul
        int numereImpare = 0;

        int[] arrayOfInts = {10, 15, 20, 25, 30, 45, 34, 23};

        for (int i = 0; i < arrayOfInts.length; i++) {

            if (arrayOfInts[i] % 2 == 0) {
                System.out.print(arrayOfInts[i] + ", ");
                numerePare++; // le numara

            } else if ((arrayOfInts[i] % 2) != 0) {
                System.out.println("\nNumerele impare sunt: ");
                System.out.println(arrayOfInts[i] + " ");
                numereImpare++; // le numara
            }

        } System.out.println("\n numere pare: " + numerePare + " sunt");
        System.out.println("\n numere IMpare: " + numereImpare + " sunt");
        System.out.println("\n numere IMpare: " + (arrayOfInts.length - numerePare) + " sunt");

    }
}

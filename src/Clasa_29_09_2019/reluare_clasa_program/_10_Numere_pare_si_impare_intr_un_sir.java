package Clasa_29_09_2019.reluare_clasa_program;

public class _10_Numere_pare_si_impare_intr_un_sir {
    public static void main(String[] args) {
        int[] arrayOfInts = {1, 15, 20, 25, 31, 3000, 22, 33 ,98 ,99 };
        int numerePare = 0; // contor numere pare
        int numereImpare = 0;
        for (int i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] % 2 ==0) {//am gasit numarul par
                System.out.print(arrayOfInts[i] + " ");
                numerePare++;
            } else {
                numereImpare++;
            }
        } System.out.println("\n In sir am " + numerePare + " numere pare si " +
                numereImpare + " numere impare! ");
        System.out.println("\n In sir am " + numerePare + " numere pare si " +
                (arrayOfInts.length - numerePare) + " numere impare! ");


    }
}

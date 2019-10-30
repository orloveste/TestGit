package Clasa_28_09_2019;

import java.util.Scanner;

public class Tema_10_for_while_faCuPlusPlusPatratele {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        int nr = in.nextInt();
        for (int j = 0 ; j < nr; j++) {// pentru for
            for (int i = 0; i < nr; i++) {
                System.out.print("$  ");
            }
            System.out.println();
        }
        System.out.println("baga in while: ");
        int nrLinii = 0;
        int nrColoane = 0;
        while (nrLinii < nr) {// nr de linii trebuie sa le numere
            while (nrColoane < nr) {// pentru while
                System.out.print("$  ");
                nrColoane++;
            }
            System.out.println();
            nrColoane = 0;
            nrLinii++;
        }
    }
}

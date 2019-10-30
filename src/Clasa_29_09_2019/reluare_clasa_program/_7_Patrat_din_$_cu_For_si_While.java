package Clasa_29_09_2019.reluare_clasa_program;

import java.util.Scanner;

public class _7_Patrat_din_$_cu_For_si_While {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti numar: ");
        int nr = in.nextInt();
        System.out.println("Convertire in patrat din $: ");//metoda for
        for (int j = 0; j < nr; j++) {
            for (int i = 0; i < nr; i++) {
                System.out.print("$  ");
            } System.out.println();
        } System.out.println("Acelasi patrat dar cu While(--)");//metoda while --
        int nrLinii = nr;
        int nrColoane = nr;
        while (nrLinii > 0) {
            nrColoane = nr;
            while (nrColoane > 0) {
                System.out.print("$  ");
                nrColoane--;
            } System.out.println();
            nrLinii--;
        } System.out.println("Acelasi patrat dar cu While(++)");//metoda while ++
        int nrLinii0 = 0;
        int nrColoane0 = 0;
        while (nrLinii0 < nr) {
            nrColoane0 = 0;
            while (nrColoane0 < nr) {
                System.out.print("$  ");
                nrColoane0++;
            } System.out.println();
            nrLinii0++;
        }

    }
}

package Clasa_29_09_2019.reluare_clasa_program;

import java.util.Scanner;

public class _2_sir_cu_inlocuire_afisaj {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numarulDeCaracterePrintabile = 0;
        System.out.print("Introduceti numarul: ");
        numarulDeCaracterePrintabile = in.nextInt();
        while (numarulDeCaracterePrintabile > 0) {
            System.out.print("$");
            numarulDeCaracterePrintabile = numarulDeCaracterePrintabile -1;
        }
    }
}

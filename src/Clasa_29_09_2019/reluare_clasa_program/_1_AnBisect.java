package Clasa_29_09_2019.reluare_clasa_program;

import java.util.Scanner;

public class _1_AnBisect {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int anulVerificat = 0;
        System.out.println("Introduceti anul pentru verificare: ");
        anulVerificat = in.nextInt();
        if (((anulVerificat % 4) == 0) && ((anulVerificat % 100) != 0) ||
                ((anulVerificat % 400) == 0)) {
            System.out.println("Anul este bisect!");
        }
        else {
            System.out.print("Anul nu este unul bisect!");
        }
    }
}

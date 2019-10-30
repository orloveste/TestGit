package Clasa_29_09_2019.reluare_clasa_program;

import java.util.Scanner;

public class _9_Tema_variante_ {
    public static void main(String[] args) {
        int a, b, c;
        Scanner in = new Scanner(System.in);
        System.out.print("Introduceti a: ");
        a = in.nextInt();
        System.out.print("Introduceti b: ");
        b = in.nextInt();
        System.out.print("Introduceti c: ");
        c = in.nextInt();
        if (a < b) {
            if (b < c) {
                System.out.println("Ordinea este: " + a + ", " + b + ", " + c);
            } else {
                if (a < c) {
                    System.out.printf("Ordinea este: %s, %d, % d\n" ,a,b,c);
                } else {
                    System.out.printf("Ordinea este: %d, %d, %d\n", c, a, b);
                }
            }
        } else {
            if (c > a) {
                System.out.printf("Ordinea este: %d, %d, %d\n", b, a, c);
            } else {
                if (b < c) {
                    System.out.printf("Ordinea este: %d, %d, %d\n", b, c, a);
                } else {
                    System.out.printf("Ordinea este: %d, %d, %d\n", c, b, a);
                }
            }
        }
    }
}

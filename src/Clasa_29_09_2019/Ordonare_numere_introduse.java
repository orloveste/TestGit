package Clasa_29_09_2019;
// de verificat de pe slack - e bulit

import java.util.Scanner;

public class Ordonare_numere_introduse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        System.out.println("Introduceri a: ");
        a = in.nextInt();
        System.out.println("Introduceri b: ");
        b = in.nextInt();
        System.out.println("Introduceri c: ");
        c = in.nextInt();
        if (a < b) {
            if (a < c) {
                System.out.println("ordinea este: " + a + " " + b + " " + c);
            } else if (a < c) {
                System.out.printf("ordinea e: %d,%d. %d\n", a, c, b);
            } else {
                System.out.printf("ordinea e: %d,%d,%d\n", c, a, b);
            }
        } else {
            if (c > a) {
                System.out.printf("ordinea e: %d, %d, %d\n", b, a, c);
            } else {
                if (b < c) {
                    System.out.printf("ordinea e: %d, %d, %d\n", b, c, a);
                } else {
                    System.out.printf("ordinea e: %d, %d, %d\n", c, b, a);
                }

            }

        }

    }
}

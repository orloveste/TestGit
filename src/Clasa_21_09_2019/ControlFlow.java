package Clasa_21_09_2019;

import java.util.Scanner;

public class ControlFlow {

    public static void main(String[] args) {
        int age = 66;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti varsta: ");
        age = in.nextInt();
        if (age < 18) {
            System.out.println("You are teenager!");
        } else if (age >100) {
            System.out.println("You are very old!");
        } else {
            System.out.println("You are adult!");
        }
    }
}

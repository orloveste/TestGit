package Clasa_21_09_2019;

import java.util.Scanner;

public class ControlFlow1 {
    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        a = in.nextInt();
        System.out.println("rezultatul este: ");
        //test
if (a == 110)
{
    System.out.println("a este egal cu 110");
    System.out.println("110*5= " + (a * 5));
}
        ///original

        if ((a < 1) || (a > 100)) {
            System.out.println("Numari in afara intervalului [1 , 100] ");
        }
        else if (a == 1) {
            System.out.println("*");
        }
        else if (a == 2) {
            System.out.println("**");
        }
        else if (a == 3) {
            System.out.println("***");
        }
        else if (a == 55){
            System.out.println("cincizeci si cinci de ***");
        }
            else {
                System.out.println("EROARE - MERGE DOAR DE LA 1 LA 3");
            }


        }
    }


package Clasa_28_09_2019;
import java.util.Scanner;
public class Numar_ {
    public static void main(String[] argds) {
        Scanner in = new Scanner(System.in);
        int nr = 0;
        System.out.print("Introduceti nr:");
        nr = in.nextInt();
        while (--nr > 0) {
            System.out.print("$");
            //nr--; // nr =  nr - 1;
        }
    }
}

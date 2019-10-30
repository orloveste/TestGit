package Clasa_28_09_2019;
import java.util.Scanner;
public class Tema_10_patrat_din_cifra_bagata {
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
        int nrLinii = nr;
        int nrColoane = nr;
        while (nrLinii > 0) {
            nrColoane = nr;
            while (nrColoane > 0) {// pentru while
            System.out.print("$  ");
            nrColoane--;
        }
            System.out.println();
            nrLinii--;
        }
    }
}

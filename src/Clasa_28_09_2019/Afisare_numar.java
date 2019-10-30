package Clasa_28_09_2019;
import java.util.Scanner;

public class Afisare_numar {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int nr = 0;
    System.out.print("introdu nr: ");
    nr = in.nextInt();
    //int nrTemp = nr+1; varianta 1
        int k = 1;
    /*while (k <= nr) {
        System.out.print(k);

        //System.out.println((nrTemp - nr) + ", "); varianta 1
        if (k == nr) { //nejuns - repeta if-ul
            System.out.print(".");
        } else {
        System.out.print(", ");
        }
        k++;*/
        //nr--; anulat dupa varianta 1

   // }
     while (k < nr) {
         System.out.print(k + ", ");
         k++;

     }
        System.out.print((nr) + ".");

    }
}

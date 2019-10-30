package Clasa_12_10_2019.Teme_saptamana_2;
//de jucat cu ea
import java.util.Scanner;

public class _12_verificare_sir_in_oglinda_fata_de_jumatatea_lui {
    public static boolean sirInOglinda(int[] a){
        boolean rezultat = true;//presupunem rezultatul in oglinda
       for (int i = 0; i < a.length/2; i++) {//verifici doar jumatatea
           if (a[i] !=a[a.length-1-i]) {// SA TIPARESTI PERECHILE = TO DO!!!! ===
               rezultat = false;
               return rezultat;
           }
       }
       return rezultat;
    }
    public static void main(String[] args) {
        int [] sir1 = {12,3,13,65,5,9,22};
        int [] sir2 = {11,3,12,12,3,11};
        Scanner in = new Scanner(System.in);
        int a,b;
        boolean rez;
        rez = sirInOglinda(sir1);
        System.out.println("sirul1 este in oglinda? " + sirInOglinda(sir1));
        System.out.println("sirul2 este in oglinda? " + sirInOglinda(sir2));
        System.out.print("a=");
        a = in.nextInt();
        System.out.print("b=");
        b = in.nextInt();
        if (b <= a){
            System.out.println("b trebuie sa fie mai mare decat a!");
            return;//blocheaza executie de mai jos
        }
        int flag = 0;
        int maxim = sir1[0];
// afisare din sir fara sortarea vectorilor
        for (int i = 0; i < sir1.length; i++) {
            if (sir1[i] > maxim) {
                maxim = sir1[i];
            }
            if ((sir1[i] >= a) && (sir1[i] <= b)) {//daca inchizi acoladele nu mai apar virgulele la fiecare numar din sir
                if (flag == 0) {// daca flag = cu maxim executa pauza si nu executa virgula
                    flag = 1;
                    System.out.print(sir1[i] + " ");
                } else {
                    System.out.print(", ");
                    System.out.print(sir1[i] + " ");
                }
            }
        }
        System.out.println("cel mai mare element din sir este: "+ maxim);//din sir predefinit
    }
}

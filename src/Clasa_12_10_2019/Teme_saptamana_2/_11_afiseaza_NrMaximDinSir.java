package Clasa_12_10_2019.Teme_saptamana_2;

import java.util.Scanner;

public class _11_afiseaza_NrMaximDinSir {
    public static void main(String[] args) {
        int [] sir = {12,3,13,65,5,9,22};
        Scanner in = new Scanner(System.in);
        System.out.print("a=");
        int a,b;
        a = in.nextInt();
        System.out.print("b=");
        b = in.nextInt();
        if (b <= a){
            System.out.println("b trebuie sa fie mai mare decat a!");
            return;//blocheaza executie de mai jos
        }
        int flag = 0;
        int maxim = sir[0];
// afisare din sir fara sortarea vectorilor
        for (int i = 0; i < sir.length; i++) {
            if (sir[i] > maxim) {
                maxim = sir[i];
            }
            if ((sir[i] >= a) && (sir[i] <= b)) {//daca inchizi acoladele nu mai apar virgulele la fiecare numar din sir
                if (flag == 0) {// daca flag = cu maxim executa pauza si nu executa virgula
                    flag = 1;
                    System.out.print(sir[i] + " ");
                } else {
                    System.out.print(", ");
                    System.out.print(sir[i] + " ");
                }
            }
        }
        System.out.println("cel mai mare element din sir este: "+ maxim);//din sir predefinit
    }
}

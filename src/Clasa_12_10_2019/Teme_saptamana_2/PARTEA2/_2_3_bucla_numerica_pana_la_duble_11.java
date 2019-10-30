package Clasa_12_10_2019.Teme_saptamana_2.PARTEA2;

import java.util.Scanner;

public class _2_3_bucla_numerica_pana_la_duble_11 {
    private static int punctul3() {
        Scanner in = new Scanner(System.in);
        int nr;
        do{
            System.out.print("introduceti numar: ");
            nr = in.nextInt();
        }while((nr/ 10) != (nr % 10));
        return nr;
    }
    private static int punctul3v2() {
        Scanner in = new Scanner(System.in);
        int nr;//metoda de lucru cu numere intregi

        do{
            System.out.print("introduceti NR: ");
            nr = in.nextInt();

        }while(((Integer.toString(nr).length() == 2) &&
                (Integer.toString(nr).charAt(0) != Integer.toString(nr).charAt(1)) ||
        Integer.toString(nr).length() != 2));
        return nr;
    }
    public static void main(String[] args) {
        System.out.println(" Ati introdus corect: " + punctul3v2());
        //metoda de apelare din main, poat merge amandoua
    }
}

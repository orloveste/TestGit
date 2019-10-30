package Clasa_29_09_2019.reluare_clasa_program;

public class _8_Sir_suma_medie {
    public static void main(String[] args) {
        int[] arrayOfInts = {10, 15, 20, 25, 30};
        System.out.println(arrayOfInts[0]);
        System.out.println(arrayOfInts[1]);
        System.out.println(arrayOfInts[2]);
        System.out.println(arrayOfInts[3]);
        System.out.println(arrayOfInts[4]);
        int suma = 0;
        for (int i = 0; i < arrayOfInts.length; i++) {
            System.out.print(arrayOfInts[i] + " ");
            suma += arrayOfInts[i];
            suma = suma + arrayOfInts[i];
        }
        System.out.println();//go to next line
        System.out.println("Suma = " + suma);
        System.out.println("Media = " + (double) suma/arrayOfInts.length);
        for (int i : arrayOfInts) {
        System.out.println(i + " ");
        }

    }

}

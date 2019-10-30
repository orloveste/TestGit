package Clasa_28_09_2019;

public class Arrays_ex4_suma {
    public static void main(String[] args) {
        int[] arrayOfInts = {10, 15, 20, 25, 30};
        System.out.println(arrayOfInts[0]); // prints 10
        System.out.println(arrayOfInts[2]); // prints 20
        System.out.println(arrayOfInts[4]); // prints 30
        // prints 10 15 20 25 30
        int suma = 0; // daca schimbi in double - rezultatul il da cu zecimale
        for (int i = 0; i < arrayOfInts.length; i++) {
            System.out.print(arrayOfInts[i] + " ");
            suma = suma + arrayOfInts[i];// sau (suma += arrayOfInts[i])
        }
        System.out.println("suma = " + suma); // suma
        System.out.println(); // go to the next line
        System.out.println("media = " + suma/arrayOfInts.length); // media rotunjita // sau (double)suma/array...
        // prints 10 15 20 25 30

        /*for(int i : arrayOfInts) {
            System.out.print(i + " ");
        }*/
    }
}

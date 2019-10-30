package Clasa_28_09_2019;

public class Arrays {
    public static void main(String[] args) {
        int[] arrayOfInts = {10, 15, 20, 25, 30};
        System.out.println(arrayOfInts[0]); // prints 10
        System.out.println(arrayOfInts[2]); // prints 20
        System.out.println(arrayOfInts[4]); // prints 30
        // prints 10 15 20 25 30
        for (int i = 0; i < arrayOfInts.length; i++) {
            System.out.print(arrayOfInts[i] + " ");
        }
        System.out.println(); // go to the next line
        // prints 10 15 20 25 30

        /*for(int i : arrayOfInts) {
            System.out.print(i + " ");
        }*/


    }
}

package Clasa_29_09_2019.reluare_clasa_program;

import java.util.Scanner;

//import com.sun.java_cup.internal.runtime.Scanner;
//import com.sun.java_cup.internal.runtime.Scanner;
public class _3_ExempleWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numar = 0;
        System.out.print("Introduceti numar: ");
        numar = in.nextInt();
        int k = 1;
        while (k <= numar) {
            System.out.print(k);
            if (k == numar) {
                System.out.print(".");
            }
            else {
                System.out.println(", ");
            }
            k++;
        }
        k = 1;
        System.out.print("\n"); //sau "System.out.println();"
        while (k < numar) {
            System.out.printf (k+ ", ");
            k++;
        }
        System.out.print(k + ".");
    }
}

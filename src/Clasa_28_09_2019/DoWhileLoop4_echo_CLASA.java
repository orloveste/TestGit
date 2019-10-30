package Clasa_28_09_2019;
import java.util.Scanner;
public class DoWhileLoop4_echo_CLASA {
    public static void main(String[] args) {
        String text = new String();
        Scanner in =  new Scanner(System.in);
        do {
            System.out.println("Introduceti text:");
            text = in.nextLine();
            // System.out.println("Echo!:" + text);
        } while (text.toLowerCase().equals("exit") == false);
    }
}

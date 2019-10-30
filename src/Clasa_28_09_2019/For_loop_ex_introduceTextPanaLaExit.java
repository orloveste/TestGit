package Clasa_28_09_2019;
import java.util.Scanner;
public class For_loop_ex_introduceTextPanaLaExit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = new String();
        //String text = new String("quit");// iese programul fara sa faca ceva
        /*while (!text.equalsIgnoreCase("quit")) {//! - not in fata sau (== false)
            System.out.println("Introduceti text: ");
            text = in.nextLine();
        }*/
        /*for (;;) {// optimizare de cod
            System.out.println("Introduceti text: ");
            text = in.nextLine();
            */
        /*if (text != ("quit")) {
                break;
            }*/
        /*
            if (text.equalsIgnoreCase("quit")){// cu if
                break;
            }*/
            for (;text.equalsIgnoreCase("quit") == false;) {// optimizare de cod
                System.out.println("Introduceti text: ");
                text = in.nextLine();
        }
    }
}

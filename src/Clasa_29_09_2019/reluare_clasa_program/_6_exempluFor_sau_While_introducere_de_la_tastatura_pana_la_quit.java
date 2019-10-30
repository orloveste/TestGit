package Clasa_29_09_2019.reluare_clasa_program;

import java.util.Scanner;

public class _6_exempluFor_sau_While_introducere_de_la_tastatura_pana_la_quit {
    public static void main(String[] args) {
        String text = new String("");
        Scanner in = new Scanner(System.in);
        /*while (!text.equalsIgnoreCase("quit")) {
            System.out.println("Introducere text: ");
            text = in.nextLine();
            if(text.equalsIgnoreCase("quit")) {
                break;
            }
        }*/
        for(;text.equalsIgnoreCase("quit") == false;) {
            System.out.println("Introduceti textul: ");
            text = in.nextLine();
        }
    }
}

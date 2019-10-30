package Clasa_29_09_2019.reluare_clasa_program;

import java.util.Scanner;

public class _4_DoWhile_introducere_text_pana_la_exit {
    public static void main(String[] args) {
        String text = new String();
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Introduceti textul");
            text = in.nextLine();
            System.out.println("Echo!: " + text);
        } //while (text.toUpperCase().equalsIgnoreCase("exit") == false); //pare acelas lucru
         while (text.toLowerCase().equals("exit") == false);
         //while (text.toLowerCase().equals("exit") == true); //il executa invers
    }
}

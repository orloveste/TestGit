package Clasa_2019_10_26;

import Clasa_2019_10_26.Slack_clasa.JocZaruri;

import java.util.Scanner;

public class ghicesteZar {
    public static void main(String[] args) {
        Scanner tastatura = new Scanner(System.in);// citim de la tastatura
        JocZaruri zarPc = new JocZaruri(100);// facut obiect zar din joc zaruri
        System.out.println("introduceti miza: ");
        JocZaruri.setMizaJoc(tastatura.nextInt()); // citesti miza de la tastatura

        int valoareZarTastatura;
        do {
            System.out.println("introduceti valoare zar: ");
            valoareZarTastatura = tastatura.nextInt();
            tastatura.nextLine();// dai enter
            zarPc.aruncareZar();
            if (valoareZarTastatura > 6 || valoareZarTastatura < 1) {
                break;
            }
            if (valoareZarTastatura == zarPc.getValoareZar()){
                System.out.println(" Ai castigat " + 6*JocZaruri.getMizaJoc()+ " lei");
                System.out.println(" zarul a fost " + zarPc.getValoareZar());
                for (int i = 0; i < 6 ; i++){
                    zarPc.adaugaCastig();
                }
            } else {
                zarPc.scadePierdere();
                System.out.println("ati pierdut " + JocZaruri.getMizaJoc() + " lei");
                System.out.println(" zarul a fost " + zarPc.getValoareZar());
            }
        }
        //while (true);
        while ((valoareZarTastatura <=6 && valoareZarTastatura >=1) &&
        (zarPc.getSumaJucator() >= JocZaruri.getMizaJoc()));
        System.out.println("am ramas cu " + zarPc.getSumaJucator() + " lei");
    }
}

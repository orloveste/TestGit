package Clasa_2019_10_26.Slack_clasa;

import sun.reflect.generics.tree.ArrayTypeSignature;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class JocZaruri {
    private int valoareZar;
    private static int numarTotalAruncari = 0;
    private static int mizaJoc;
    private int sumaJucator;
    private int [] valoriZarJucator = new int[6];// statistica lui 6 din zar

    public JocZaruri(int sumaJucator){
        this.sumaJucator = sumaJucator;
    }
    public void aruncareZar(){
        Random obiectGenerareNrAleatoare = new Random();
        this.valoareZar = obiectGenerareNrAleatoare.nextInt(6) + 1;
        // sa incrementezi statistica lui 6
        this.valoriZarJucator[this.valoareZar-1]++;
        numarTotalAruncari++;
    }
    static int comparareZaruri(JocZaruri zar1, JocZaruri zar2){
        if (zar1.valoareZar > zar2.valoareZar){
            return -1;
        } else if (zar1.valoareZar < zar2.valoareZar){
            return 1;
        }else{
            return 0;
        }
    }
    public void adaugaCastig(){
        this.sumaJucator = this.sumaJucator + mizaJoc; // sau this.sumaJucator += 10;
    }
    public void scadePierdere(){
        this.sumaJucator = this.sumaJucator - mizaJoc; // sau this.sumaJucator -= 10;
    }
    public int getSumaJucator(){
        return this.sumaJucator;
    }
    public static int getNumarTotalAruncari(){
        return numarTotalAruncari;
    }
    public int getValoareZar(){
        return this.valoareZar;
    }
    public static void setMizaJoc(int mizaJoc) {
        JocZaruri.mizaJoc = mizaJoc;
    }
    public static int getMizaJoc() {
        return mizaJoc;
    }
    public void afiseazaValoriZarJucator() {//il scoate afara din functii
        System.out.println(Arrays.toString(this.valoriZarJucator));//valoriZarJucator;
    }
    /*public void afiseazaValori6ZarJucator() {//il scoate afara din functii
        System.out.println(Arrays.toString(this.valoriZarJucator));//valoriZarJucator;
    }*/
}
class Main{
    public static void main(String[] args) {
        JocZaruri jucator1 = new JocZaruri(1000);
        JocZaruri jucator2 = new JocZaruri(2000);
        Scanner tastatura = new Scanner(System.in);
        String raspuns;
        System.out.println("Introduceti miza jocului");
        JocZaruri.setMizaJoc(tastatura.nextInt());
        tastatura.nextLine();

        do {
            /*System.out.print("Doriti sa jucati? ");
            raspuns = tastatura.nextLine();// introduce da
            if (raspuns.equalsIgnoreCase("Da") == false)
                break;
            //verificarea soldului*/ // comentat nu mai cere sa confirmi fiecare joc
            if (!((jucator1.getSumaJucator() >= JocZaruri.getMizaJoc()))&&
                    (jucator2.getSumaJucator() >= JocZaruri.getMizaJoc())) {
                System.out.println("unul din jucatori nu are suficienti bani pentru acoperirea mizei jocului");
                break;

            }
            /*if ((JocZaruri.getNumarTotalAruncari()/2) == 100 ) {
                System.out.println("au fost jucate 100 de jocuri");
                break;
            } */// afiseaza doar 100 de jocuri
            /*//a doua varianta de verificare
            if ((jucator1.getSumaJucator() < 10)|| (jucator2.getSumaJucator() < 10)) {
                System.out.println("unul din jucatori nu are suficienti banin");
                break;
            }*/
            jucator1.aruncareZar();
            jucator2.aruncareZar();
            System.out.println("Jucator1 a aruncat: " + jucator1.getValoareZar());
            System.out.print(" Jucator2 a aruncat: " + jucator2.getValoareZar());
            switch (JocZaruri.comparareZaruri(jucator1, jucator2)) {
                case 1:
                    jucator2.adaugaCastig();
                    jucator1.scadePierdere();
                    System.out.println(" A castigat jucatorul 2! = " + jucator2.getSumaJucator() + " lei");
                    break;
                case -1:
                    jucator2.scadePierdere();
                    jucator1.adaugaCastig();
                    System.out.println(" A castigat jucatorul 1! = " + jucator1.getSumaJucator() + " lei");
                    System.out.println(" A castigat jucatorul 2! =  " + jucator2.getSumaJucator() + " lei");
                    break;
                case 0:
                    System.out.println("Egalitate!");
                    break;
                default:
                    System.out.println("Ai gresit ceva prin cod. Mai verifica!");
                    //System.out.printf("A castigat jucatorul 1! = %d lei, iar jucatorul 2 %d lei" + jucator1.getSumaJucator() + jucator2.getSumaJucator());
            }
            System.out.println("Jucatorul 1 a ramas cu " + jucator1.getSumaJucator() + " lei");
            System.out.println("Jucatorul 2 a ramas cu " + jucator2.getSumaJucator() + " lei");
            System.out.println("************************************");
            //System.out.printf("A castigat jucatorul 1! = %d lei, iar jucatorul 2 %d lei = " + jucator1.getSumaJucator());
        //}while(raspuns.equalsIgnoreCase("Da"));// confirma fiecare joc
        //}while(JocZaruri.getNumarTotalAruncari()/2 < 50);// ruleaza ruleaza pana la jocul 50
        }while(true);// ruleaza cat exista bani
        /*if (jucator1.getSumaJucator() < 10){
        }
        else if (jucator2.getSumaJucator() < 10){
        }
        else {
        }*/ //nu trebuie sa iasa din do
        //System.out.printf("A castigat jucatorul 1! = %d lei, iar jucatorul 2 %d lei" + jucator1.getSumaJucator() + jucator2.getSumaJucator());

        System.out.printf("Dupa %d jocuri situatie arata asa:\n", JocZaruri.getNumarTotalAruncari()/2 );
        System.out.println("Jucatorul 1 a ramas cu " + jucator1.getSumaJucator() + " lei");
        System.out.println("Jucatorul 2 a ramas cu " + jucator2.getSumaJucator() + " lei");
        System.out.println("Statistica 6/6 jucator1: ");
        jucator1.afiseazaValoriZarJucator();
        System.out.println("Statistica 6/6 jucator2: ");
        jucator2.afiseazaValoriZarJucator();
        //jucator1.afiseazaValoriZarJucator(int[6]);

        System.out.println("stitistica zar 6 jucator1: ");
        //jucator1.afiseazaValoriZarJucator()+jucator2.afiseazaValoriZarJucator());


        System.out.println("Sfarsit!");
    }
}
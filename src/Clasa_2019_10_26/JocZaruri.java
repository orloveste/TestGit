/*
package Clasa_2019_10_26;

import java.util.Random;
import java.util.Scanner;

public class JocZaruri {
    private  int valoareZar;
    private static  int numarTotalAruncari = 0; // il definesti cu 0 pentru main
    private int sumaJucator;
// aici faci achizitiile
    public JocZaruri (int sumaJucator) {
        this.sumaJucator = sumaJucator;
    }
    public void aruncareZar(){
        Random obiectGenerareNrAleatoare = new Random();
        this.valoareZar = obiectGenerareNrAleatoare.nextInt(6) +1;
        // daca ar fi fost fara parametru
        //this.valoareZar = obiectGenerareNrAleatoare.nextInt() % 6 + 1;
        numarTotalAruncari++;
    }
    static int comparareZaruri(JocZaruri zar1, JocZaruri zar2) {
        if (zar1.valoareZar > zar2.valoareZar){
            return -1;
        }
        else if (zar1.valoareZar < zar2.valoareZar){
            return 1;
        }
        else {
            return 0;
        }
    }
    public void adaugaCastig() {
        this.sumaJucator = this.sumaJucator +10;
        //this.sumaJucator += 10; // sau asa
    }
    public void scadePierdere() {
        this.sumaJucator = this.sumaJucator -10;
        //this.sumaJucator -= 10; // sau asa
    }
    //6

    public int getSumaJucator() { // vreau sa iau valoarea
        return sumaJucator; // face doar un return //return this.sumaJucator
        //nu facem logica aici
    }
    public static int getNumarTotalAruncari() {
        return numarTotalAruncari;
    }
    public int getValoareZar() {
        return valoareZar;// return this.valoareZar;
    }
}
class Main{
    public static void main(String[] args) {
        //1
        JocZaruri jucator1 = new JocZaruri(100);// aici dai creditul
        JocZaruri jucator2 = new JocZaruri(400);// aici dai creditul
        //2
        Scanner tastatura = new Scanner(System.in);
        String raspuns;
        do {
            System.out.print("doriti sa jucati? ");
            raspuns = tastatura.nextLine();
            if (raspuns.equalsIgnoreCase("nu"))
            //if (!raspuns.equalsIgnoreCase("nu") == false) // alta posibilitate
            //if (raspuns.equalsIgnoreCase("da") == false) // alta varianta
                System.out.println("Nu mai execut altceva");
                break;
                jucator1.aruncareZar(); //dai valoarea
                jucator2.aruncareZar();
            System.out.println("jucator1 arunca: " + jucator1.getValoareZar());//print valoare
            System.out.println("jucator2 arunca: " + jucator2.getValoareZar());
            //compari valorile
            //if (JocZaruri.comparareZaruri(jucator1, jucator2)> 0) // merge dezvoltat
            switch (JocZaruri.comparareZaruri(jucator1, jucator2)) {// executa metoda, iar rezultatul
                //executa case-urile
                case 1:
                    jucator2.adaugaCastig();
                    jucator1.scadePierdere();
                    System.out.println(" a castigat jucator 2");// poti sa incerci cu suma
                    break;
                case  -1 :
                    jucator1.adaugaCastig();
                    jucator2.scadePierdere();
                    System.out.println(" a castigat jucator 1");// poti sa incerci cu suma
                    break;
                case 0 :
                    System.out.println(" egalitate ");
                    break;
                default:
                    System.out.println("mai verifica ce ai gresit");
            }

        } while (raspuns.equalsIgnoreCase("da"));
        //afisare suma ramasa la final
        System.out.println("game over! ");
        System.out.printf("dupa %d jocuri situatia arata asa : \n" , JocZaruri.getNumarTotalAruncari()/2);
        System.out.println("jucator 1: " + jucator1.getSumaJucator() + " lei");
        System.out.println("jucator 2: " + jucator2.getSumaJucator() + " lei");
    }
}
*/

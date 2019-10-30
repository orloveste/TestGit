package Clasa_2019_10_19;

import java.util.Random;
import java.util.Scanner;
//import java.util.*; // importa toate

public class Tema3_saptamana2_siruri {
    private int[] vector; //vector - cate obiecte sir cream atatea avem// vreau sa am un sir cu numele vector
    //int[] vector = new int[10]; //daca vrem sa ii dam marimea
    static int count = 0; //ststic e o valoare per clasa
    public Tema3_saptamana2_siruri(int len) {//constructorul nu pune valoari in count - doar in vector
        vector = new int[len]; // i-am zis cat de mare sir trebuie sa fie
        Random random = new Random(); // am facut sirul gol, fara continut
        for (int i = 0; i < len; i++) {
            vector[i] = random.nextInt(49) + 1;// ne da pana la 100 doar - fara da infinit 0-9/1-10
            /*vector[i] = 1 + random.nextInt(49);// ne da pana la 1-49 doar - fara da infinit*/
        }
    }

    public void AfisareSir(){
        for (int i = 0; i < this.vector.length; i++) { //"this.vector" este optional in cazul asta
            System.out.print(this.vector[i] + " "); //elementele vectorului
        }
    }
    public int NrAparitii(int x) {
        int contor = 0; //contor de aparitii
        for (int i = 0; i<vector.length; i++ ){//iterez sirul
        if (vector[i] == x){
            contor++;
        }
        } return contor;
    }
    public static void AfisareStatica(Tema3_saptamana2_siruri obj) {//test static
        obj.AfisareSir();
    }
}
class main { //nu merg mai multe clase publice
    public static void main(String[] args) {
        Tema3_saptamana2_siruri sir1 = new Tema3_saptamana2_siruri(7);// apelezi constructorul
        sir1.AfisareSir();//afiseaza sirul
        Scanner input = new Scanner(System.in);
        System.out.println("introduceti numarul de cautat in sir: ");
        int nr = input.nextInt();

        System.out.println();
        Tema3_saptamana2_siruri nrLoto = new Tema3_saptamana2_siruri (6);
        nrLoto.AfisareSir();
        System.out.println();// test static apelat
        Tema3_saptamana2_siruri.AfisareStatica(nrLoto);//test static apelat




    }
}


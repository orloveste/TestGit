package Clasa_2019_10_20;

import java.util.Scanner;

public class Produse {
    String numeProdus;
    int pret;
    static int totalProduse = 10; // static oastreaza contorul in clasa scadenumarul de produse
    public Produse(String nume, int pret){
        this.numeProdus = nume;
        this.pret = pret;
        totalProduse--;
    }
}
class StartApp {
    public static void main(String[] args) {
//cos de produse un sir de produse
        Produse [] cos = new Produse[3];//cos de 3 produse
        int buget =100;
        int nrProduse =0;
        String produs; // ai nevoie pentru raspuns
        int pretProdus =0;
        Scanner in = new Scanner(System.in); //pentru citire de la tastatura
        //bucla do while cate produse vrea sa cumpere si ce produse
        do {
            System.out.println("Ce Doriti? ");
            produs = in.nextLine();// citesti ce produs
            // daca introduci nimic trebuie sa il scoti din program
            if (produs.equalsIgnoreCase("nimic")) {
                System.out.println("La revedere!");
                break;
            }
            System.out.println("de cati bani? ");
            pretProdus =in.nextInt(); //citesti de cati bani
            in.nextLine();
            Produse obj = new Produse(produs, pretProdus); // creezi produsul
            //trebuie contor de produse din cos
            cos[nrProduse] = obj;
            nrProduse++;// cresc numar produsele din cos
            //verific daca nu introduc nimic
        } while ((produs.equalsIgnoreCase( "nimic") == false) &&
                (nrProduse < 3)); //pana raspunde nimic, si sa nu fie mai mult de 3 produse
        if (nrProduse > 0) {
        //trebuie sa calculez un total, sa merg prin sir cos - sa adun si sa fac suma
            //for (Produse x: cos) {// nu merge
            for (int i = 0; i <nrProduse; i++) {
            //cum pot afla pretul unui produs? - dai cos x.pret/
            //buget = buget - x.pret;//nu merge
            buget = buget - cos[i].pret;
            }
        }
        //restul
        if (buget > 0){
            System.out.println("Mi-au mai ramas: "+ buget+" lei");
        }
        else{
            System.out.println("Am ramas datort cu "+ Math.abs(buget) + " lei"); // reducere
        }
        System.out.println(Math.abs(buget)+ " lei");// afiseaza din sortare
        //cat a mai ramas in magazin
        System.out.println("in magazin au mai ramas " + Produse.totalProduse + " produse");
    }
}
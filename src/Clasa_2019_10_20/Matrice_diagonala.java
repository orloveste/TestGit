package Clasa_2019_10_20;

import java.math.BigDecimal;
import java.util.Scanner;

public class Matrice_diagonala {
    public static void main(String[] args) {
        //int [][] m = new int[4][4];
        int[][] m = {{1, 2, 3}, {4, 5, 6,}, {7, 8, 9}};//[][] SIR DE SIRURI LINII SI COLOANE
        System.out.println("matricea ");
        /*for (int i = 0; i < m[0].length; i++) { //for linii si coloane
            m[i][i] = 0;
            //m[i]+[i] = 2;
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "  ");
                //System.out.print(([i]+[j]=2 +" 0 ");
                for (int i = 0; i < 4; i++) {
            }
            //for (int i = 0; i < 4; i++) {
            //m[i][i] = 0;
            System.out.println();
        }*/
        System.out.println();
        for (int i = 0; i < m[0].length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "  ");
            }
            System.out.println();
        } // afiseaza matricea
        /*System.out.println();
        for (int i = 0; i < m[0].length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if ((m[i][j] % 2) == 0)
                    System.out.print(m[i][j] + "  ");
            }
            System.out.println();
        } // afiseaza numerele pare/ sau impare*/
        /*System.out.println();
        for (int i = 0; i < m[0].length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                    System.out.print(m[i][j] + "  ");
            }
            System.out.println();
        } // afiseaza patrice*/
        /*System.out.println();
        for (int i = 0; i < m[0].length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                //if (i==j){
                    System.out.printf("m[%d][%d]  ", i, j );
                //}
            }
            System.out.println();
        } // afiseaza adresa matricei coordonate*/
        /*System.out.println();
        for (int i = 0; i < m[0].length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                //if (i==j){
                System.out.printf(m[i][j] + "  " );
                //}
            }
            System.out.println();
        } // print matrice*/
        /*System.out.println();
        for (int i = 0; i < m[0].length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                //if (i==j){
                System.out.printf("m[%d][%d] = %d  ", i, j, m[i][j]);
                //}
            }
            System.out.println();
        } // afiseaza adresa matricei si continutul*/
        /*System.out.println();
        for (int i = 0; i < m[0].length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][0] =0;
                System.out.printf(m[i][j] + "  ");

            }
            System.out.println();
        }// inlocuieste prima coloana cu 0*/
        /*System.out.println();
        for (int i = 0; i < m[0].length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[0][j] = 0;
                System.out.printf(m[i][j] + "  ");

            }
            System.out.println();
        } //prima linie inlocuita cu 0*/
        /*System.out.println();
        for (int i = 0; i < m[0].length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i+j == 2) m[i][j] = 0;
                System.out.printf(m[i][j] + "  ");

            }
            System.out.println();
        } // diagonala inversa 0*/
        /*System.out.println();
        for (int i = 0; i < m[0].length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                //if (i-j == 0) m[i][j] = 0;// sau (i==j)
                *//*if (i==j ) {
                    m[i][j] = 0;
                }*//*
                if (i==j) m[i][j] = 0;
                System.out.printf(m[i][j] + "  ");
            }
            System.out.println();
        }*/

        /*System.out.println();
        int nrIntrodus;
        Scanner in = new Scanner(System.in);
        System.out.println("introduceti linia: ");
        nrIntrodus = in.nextInt();
        if (nrIntrodus > 2) {
            System.out.println("erorr");
        }
        for (int i = 0; i < m[0].length; i++) {
            for (int j = 0; j < m[i].length; j++) {
            }
            System.out.print(m[nrIntrodus][i] + "  ");

            //System.out.println(m[nrIntrodus][j]);

        } // afiseaza doar o linie pe care o chemi din tastatura*/


    }

}
class nrFactorRial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nr;
        System.out.print("introduceti numarul: ");
        nr = in.nextInt();
        int produs = 1;
        for (int i = 1; i <= nr; i++) {
            produs = produs*i;

        }
        System.out.println(nr + " ! = " + produs);
    }
}
class nrFactorRial_bigDecimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nr;
        System.out.print("introduceti numarul: ");
        nr = in.nextInt();
        int produs = 1;
        BigDecimal bigB = new BigDecimal(1);
        for (int i = 1; i <= nr; i++) {
            //produs = produs*i;
            BigDecimal bigI = new BigDecimal(i);
            bigB = bigB.multiply(bigI);

        }
        System.out.println(nr + " ! = " + bigB.toString());
    }
}
class nrLaPutere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("introduceti n (puterea): ");
        n = in.nextInt();
        int produs = 1;
        BigDecimal bigP = new BigDecimal(1);
        for (int i = 1; i <= n; i++) {
            BigDecimal bigI = new BigDecimal(2);
            bigP = bigP.multiply(bigI);
        }
        System.out.println(n + "^ = " + bigP.toString());
        //metoda2
        BigDecimal doi = new BigDecimal(2);
        System.out.println("metoda 2 cu \"pow\": 2^" + n +" = "+ doi.pow(n) + " sau " +
                Math.pow(2,n));
        System.out.println();
        //metoda3

    }
}


//System.out.println(m[nrIntrodus][j]);




package Clasa_2019_10_19;

public class matrici {
    public static void main(String[] args) {
        //int [][] m = new int[4][4];
        int [][] m = {{1,2,3}, {4,5,6,},{7,8,9}};//[][] SIR DE SIRURI LINII SI COLOANE
        System.out.println("matricea ");
        for (int i = 0; i < m[0].length; i++) { //for linii si coloane
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "  ");
            }
            System.out.println();
        }//TEMA DE A EXERSA CLASELE SI METODELE
        //CAMP MATRICEA
        //METODE - INTRODU JUCATOR 1
        //INTRODU JUCATOR 2
        //VALIDARE JUCATOR
        int a = 9, b = 18;
        System.out.printf("a=%d si b=%d", a, b);
        int c;
        c = a;
        a = b;
        b = c;
        System.out.printf("\n a=%d si b=%d", a, b);
        /*int d;
        d=c;
        c=b;
        b=a;
        a=d;
        System.out.printf("\n a=%d si b=%d si c=%d", a, b, c);*/
    }
}

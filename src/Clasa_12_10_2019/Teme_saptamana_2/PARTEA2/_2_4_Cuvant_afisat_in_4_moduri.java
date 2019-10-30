package Clasa_12_10_2019.Teme_saptamana_2.PARTEA2;
// si punctul 5
import java.util.Scanner;

public class _2_4_Cuvant_afisat_in_4_moduri {
    /*private static int punctul3() {
        Scanner in = new Scanner(System.in);
        int nr;
        do{
            System.out.print("introduceti numar: ");
            nr = in.nextInt();
        }while((nr/ 10) != (nr % 10));
        return nr;
    }
    private static int punctul3v2() {
        Scanner in = new Scanner(System.in);
        int nr;//metoda de lucru cu numere intregi

        do{
            System.out.print("introduceti NR: ");
            nr = in.nextInt();

        }while(((Integer.toString(nr).length() == 2) &&
                (Integer.toString(nr).charAt(0) != Integer.toString(nr).charAt(1)) ||
                Integer.toString(nr).length() != 2));
        return nr;
    }*/
    private static void  punctul4(String str) {
        if (str.length() % 2 ==0) {//par
            System.out.println(str.substring(0,str.length() /2) + "-"
                    + str.substring(str.length()/2));

        } else {//impar
            System.out.println(str.substring(0,str.length() /2) + "-"
                    + str.charAt(str.length()/2) + "-"
                    + str.substring(str.length()/2+1));
        }//afisare caracter cu caracter
        for (int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }

    }
    private static void punctul5(String [] sir) {
        Scanner in = new Scanner(System.in);
        String text;
        System.out.println("Introduceti text de inceput");
        text = in.nextLine().toLowerCase();
        for (int i = 0; i < sir.length; i++){
            if (sir[i].startsWith(text)){
            System.out.println(sir[i]);
        }
        }

    }
    public static void main(String[] args) {
        //System.out.println(" Ati introdus corect: " + punctul3v2());
        //metoda de apelare din main, poat merge amandoua
        String str = "masina";
        punctul4(str);
        String[] sirStr = {"mama", "masa", "mimi", "casa"};
        punctul5(sirStr);

    }
}

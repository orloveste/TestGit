package Clasa_2019_10_20;

import java.util.Arrays;

public class enhance_for {
    public static void main(String[] args) {
        int[] v = {11, 22, 33, 46, 5, 55, 33};
        for (int x : v) {
            System.out.print(x + " ");
        }
        //acelas lucru
        System.out.println();
        for (int i = 0; i < v.length; i++) {
            int x = v[i];
            System.out.print(x + " ");
        }
        for (int x : v){
            if (v[x] == 33) {
                v[x] = 99;
            }
            System.out.print(x + " ");
        }//ASA NU ESTE BINE

        System.out.println();
        for (int i = 0; i < v.length; i++) {
            if (v[i] == 33) {
                v[i] = 99;
            }
            System.out.print(v + " ");
            System.out.println("\n Afisare simpla sir:" + Arrays.toString(v));
        }
        //System.out.println("\n Afisare simpla sir:" + Arrays.toString(v));
    }// DE LUAT DE PE SLACK DE EXERSAT ACASA
}
class EnhFor {
    public static void main(String[] args) {
        int[] v =  {33, 22, 33, 46, 55, 33};
        for( int x: v){
            System.out.print(x + " ");
        }
        System.out.println();
        //acelasi lucru cu
        for(int i = 0; i < v.length; i++){
            int x = v[i];
            System.out.print(x + " ");
        }
        /* Vrem sa inlocuim 33 cu 99 in sirul v */
        for (int x: v){ // nu e bine asa
            if (x == 33){
                x = 99;
            }
        }
        System.out.println("\n" + Arrays.toString(v));

        /*for (int i = 0 ; i < v.length; i++){ // varianta corecta
            if (v[i] == 33){
                v[i] = 99;
            }
        }
        System.out.println("\n" + Arrays.toString(v)); // INLOCUIESTE 33 CU 99*/

        for (int i = 0 ; i < v.length; i++){ // varianta corecta
            /*if (v[i] < 40){
                v[i] = 10;
            }
            else {
                v[i] = 90;
            }*/
            v[i] = (v[i] <40) ? 10 :90;// altfel de mai sus
        }
        System.out.println("\n" + Arrays.toString(v));

        /*double a;
        a= 3*9/3;
        System.out.println("a= "+ a); // exemplu?*/
    }
}

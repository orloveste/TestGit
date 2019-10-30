package Clasa_2019_10_26;

import Clasa_28_09_2019.Arrays;

public class sirInversat {
    public static void main(String[] args) {
        int [] sir = {1,2,29,3,4,22,5,6,7,8};// faci sirul
        int variabilaAuxiliara;//necesara inversarii - tranzit numar schimbabil
        for (int i = 0; i < sir.length; i++) {//afisare sir
            /*x = sir[i];
            sir[i]*/
            System.out.print(sir[i] + " ");//afisare sir
        }
        //modificare sir = inversare
        for (int i = 0; i < sir.length/2; i++){
            variabilaAuxiliara = sir[i];
            sir[i] = sir[sir.length-i-1];
            sir[sir.length-i-1] = variabilaAuxiliara;
        }
        /*System.out.println();
        for (int i = 0; i < sir.length; i++) {//afisare sir dupa modificare
            System.out.print(sir[i] + " ");
        }*/
        // mai simpla sortarea
        /*Arrays.sort(sir);
        System.out.println("\nsirul sortat: " + Arrays.toString(sir));*/ // de verificat de ce nu merge pe slack
        //ordonare sirului bublesort - 1 metoda;
        for (int i = 0; i < sir.length; i++) {
            for (int j = 0; j < sir.length -1 -i; j++) {
                if (sir[j] > sir[j + 1]) {// de la mai mare la mai mic sau invers <>
                    variabilaAuxiliara = sir[j];
                    sir[j] = sir[j + 1];
                    sir[j + 1] = variabilaAuxiliara;
                }

            }

        }
        System.out.println();
        for (int i = 0; i < sir.length; i++) {//afisare sir dupa modificare
            System.out.print(sir[i] + " ");
        }
    }
}

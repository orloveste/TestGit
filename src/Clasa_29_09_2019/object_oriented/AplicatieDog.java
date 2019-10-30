package Clasa_29_09_2019.object_oriented;
import java.util.Scanner;

public class AplicatieDog {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Dog[] caini = new Dog[5];
        caini[0] = new Dog("Patrocle", 5, "medie");
        caini[1] = new Dog("Azorel", 15, "mica");
        caini[2] = new Dog("Nero", 1, "mare");
        caini[3] = new Dog("Pluto", 11, "medie");
        caini[4] = new Dog("Pufi", 7, "mica");

        String talieCaine;
        System.out.print("intoduceti talie caine: ");
        talieCaine = in.nextLine();
        System.out.println("Afisam cainii:");
        for (int i = 0; i < caini.length; i++) {
            caini[i].afisareCaine(talieCaine); // afisare caine
            // Dog.afisareCaineStatic(caini[0]); // afisare prin intermediul unei metode statice cu parametru
        }

        /* mic exemplu de apelare metoda cu paramentrii */
        int s = suma(6, 99);
        System.out.println("Suma numerelor 6 si 99 este: " + s);
    }

    public static int suma(int a, int b) {
        return (a + b);
    }
}

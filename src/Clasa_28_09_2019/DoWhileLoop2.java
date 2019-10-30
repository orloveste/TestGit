package Clasa_28_09_2019;

public class DoWhileLoop2 {
    public static void main(String[] args) {
        // sa afisam numele de 5 ori
        int nr = 5;
        do {
            System.out.println("Eugeniu Orlov ");
            //nr--; // daca este singur poate sa mearga fara cerinta de mai jos de --
        } while (--nr > 0);
    }
}

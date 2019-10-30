package Clasa_28_09_2019;

public class For_loop {
    public static void main(String[] args) {
        for (int x = 0; x <= 10; x=x+3) {// x=x+2 - afiseara doar pare var2
            //if (x % 2 == 0)// var 1 afisare doar numere pare

            System.out.println("x este: " + x);
        }
        /*for (int x = 0; x < 5; x++) {
            System.out.println("Eugen");
        }*/
        /*for (int x = 1; x <= 5; x++) {
            System.out.println("Eugen "+ x);
        }*/
        /*for (int x = 5; x >= 1; x--) {
            System.out.println("Eugen "+ x);
        }*/
        /*for (int x = 5; x >= 1; x-=5) {
            System.out.println("Eugen "+ x);
        }*/
        for (int x = 5; x >= 1; x--) {
            System.out.println("Eugen "+ x);
            if (x == 3){
                break;
            }
        }
        /*for (int x = 5; x >= 1; x--) {
            if (x == 4) {
                continue;
            }
            System.out.println("Eugen "+ x);
            if (x == 3){
                break;// iese din bloc
            }
        }*/
        /*for (int x = 5; x >= 1; x--) {
            if (x == 4) {
                return;// iese din metoda
            }
            System.out.println("Eugen "+ x);
            if (x == 3){
                break;
            }
        }*/





    }
}

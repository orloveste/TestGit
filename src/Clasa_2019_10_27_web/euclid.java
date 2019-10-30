package Clasa_2019_10_27_web;

public class euclid {
    public static void main(String[] args) {
        int a = 15;
        int b = 30;
        while (a != b) {
            if (a < b) {
                b = b - a;
            } else {
                a = a - b;
            }
        }
        System.out.println("cel mai mare multiplu comun + " + a );
    }
}



package Clasa_28_09_2019;
import java.util.Scanner;

public class anBisect {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int an = 0;
        System.out.println("baga anul: ");
        an = in.nextInt();
        if ((((an % 4) == 0) && ((an % 100) != 0)) ||
                ((an % 400) == 0)) {
            System.out.println(" anul este bisect");
        } else {
            System.out.println("anu nu este bisect");
        }
    }
}

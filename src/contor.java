public class contor {
    public static void main(String[] args) {
        int x =3;
        int k = 0;
        while (x < 5) {
            k++;
            //System.out.println(x);
            x--;
            if (x == -4){
                break;
            }
        }
        System.out.println(x);
        System.out.println("a intrat de " + k + " ori");

    }
}
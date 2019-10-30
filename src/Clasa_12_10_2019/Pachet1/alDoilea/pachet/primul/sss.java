package Clasa_12_10_2019.Pachet1.alDoilea.pachet.primul;

public class sss {
    public static void main(String[] args) {
        int a = 9;
        int c = 20;
        System.out.println("a= " + (a++));
        System.out.println("a= " + (++a));
        System.out.println("a= " + (--a));
// nu se recomanda -- si ++ pe aceeasi linie
        //a = 10 il face 9 si il aduna cu 10
        int b = --a + a++;// se imparte in 3 linii, faca ++a dupa care --a si dupa care se imparte
        System.out.println("b= " + b);
        System.out.println("a= " + a);

        System.out.println("b= " + (a) + " si apoi " + (++a));
        System.out.println("a= " + a);
        Integer i = new Integer(6);


        //System.out.println("a= " + (a++));
        //System.out.println("a= " + (a++));
    }
}

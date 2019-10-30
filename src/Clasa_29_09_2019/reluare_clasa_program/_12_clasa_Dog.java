package Clasa_29_09_2019.reluare_clasa_program;

import Clasa_29_09_2019.object_oriented.Dog;

public class _12_clasa_Dog {
    private String name;
    private int age;
    protected String size;
    public static int noDogs = 0;
    public static int noDogsUnder10 = 0;
    public _12_clasa_Dog(String n, int age, String size) {
        this.name = n; //se putea si (name = n)
        this.age = age;
        this.size = size;
        noDogs++;
        if (this.age < 10) {
            noDogsUnder10++;
        }
    } public void getSound() {
        if (this.age > 10) {
            System.out.println("HAM HAM!!");
        } else {
            System.out.println("Haaaammm!");
            //noDogsUnder10++;
        }
    } public String returnGetSound() {
        if (this.age > 10) {
            return "HAM HAM!";
        } else {
            return "Haaammm!";
        }
    } public void afisareCaine(String talie) {
        if (this.size.equals(talie)) {
            System.out.println(this.name + " " + this.age + " talie: " +
                    this.size);
        } else  {
            System.out.println(this.name + " nu este de talie mica");
        }
    } public static void afisareCaineStatic(Dog d) {
        //System.out.println(d.name + " " + d.age + " talie: " + d.size);
    }
}

package Clasa_29_09_2019.object_oriented;

import java.util.Scanner;

public class Dog {
    private String name;
    private int age;
    protected String size;
    public static int noDogs = 0;
    public static int noDogsUnder10 = 0;

    public Dog(String n, int age, String size) {
        this.name = n; // se putea si name = n
        this.age = age;
        this.size = size;
        noDogs++;
        if (this.age < 10){
            noDogsUnder10++;
        }
    }

    public void getSound() {
        if (this.age > 10) {
            System.out.println("HAM HAM!");
        } else {
            System.out.println("Haaaaam!");
            //noDogsUnder10++;
        }
    }

    public String returnGetSound(){
        if (this.age > 10) {
            return "HAM HAM!";
        } else {
            return "Haaaaam!";
        }
    }

    public void afisareCaine(String talie){
        if (this.size.equals(talie)) {
            System.out.println(this.name + " " + this.age + " talie:" + this.size);
        } else {
            // System.out.println(this.name + " nu e de talie mica");
        }
    }

    public static void afisareCaineStatic(Dog d){
        System.out.println(d.name + " " + d.age + " talie:" + d.size);
    }
}
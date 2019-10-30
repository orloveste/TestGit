package Clasa_29_09_2019.reluare_clasa_program;

import Clasa_29_09_2019.object_oriented.Dog;

public class _11_clasa_aplicatie_Dog {
    public static void main(String[] args) {
        _11_clasa_dog caine1 = new _11_clasa_dog("Patrocle", 5, "medie");
        _11_clasa_dog caine2 = new _11_clasa_dog("Azorel", 15, "mica");
        System.out.print("Asa latra catelul 1: ");
        caine1.getSound();
        System.out.print("Asa latra catelul 2: ");
        caine2.getSound();
        System.out.println("Acum cu returnGetSound: ");
        String latrat;
        latrat = caine1.returnGetSound();
        System.out.println("Latrat: " + latrat);
        System.out.println("caine1.noDogs = " + caine1.noDogs + " caine1.age = " +
                caine1.age);
        System.out.println("caine2.noDogs = " + caine2.noDogs + " caine2.age = " +
                caine2.age);
        System.out.println("Dog.noDogs = " + Dog.noDogs);
        caine1.getSound();
        caine1.getSound();
        caine1.getSound();
        System.out.println("Nr caine sub 10 ani: " + Dog.noDogsUnder10);
        Dog caine3 = new Dog("Nero", 2, "mare");
        System.out.println("Nr caine sub 10 ani: " + Dog.noDogsUnder10);
    }
}

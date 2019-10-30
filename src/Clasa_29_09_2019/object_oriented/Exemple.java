package Clasa_29_09_2019.object_oriented;

public class Exemple {
    public static void main(String[] args) {

        Bicycle bike = new Bicycle(75, 2, 20);
        bike.getCadence(); // should return 75
        System.out.println(bike.getCadence()); // should print 75


        int cadence = bike.getCadence();
        System.out.println("Cadence is: " + cadence);

        System.out.println("Bicycle count: " + Bicycle.count); // should print 1
        Bicycle anotherBike = new Bicycle(80, 4, 25);
        System.out.println("New bicycle count: " + Bicycle.count); // should print 2

        // should prints true in both cases
        System.out.println(Bicycle.count == bike.count);
        System.out.println(bike.count == anotherBike.count);


    }

}

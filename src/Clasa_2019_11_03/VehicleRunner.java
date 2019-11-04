package Clasa_2019_11_03;

public class VehicleRunner {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(5);
        System.out.println("vehicle.getMaxSpeed()" + vehicle.getMaxSpeed());
        /*Boat cruise_liner = new Boat(12,20);
        System.out.println("cruise_liner.getMaxSpeed()"+ cruise_liner.getMaxSpeed());*/
        Bike bike = new Bike(true, 30);
        //bike.
        Vehicle cruise_liner = new Boat(12,20);
        System.out.println("cruise_liner.getMaxSpeed()"+ cruise_liner.getMaxSpeed());
        vehicle.duStufWithVehicle(bike);

//        vehicle.duStufWithVehicle();
//        bike.bikeSpecificMath();

    }
}

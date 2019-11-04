package Clasa_2019_11_03;

public class Boat extends  Vehicle{
    private int pasagerCapacity;
    public Boat(int pasagerCapacity, int maxSpeed){
        super(maxSpeed);
        this.pasagerCapacity= pasagerCapacity;
    }
    public int getMaxSpeed(){
        int maxSpeedBoat = super.getMaxSpeed();// alternativa de mai jos
        System.out.println("max speed of boat is " + maxSpeedBoat);
        return maxSpeedBoat;

        /*System.out.println("max speed of boat is " + super.getMaxSpeed());
        return super.getMaxSpeed();*/

    }
}

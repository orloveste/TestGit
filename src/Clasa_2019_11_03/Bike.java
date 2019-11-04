package Clasa_2019_11_03;

public class Bike extends Vehicle {
    private boolean isDownhill;
    public Bike(boolean isDownhill, int maxSpeed){
        super(maxSpeed);

        this.isDownhill = isDownhill;
    }
    public void bikeSpecificMath(){
    }
}

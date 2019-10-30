package Clasa_29_09_2019.object_oriented;

public class Bicycle {
    public int cadence;
    private int gear;
    private int speed;
    static int count = 0;

    public Bicycle(int cadence, int gear, int speed) {
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
        this.count++;
    }

    public int getCadence() {
        return cadence;
    }

    public static int getCount() {
        return count;
    }

}

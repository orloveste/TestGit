package Class_2019_11_10.Ocean;

public abstract class Animal {
    private boolean isAlive = true;
    private int speed = 10;
    private boolean isAlivePeste = true;

    public int getSpeed() {
        return speed;
    }

    public void swim(int speed) {
        this.speed = speed;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public boolean isAlivePeste() {
        return isAlivePeste;
    }

    public void setAlivePeste(boolean isAlivePeste) {
        this.isAlivePeste = isAlivePeste;
    }
}

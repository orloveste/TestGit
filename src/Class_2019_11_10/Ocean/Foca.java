package Class_2019_11_10.Ocean;

public class Foca extends AnimaleCareVaneaza {
    @Override
    public void hunt(Animal target) {

        if (this.getSpeed() > target.getSpeed()) {
            target.setIsAlive(false);
            System.out.println("Target-ul a murit!");
        } else if (super.getSpeed() == target.getSpeed()) {
            System.out.println("Viteze egale!");
        } else {
            System.out.println("Target-ul a scapat!");
        }
    }
}

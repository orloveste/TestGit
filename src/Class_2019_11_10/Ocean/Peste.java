package Class_2019_11_10.Ocean;

public class Peste extends AnimaleCareSuntVanate {
    @Override
    public void balbac(Animal vanat) {
        if (this.getSpeed() < vanat.getSpeed()) {
            vanat.setAlivePeste(false);
            System.out.println("Baldalac...");
        } else if (this.getSpeed() == vanat.getSpeed()) {
            System.out.println("Viteze egale!");
        } else {
            System.out.println("Baldabac!");
        }

    }
}

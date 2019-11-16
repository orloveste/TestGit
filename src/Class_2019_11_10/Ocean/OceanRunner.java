package Class_2019_11_10.Ocean;

public class OceanRunner {
    public static void main(String[] args) {

        AnimaleCareVaneaza animalFoca = new Foca();
        AnimaleCareVaneaza animalRechin = new Rechin();
        AnimaleCareSuntVanate animalPeste = new Peste();

        animalFoca.swim(30);
        animalRechin.swim(20);
        animalPeste.swim(5);

        animalFoca.hunt(animalPeste);
        animalRechin.hunt(animalFoca);
        animalPeste.balbac(animalRechin);

        System.out.println(animalPeste.isAlivePeste());
        System.out.println(animalFoca.isAlive());
        System.out.println(animalRechin.isAlive());

    }
}



package Clasa_29_09_2019.reluare_clasa_program;

public class _11_clasa_dog {
    private String name;
    public int age;
    protected String size;
    public static int noDogs = 0;
    public static int noDogsUnder10 = 0;

    public _11_clasa_dog(String n, int age, String size) {
        this.name = n; //se poate si (name = n)
        this.age = age;
        this.size = size;
        noDogs++;
        if (this.age < 10) {
            noDogsUnder10++;
        }
    }

    public void getSound() {
        if (this.age > 10) {
            System.out.print("HAM HAM! ");
        } else {
            System.out.printf("Haaaaami ");
            //noDogsUnder10++;
        }
    }    public String returnGetSound() {
        if (this.age > 10) {
            return "HAM HAM! ";
        } else  {
            return "Haaaammm! ";
        }

    }
}

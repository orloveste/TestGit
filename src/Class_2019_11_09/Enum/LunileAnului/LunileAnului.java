package Class_2019_11_09.Enum.LunileAnului;

import Clasa_28_09_2019.Clasa_28_09_2019;

public enum LunileAnului {
    IANUARIE("1", 31),
    FEBRUARIE("2", 28, 29),
    MARTIE("3", 31),
    APRILIE("4", 30);

    String componentaLuni;
    private int numarZile;
    private int numarzILEsPECIAL;

    LunileAnului(String numarOrdineLuna, int numarZile) {
        this.componentaLuni = numarOrdineLuna;
        this.numarZile = numarZile;
    }

    LunileAnului(String numarOrdineLuna, int numarZile, int numarZileSpecial) {
        this.numarzILEsPECIAL = numarZileSpecial;
    }


}

package Class_2019_11_09.Enum;

import Clasa_28_09_2019.Arrays;

public class EnumRunner {
    public void useEnum(Zodii zodii){
        System.out.println(zodii.toString());// printeaza numele
    }

    public static void main(String[] args) {
        EnumRunner er = new EnumRunner();
        er.useEnum(Zodii.BERBEC);
        //er.useEnum(Zodii.BERBEC.numeZodieInEng);
        er.useEnum(Zodii.RAC);
//        System.out.println(Zodii.BERBEC);
//        //System.out.println(Zodii.values()[1]);
//        System.out.println(Zodii.values().toString());
//       // System.out.println(Arrays.asList(Zodii.values()));
    }
}

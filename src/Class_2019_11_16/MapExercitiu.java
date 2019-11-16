package Class_2019_11_16;

import java.util.Hashtable;
import java.util.Map;

public class MapExercitiu {
    public static void main(String[] args) {
        Map<Integer, String> inmatriculari = new Hashtable<>();
        inmatriculari.put(103, "masina lui Boby");
        inmatriculari.put(113, "masina lui Jean");
        inmatriculari.put(11127, "masina lui Roky");
        for (Map.Entry<Integer, String> dictionary : inmatriculari.entrySet()){
            Integer identification = dictionary.getKey();
            String personalization = dictionary.getValue();
            System.out.printf("%s : %s\n", identification, personalization);// merge ci cu %d
        }
        System.out.println("-------------");
        inmatriculari.remove(113);//remove with key

        for (Map.Entry<Integer, String> dictionary : inmatriculari.entrySet()){
            Integer identification = dictionary.getKey();
            String personalization = dictionary.getValue();
            System.out.printf("%s : %s\n", identification, personalization);// merge ci cu %d
        }//cate masini sunt
        System.out.println("inmatriculari.size();" +inmatriculari.size());
        //printeaza inmatriculari daca e gol
       // inmatriculari.clear();

            System.out.println("ai golit datele !!! " + inmatriculari.isEmpty());
        //CUM IL FAC SA PRINTEZE DOAR DACA E TRUE
        

    }
}

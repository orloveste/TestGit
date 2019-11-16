package Class_2019_11_16;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class TestArrayList {
   // private static final Object E = 2 ;// nu cred ca trebuie

    public TestArrayList() {
    }

    public static  void main(String[] args) {
//        creati 3 arraylists. Una de tip Integer, una de tip String, una de tip Boolean
//un arraylist se initializeaza in felul uramtor :
//List<TIP> mylist = new ArrayList<>();
        List<Integer> myList = new ArrayList<>();
//1. adaugati 5 elemente de acel tip(Integer, String, Boolean), cu valori diferite.
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
//3. incercati sa adaugati/inserati un element la un anume index. (ex. aveti deja 3
// numere, 1,2,3; incercati sa adaugati
// un numar 4 la index 2. cum o sa arate lista acum?)
        myList.add(2,4);
//        4. scoateti elemente si printati valorile.
        //myList.remove(1);// scoate indez, !!! vreau sa scot cifra!!!
        Integer five = 5;
        myList.remove(five);
//        Object o = 4;
//        myList.remove(o);// CE FACE EXACT???? = nu este foarte clar, lasa moale

//5. incercati sa scoateti toate valorile deodata (sa stergeti elementele/sa goliti lista).
// exista o metoda sa va ajute cu asta?
        myList.clear();// ok sterge toate datele

//2. iterati prin acea lista si printati valorile
        for (int i = 0; i < myList.size(); i++ ){
            System.out.println("myList " + myList.get(i));

            /*if (myList != null) {
                System.out.println("myList is empty! ");
            }*/ // nu face nimic
        }
        //        6. verificati daca puteti sa vedeti daca lista e goala sau nu. cum faceti asta?
        if (myList.isEmpty()) {
            System.out.println("myList is empty! ");
        }
//        7. cum verificati marimea unei liste?
        System.out.println("syze of my list is = " + myList.size());
        // nu cred ca masoara marimea
        for (int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }




        //myList.addAll(Arrays.asList(1,2,3,4)) // le baga ca lista pe toate




    }
}

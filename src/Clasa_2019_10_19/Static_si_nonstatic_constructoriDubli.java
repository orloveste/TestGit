package Clasa_2019_10_19;
import java.util.*;
    public class Static_si_nonstatic_constructoriDubli {//sir
//identificare repetitii din sir
    //public class  {
        private int[] vector; // = new int[10];
        static int count = 0;
        public Static_si_nonstatic_constructoriDubli(int len){
            vector = new int[len];
            Random random = new Random();
            for(int i = 0; i < len; i++){
                vector[i] = 2 + random.nextInt(49) ;
            }
        }
        public Static_si_nonstatic_constructoriDubli(int len, int max){
            vector = new int[len];
            Random random = new Random();
            for(int i = 0; i < len; i++){
                vector[i] = 2 + random.nextInt(max) ;
            }
        }
        public void AfisareSir(){
            for (int i=0; i < this.vector.length; i++){
                System.out.print(this.vector[i] + " "); // "this" e optional in cazul asta
            }
        }
        public int NrAparitii(int x){
            int nrAparitii = 0;
            for(int i = 0; i < vector.length; i++){
                if (vector[i] == x){
                    nrAparitii++;
                }
            }
            return nrAparitii;
        }
    }
    class Main {
        public static void main(String[] args) {
            Static_si_nonstatic_constructoriDubli sir1 = new Static_si_nonstatic_constructoriDubli(15, 10);
            Static_si_nonstatic_constructoriDubli sir2 = new Static_si_nonstatic_constructoriDubli(10, 5);
            Scanner input = new Scanner(System.in);
            System.out.print("\nIntroduceti numarul de cautat in sir: ");
            int nr = input.nextInt();
            sir1.AfisareSir();
            System.out.println("\nNumarul " + nr + " apare in sir1 de " + sir1.NrAparitii(nr) + " ori\n");
            sir2.AfisareSir();
            System.out.println("\nNumarul " + nr + " apare in sir2 de " + sir2.NrAparitii(nr) + " ori");
        }
    }


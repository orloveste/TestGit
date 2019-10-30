package Clasa_29_09_2019.reluare_clasa_program;
// Ceva nu este in regula
public class _5_for_break_continue_return {
    public static void main(String[] args) {
        for (int x = 0; x < 10; x++) { // merge si cu x--
           // System.out.print("x is " + x + "; ");
        } for (int x = 10; x >= 1; x--) { // cu x++ se face bucla infinita
                if (x == 6) {//exceptii
                continue;
            }   if (x == 4) {
                return; //continue;
            }   System.out.println("Gigi " + x);
                if (x == 3) {
                break;
            }
        }
        /*for (int x = 0; x < 10; x=x+2){
            // System.out.println("x is " + x);
        }
        for (int x = 10; x >= 1; x--)
        {
            if (x == 6){
                continue;
            }
            if (x == 4){
                return; //continue;
            }
            System.out.println("Gigi " + x);
            if (x == 3){
                break;
            }
        }*/
    }
}

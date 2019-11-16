package Class_2019_11_10;

public class ExceptionRunner {
    public static void main(String[] args) {
        int a = 0;// daca pui 0 baga exceptia
        try{
            //throw new NullPointerException("omg");//arunca fortat exceptia
            int x = 5/a;
            System.out.println("x = "+ x);

        } catch (Exception myException){
            System.out.println("oh nu merge");
        }
        finally {
            System.out.println("Finnealy is always do this");
           /* try {
                ///try to close the conection
            } catch ();*/
        }
        System.out.println(" a = " + a);
    }
}

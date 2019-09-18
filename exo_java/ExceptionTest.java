//Utilisation des exceptions simplifiés.

public class ExceptionTest{
    public static void main(String []args)
    {
        int a = 15;
        int b = 0;

        try
        {
            int resultat = a / b ;
            System.out.println(resultat);
        }catch(ArithmeticException e)
        {
            System.out.println("Impossible de diviser par 0 !");
        }
    }
}
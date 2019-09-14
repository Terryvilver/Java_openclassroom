import java.util.Scanner;
//test méthode par défaut
interface Soustraction
{
    //initialisation de 2 nombres.
    int getnombre1();
    int getnombre2();

    default int soustraction()
    {
        return getnombre1() - getnombre2();
    }
}


public class DefaultMethod implements Soustraction {
    public int getnombre1()
    {
        return 10;
    }

    public int getnombre2()
    {
        return 5;
    }

    public static void main(String []args)
    {
        System.out.println("le résultat de " + new DefaultMethod().getnombre1() + "-" + new DefaultMethod().getnombre2() + "="+ new DefaultMethod().soustraction());
    }
    
}
//Premier programme avec une fonction récursif, découverte des algos.

import java.util.Scanner;

public class RecursiveFunction{

    static int factorielle(int n)
    {
        if(n == 0 || n ==1)
            return 1;
        else 
            return n*factorielle(n-1);
    }

    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer un entier ?");

        System.out.println(factorielle(scan.nextInt()));
    }
}
/*le but ici est d'apprendre à utiliser le toString, les packages 
et appréhender la covariance */

import pack.*;

public class Compris{
    public static void main(String []args)
    {
        Sexe s = new Sexe("humain","femme");
        Humain h = new Humain("humain");
        System.out.println("1: " + s);
        System.out.println("2: " + h);
    }
}


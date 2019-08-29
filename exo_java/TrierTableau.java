import java.math.*;
import java.text.DecimalFormat;

public class TrierTableau{

    public static void main(String []args){

        DecimalFormat df = new DecimalFormat("0.0");
        double tab[] = new double[10];

        //création du tableau
        System.out.print("Tableau non trié:\n\n");
        for(int i = 0 ; i < tab.length ; i++) //tableau non ordonné.
        {
            tab[i] = Math.random()*(tab.length);
            System.out.println(" " + df.format(tab[i]));
        }
       
        //trions le tableaux dans l'ordre croissant
        double min = 0;
        for(int i = 0 ; i < tab.length ; i++)
        {
            for(int j = 0 ; j < tab.length ; j++)
            {
                /* pour trier dans l'ordre décroissant,
                on remplacera "<" par ">"*/

                if(tab[i] < tab[j]) 
                {
                    min = tab[j];
                    tab[j] = tab[i];
                    tab[i] = min;
                }
            }

        }

        System.out.println("\n");
        //affichage du tableau trié.
        System.out.print("Tableau trié:\n\n");
         for(int i = 0 ; i < tab.length ; i++) //tableau ordonné.
        {
            System.out.println(" " + df.format(tab[i]));
        }
    }

}
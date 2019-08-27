import java.util.Scanner;

public class UtilisationFor{

    static int nombre_Eleve(){

        Scanner scan = new Scanner(System.in);
        int nombre;

        System.out.println("Nombre d'élèves dans la classe ?");
        System.out.print("Votre réponse: ");
        nombre = scan.nextInt();

        System.out.print("\n\n");

        return nombre;

    }

    static void conclusion(int mineur, int majeur)
    {
        
        if( mineur < majeur )
            System.out.print("Il y a une majorité d'élèves majeurs.");
        else if( mineur == majeur )
            System.out.print("Il y a autant d'élèves mineurs que d'élèves majeurs.");
        else
            System.out.print("Il y a une majorité d'élèves mineurs.");

    }


    public static void main(String []args){

        int age, quantite, mineur = 0; 
        int majeur = 0;

        Scanner scan = new Scanner(System.in);
        quantite = nombre_Eleve();

        for( int i = 1 ; i <= quantite ; i++ )
        {

            System.out.print("âge de l'élève numéro " + i + " ? ");
            age = scan.nextInt();

            System.out.print("\n");

            if(age<18)
                mineur++;
            else 
                majeur++;
        }

        System.out.println("\nIl y a " + quantite + " élèves dans votre classe.");
        System.out.println("Dont " + mineur + " élèves mineurs et " + majeur + " élèves majeurs.");

        conclusion(mineur,majeur);

    }
}
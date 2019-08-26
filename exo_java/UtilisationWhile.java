//Ce programme a pour but de demander le prénom de l'utilisateur

import java.util.Scanner;

public class UtilisationWhile{

    static void question(char lettre){
        Scanner scan = new Scanner(System.in);
        String prenom;

        while(lettre =='o')
         {
            System.out.print("Comment t'appelles-tu ? ");
            prenom = scan.nextLine();
            System.out.println( "Bonjour " + prenom +" !\n");
        
            System.out.print( "Veux tu me présenter quelqu'un d'autre ou te représenter ? ('o' ou 'n')\nVotre réponse:");
            lettre = scan.nextLine().charAt(0);

            while( (lettre != 'o') && (lettre != 'n') )
            {
                System.out.print("\n");
                System.out.print("Je ne comprends pas votre réponse, Veux tu me présenter quelqu'un d'autre ou te représenter ? ('o' ou 'n')\nVotre réponse:");
                lettre = scan.nextLine().charAt(0);
            }
         }

        System.out.println("Au revoir !");

    }


    public static void main(String []args){
        char lettre = 'o'; /*on initialise notre charactère a la valeur voulu, c'est 
                            à dire 'o', pour rentrer dans la boucle "while" à notre
                            fonction suivante */

        question(lettre);

    }

}
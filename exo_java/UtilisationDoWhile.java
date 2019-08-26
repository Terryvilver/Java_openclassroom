//Ce programme a pour but de demander le prénom de l'utilisateur

import java.util.Scanner;

public class UtilisationDoWhile{

    static void question(char lettre){
        Scanner scan = new Scanner(System.in);
        String prenom;

        do
         {
            System.out.print("Comment t'appelles-tu ? ");
            prenom = scan.nextLine();
            System.out.println( "Bonjour " + prenom +" !");

            do
            {
                System.out.print("\n");
                System.out.print("Veux tu me présenter quelqu'un d'autre ou te représenter ? ('o' ou 'n')\nVotre réponse:");
                lettre = scan.nextLine().charAt(0);
            }while( (lettre != 'o') && (lettre != 'n') );
         }while(lettre =='o');

        System.out.print("Au revoir !");

    }


    public static void main(String []args){
        char lettre=' ';  // Nous n'avons pas besoin de initialiser le charactère "lettre" car on rentre au moins un fois dans nos boucles.

        question(lettre);

    }

}
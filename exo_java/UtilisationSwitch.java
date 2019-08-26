import java.util.Scanner;
import java.math.*;
import java.text.DecimalFormat;

/*Ici nous allons créer un menu ou l'on demandera à l'utilisateur 
de choisir son plat et la quantité
puis nous afficherons le prix de sa commande. */

public class UtilisationSwitch{

    static void menu(){
        int menu = 0;
        int nmbre;
        boolean servir = true;
        double total= 0;


        do
        {
            System.out.println("Que puis-je vous servir ?\n1.Hamburger.\n2.Pizza.\n3.Tacos.\n4.Poulet.\n");
            System.out.println("Le prix d'un hamburger est de 7,50 euros.");
            System.out.println("Le prix d'un pizza est de 8,00 euros.");
            System.out.println("Le prix d'un tacos est de 6,00 euros.");
            System.out.print("Le prix d'un sandwich est de 4,50 euros. \n\n");

            System.out.print("Votre réponse : ");

            Scanner scan = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("#.00");
            menu = scan.nextInt();


            switch(menu)
            {
                case 1:
                    System.out.println("Combien d'hamburgers voulez-vous ? ");
                    nmbre = quantite();
                    System.out.println("\nVous avez pris " + nmbre + " Hamburger. ");
                    total = total + (nmbre*7.50);
                    System.out.println("Votre addition est de " + df.format(total) +" euros.");
                    servir = autreChose();
                    break;

                case 2:
                    System.out.println("Combien de pizzas voulez-vous ? ");
                    nmbre = quantite();
                    System.out.println("\nVous avez pris " + nmbre + " pizzas.");
                    total = total + (nmbre*8.00);
                    System.out.println("Votre addition est de " + df.format(total) +" euros.");
                    servir = autreChose();
                    break;

                case 3:
                    System.out.println("Combien de tacos voulez-vous ? ");
                    nmbre = quantite();
                    System.out.println("\nVous avez pris " + nmbre + " tacos");
                    total = total + (nmbre*6.00);
                    System.out.println("Votre addition est de " + df.format(total) +" euros.");
                    servir = autreChose();
                    break;

                case 4:
                    System.out.println("Combien de poulets voulez-vous ? ");
                    nmbre = quantite();
                    System.out.println("\nVous avez pris " + nmbre + " poulets.");
                    total = total + (nmbre*4.50);
                    System.out.println("Votre addition est de " + df.format(total) +" euros.");
                    servir = autreChose();
                    break;

                default:
                    System.out.println("\nErreur !");
                    servir=true;
            }

        }while(servir);

        DecimalFormat df = new DecimalFormat("#.00");

    }

    static boolean autreChose(){

        Scanner scan = new Scanner(System.in);
        char lettre= ' ';

        do
        {
            System.out.print("Voulez-vous autre chose ? ('o' ou 'n') ");
            lettre = scan.nextLine().charAt(0);;

        }while( ( lettre != 'o') && ( lettre != 'n') );

        System.out.println("\n");

        if ( lettre == 'o')
            return true;

        return false;
    }

    static int quantite(){

        Scanner scan = new Scanner(System.in);
        int quantite = scan.nextInt();

        return quantite;

    }

   


    public static void main(String []args){

        menu();
        
    }

}
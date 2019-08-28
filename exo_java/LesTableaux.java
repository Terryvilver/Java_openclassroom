//Programme permettant de mieux appréhender les tableaux.
import java.util.Scanner;
import java.math.*;

public class LesTableaux{

    static void test0(int test[])
    {
        System.out.println("Affichage numéro 1 : " + test[1] + " .\n"); //Affichage d'un élément du tableau.
    }

    static void test1(int test[])
    {
        System.out.print("Affichage numéro 2 : ");
        for(int i = 0; i < test.length; i++)
        {
            System.out.print(test[i] + " " ); //Affichage de tous les éléments du tableau.
        }
        System.out.print(".");
    }

    static void test2(int test1[])
    {

        System.out.print("\n\nAffichage numéro 3 : ");
        for(int j = 0; j < test1.length; j++) //Remplissage du tableau de manière automatique.
        {
            if(j == 0)
            {
                test1[j] = 0; // j'attribue une valeur a la première case de mon tableau
                System.out.print( test1[j] ); 
            }
            else
            {
                test1[j] = test1[j-1] + 4; /*Puis dans les autres cas, je réutilise la valeur
                                            de la case précédente en y ajoutant 3 dans la case
                                            suivante.*/
                System.out.print( test1[j] );
            }

            System.out.print(" ");

        }

        System.out.print(".");

    }

    static int ask_number() //Demande un nombre à l'utilisateur.
    {

        Scanner scan = new Scanner(System.in);
        int nombre;

        do
        {
            System.out.println("Choississez un nombre entre 1 et 10 ?");
            System.out.print("Votre réponse : ");
            nombre = scan.nextInt();
        }while( (nombre <= 0) || (nombre > 10) );

        return nombre;

    }

    static int[] create_tab(int test3[]) //crée mon tableau avec des nombres aléatoires.
    {

        for(int i = 0; i < test3.length; i++)
        {
            test3[i] = (int)((Math.random())*((test3.length-1)+1)+1);
        }

        return test3;

    }

    static void test3(int test3[], int nombre) /*Fonction permettant de
                                                chercher si le nombre saisi
                                                par l'utilisateur est dans
                                                le tableau. */
    {

        int trouve = 0;

        for(int i = 0; i < test3.length; i++)
        {
            if(nombre == test3[i])
            {
                trouve++;
                System.out.println("Le nombre a été trouvé a la case " + (i+1) + " du tableau.");
            }
        }
        if( trouve == 0)
            System.out.println("Le nombre n'a pas été trouvé..") ;

        System.out.println("Le nombre a été trouvé " + trouve + " fois !");

    }

    public static void main(String []args){

        //Manipulons le 1er tableaux.
        int test[] = {2,4,6,8};

        test0(test);

        test1(test);
 
        //Manipulons un nouveau tableau.
        int test2[] = new int[4];
        test2[0] = 0;

        test2(test2);

        //Manipulons encore un tableau.
        System.out.println("\n\nAffichage numéro 3 : ");
        int test3[] = new int[10];
        int nombre = 0; //nombre que l'on recherche dans le tableau.
        boolean recommencer = true; //variable utilisé pour faire une nouvelle recherche.

        //variable permettant de continuer de chercher un nombre.
        Scanner scan = new Scanner(System.in);  
        char car = ' ';

        test3 = create_tab(test3);
        nombre = ask_number();
        test3(test3,nombre);
        do
        {
            do
            {
                System.out.println("Voulez-vous recommencer ?");
                System.out.print("Votre réponse : ");
                car = scan.nextLine().charAt(0);

                if(car == 'O')
                {
                    test3 = create_tab(test3);
                    nombre = ask_number();
                    test3(test3,nombre);
                    recommencer = true;
                }
                else if( car == 'N' )
                {
                    recommencer = false;
                    System.out.print("Au revoir.. ");
                }

            }while( (car != 'O') && (car != 'N') );
        
        }while(recommencer == true);

    }


}
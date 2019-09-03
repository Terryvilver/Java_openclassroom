//Mise en application du cours :
//https://openclassrooms.com/en/courses/26832-apprenez-a-programmer-en-java/21282-creez-votre-premiere-classe

import java.util.Scanner;

class Vehicule{
    private String marque;
    private String modele;
    private int annee; //année d'immatriculation

    /****** Constructeur *******/

    public Vehicule() //Constructeur sans paramètre
    {
        String marque = " ";
        String modele = " ";
        int annee = 0;
        System.out.println("création d'un véhicule sans paramètre.");
    }

    public Vehicule(String pMarque, String pModele, int pAnnee)
    {
        marque = pMarque;
        modele = pModele;
        annee = pAnnee;
        System.out.println("création de véhicule avec paramètre.");
    }
}

public class ApplicationClasse{

    public static void main(String []args){
        Vehicule v = new Vehicule();
        Vehicule v1 = new Vehicule("208","Peugeot", 2016); 
    }

}
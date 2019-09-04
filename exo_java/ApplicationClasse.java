//Mise en application du cours :
//https://openclassrooms.com/en/courses/26832-apprenez-a-programmer-en-java/21282-creez-votre-premiere-classe

import java.util.Scanner;

class Vehicule{
    private String marque;
    private String modele;
    private int annee; //année d'immatriculation
    private static int nbreVehicule = 0;

    /*********************** Constructeur ********************************/
    public Vehicule() //Constructeur sans paramètre
    {
        String marque = " ";
        String modele = " ";
        int annee = 0;
        System.out.println("création d'un véhicule sans paramètre.");
        nbreVehicule++;
    }

    public Vehicule(String pMarque, String pModele, int pAnnee)
    {
        marque = pMarque;
        modele = pModele;
        annee = pAnnee;
        System.out.println("création de véhicule avec paramètre.");
        nbreVehicule++;
    }
    /*************************** Accesseur **********************************/
    public String getMarque()
    {
        return marque;
    }

    public String getModele()
    {
        return modele;
    }

    public int getAnnee()
    {
        return annee;
    }

    public static int getnbreVehicule()
    {
        return nbreVehicule;
    }

    /*************************** Mutateur *********************************/
    public void setMarque(String pMarque)
    {
        marque = pMarque;
    }

    public void setModele(String pModele)
    {
        modele = pModele;
    }

    public void setAnnee(int pAnnee)
    {
        annee = pAnnee;
    }

    public String comparer(Vehicule v) //Compare les dates d'immatriculation des 2 Véhicules.
    {
        if(this.annee < v.getAnnee())
            return "Le véhicule de marque " +  this.marque + " est plus ancien que le véhicule de marque " + v.getMarque() + ".";
        else if(this.annee == v.getAnnee())
            return "Les 2 véhicules sont immatriculés la même année.";
        else
            return "Le véhicule de marque " + v.getMarque() + " est plus ancien que le véhicule de marque " + this.marque + ".";
    }

    public String description()
    {
        return "\n\tCe vehicule est de marque " + this.marque + " et de modèle " + this.modele + ", il a été immatriculé en " + this.annee +".";
    }

}

public class ApplicationClasse{

    public static void main(String []args){
        Scanner scan = new Scanner(System.in);

        //déclaration et initialisation des objets véhicule.
        Vehicule v1 = new Vehicule("Peugeot","208", 2019); 
        Vehicule v2 = new Vehicule("Dacia","Lodgy", 2019); 

        System.out.println(v1.description());
        System.out.println(v2.description());
        System.out.print("\n" + v1.comparer(v2) + "\n\n");
        System.out.println("Il y a " + v1.getnbreVehicule() + " véhicules dans votre garage.");


    }

}
//Mise en application du cours :
//https://openclassrooms.com/en/courses/26832-apprenez-a-programmer-en-java/21282-creez-votre-premiere-classe
import java.util.Scanner;
/********************* CLASSE VOITURE ***********************/
class Voiture extends Vehicule{
    protected String option;
    /************** CONSTRUCTEUR DERIVEE *****************/
    public Voiture(){
        super(); //appel le constructeur de la classe mère
        option = " ";
    }
    public Voiture(String pMarque, String pModele, int pAnnee, int pCv, String pOption){
        super(pMarque, pModele, pAnnee, pCv); //appel le constructeur avec parametre de la classe mère
        option = pOption;
    }
    /********** ACCESSEUR ***************/
    public String getOption()
    {
        return option;
    }

    /********************** MUTATEUR *****************/
    public void SetOption(String pOption)
    {
        option = pOption;
    }

    /************ METHODE D'INSTANCE DERIVEE *****************/
    public String toString()
    {
        return super.toString() + " En plus elle possède une " + this.option+".";
    }

}

/************************ CLASSE VEHICULE ******************/
class Vehicule{
    protected String marque;
    protected String modele;
    protected int annee; //année d'immatriculation
    protected static int nbreVehicule = 0;
    protected int cv = 0;
    protected char categorie;

    /*********************** Constructeur ********************************/
    public Vehicule() //Constructeur sans paramètre
    {
        String marque = " ";
        String modele = " ";
        int annee = 0;
        int cv = 0;
        this.setCategorie();
        System.out.println("création d'un véhicule sans paramètre.");
        nbreVehicule++;
    }

    public Vehicule(String pMarque, String pModele, int pAnnee, int pCv)
    {
        marque = pMarque;
        modele = pModele;
        annee = pAnnee;
        cv = pCv;
        this.setCategorie();
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

    public int getCv()
    {
        return cv;
    }

    public char getCategorie()
    {
        return categorie;
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

    public void setCv(int pCv)
    {
        cv = pCv;
        this.setCategorie();
    }

    private void setCategorie()
    {
        char tab_categorie[] = {'?','A','B','C','D','S'};
        int tab_cv[] = {0, 15, 30, 60, 100, 400};

        int i = 0;

        while( (i < tab_cv.length) && (this.cv >= tab_cv[i]) )
            i++;

        this.categorie = tab_categorie[i];
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

    public String toString()
    {
        return "\n Ce vehicule est de marque " + this.marque + ". \n De modèle " + this.modele + ". \n Il a été immatriculé en " + this.annee +". \n Possède "+this.cv+" chevaux et est de catégorie " + this.getCategorie()+".";
    }
}

public class ApplicationClasse{

    public static void main(String []args){
        Scanner scan = new Scanner(System.in);

        //déclaration et initialisation des objets véhicule.
        Vehicule tab[] = new Vehicule[4];

        String marqueTab[] = {"Peugeot", "Renault","Tesla","mitsubishi"};
        int cvTab[] = {15, 80, 200, 115};
        int anneeTab[] = { 2015, 2016, 2019, 2018};

        for(int i = 0; i < tab.length ; i++)
        {
            if(i < 2)
            {
                System.out.println("test"+i);
                Vehicule v = new Vehicule(marqueTab[i],"Peu importe",anneeTab[i], cvTab[i]);
                tab[i] = v;
                System.out.println("test"+i);
            }
            else
            {
                Voiture  vo = new Voiture(marqueTab[i],"Peu importe",anneeTab[i], cvTab[i],"option");
                tab[i] = vo;
                System.out.println("test"+i);
            }
        }

        
        for(Object obj : tab) //Covariance des variables appel de la bonne méthode toString en fonction de l'object Voiture ou Véhicule utilisé.
        {
            System.out.println(obj);
        }
    }
}
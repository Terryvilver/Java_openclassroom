import java.util.Scanner;


class Ville{
    private String nomVille;
    private String nomPays;
    private int nbreHabitants;
    private char categorie;
    private static int nbreInstance = 0;

    /************ CONSTRUCTEUR ***************/
    public Ville(){
        System.out.println("création d'une ville");
        nomVille = "Inconnu";
        nomPays = "Inconnu";
        nbreHabitants = 0;
        this.setCategorie();
        nbreInstance++;
    }

    public Ville(String NomVille, String NomPays , int NbreHabitants){
        System.out.println("création d'une ville avec paramètre");
        this.nomVille = NomVille;
        this.nomPays = NomPays;
        this.nbreHabitants = NbreHabitants;
        this.setCategorie();
        nbreInstance++;
    }

    /************ ACCESSEUR ***************/
    public String getNomVille()
    {
        return nomVille;
    }
    public String getNomPays()
    {
        return nomPays;
    }
    public int getNombreHabitants()
    {
        return nbreHabitants;
    }
    public char getCategorie()
    {
        return categorie;
    }
    public static int getnbreInstance()
    {
        return nbreInstance;
    }

    /************ MUTATEUR ***************/
    public void setNomVille(String NomVille)
    {
        this.nomVille = NomVille;
    }
    public void setNomPays(String NomPays)
    {
        this.nomPays = NomPays;
    }
    public void setNombreHabitants(int NombreHabitants)
    {
        this.nbreHabitants = NombreHabitants;
        this.setCategorie();
    }
    private void setCategorie()
    {
        int habitants[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
        char categorie_tab[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

        int i = 0;

        while( i < habitants.length && this.getNombreHabitants() > habitants[i])
            i++;

        this.categorie = categorie_tab[i];
    }


    /************ Methode d'instance ***************/
    public String comparer(Ville v)
    {
        if(this.getNombreHabitants() > v.getNombreHabitants())
            return this.getNomVille()+" est plus peuplé que "+v.getNomVille();
        else
            return v.getNomVille()+" est plus peuplé que "+this.getNomVille();
    }

    public String toString()
    {
        return "\t"+this.nomVille+" est une ville de "+this.nomPays+", elle comporte : "+this.nbreHabitants+" habitant(s) => elle est donc de catégorie :"+this.categorie;
    }

}


public class UneClasse{

    public static void main(String []args)
    {
        Ville v1 = new Ville("Paris", "France", 15000);
        System.out.println(v1);
    }

}
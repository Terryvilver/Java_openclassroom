class Guepard extends Felin{

    /* Constructeur */
    Guepard()
    {

    }

    Guepard(String pCouleur, int pPoids)
    {
        this.couleur = pCouleur;
        this.poids = pPoids;
    }

    public void crier()
    {
        System.out.println("Le guepard rugit");
    }
}
class Chien extends Canin{

    /* Constructeur */
    Chien()
    {

    }

    Chien(String pCouleur, int pPoids)
    {
        this.couleur = pCouleur;
        this.poids = pPoids;
    }

    public void crier()
    {
        System.out.println("Le chien aboie pour rien");
    }
}

abstract class Canin extends Animal{
    void deplacement()
    {
        System.out.println(this.getClass() + " se déplace en solitaire.");
    }
}

abstract class Felin extends Animal{
    void deplacement()
    {
        System.out.println(this.getClass() + " se déplace en meute.");
    }
}

abstract class Animal
{
    /* VARIABLE D'INSTANCE */
    protected String couleur;
    protected int poids;
    abstract void crier();
    abstract void deplacement();

    /* CONSTRUCTEUR */
    Animal()
    {
        couleur = " ";
        poids = 0;
    }

    Animal(String pCouleur, int pPoids)
    {
        couleur = pCouleur;
        poids = pPoids;
    }

    /* METHODE D'INSTANCE */
    protected void manger()
    {
        System.out.println(this.getClass() + " mange de la viande.");
    }

    protected void boire()
    {
        System.out.println(this.getClass() + " bois de l'eau.");
    }

    public String toString()
    {
        return "Cette animal est un " + this.getClass() + ". Il est de couleur " + this.couleur +" et fait " + this.poids + " Kg.";
    }

}


public class AbstraitMain{

    public static void main(String []args)
    {
        Animal chien = new Chien("bleu",30);
        Animal guepard = new Guepard("orange",60);
        System.out.println(chien);
        System.out.println(guepard);
    }
}
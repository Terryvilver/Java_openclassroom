package pack;

public class Humain{
    /* variable d'instance */
    protected String texte;

    /*constructeur */
    public Humain()
    {
        texte = "none";
    }

    public Humain(String pTexte)
    {
        texte = pTexte;
    }

    /*Accesseur */
    public String getTexte()
    {
        return texte;
    }

    /*Mutateur */
    public void setTexte(String pTexte)
    {
        texte = pTexte;
    }

    /*Methode d'instance */
    public String toString()
    {
        return "je suis " + texte + ".";
    }
}
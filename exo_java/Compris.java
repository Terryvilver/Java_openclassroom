class Sexe extends Humain{
    /*Variable d'instance */
    private String sexe;

    /*Constructeur */
    Sexe()
    {
        super();
        sexe ="none";
    }

    Sexe(String pHumain, String pSexe)
    {
        super(pHumain);
        sexe = pSexe;
    }

    /*Accesseur */
    public String getSexe()
    {
        return sexe;
    }

    /*Mutateur */
    public void setSexe(String pSexe)
    {
        sexe = pSexe;
    }

    public String toString()
    {  
        if(sexe == "fille" || sexe == "femme")
            return super.toString() + " et je suis une " + sexe + ".";
        else
            return super.toString() + " et je suis un " + sexe + ".";
    }

}

class Humain{
    /* variable d'instance */
    protected String texte;

    /*constructeur */
    Humain()
    {
        texte = "none";
    }

    Humain(String pTexte)
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
        return "je suis un " + texte + ".";
    }
}

public class Compris{
    public static void main(String []args)
    {
        Sexe s = new Sexe("humain","femme");
        Humain h = new Humain("humain");
        System.out.println("1: " + s);
        System.out.println("2: " + h);
    }
}


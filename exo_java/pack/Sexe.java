package pack;

public class Sexe extends Humain{
    /*Variable d'instance */
    private String sexe;

    /*Constructeur */
    public Sexe()
    {
        super();
        sexe ="none";
    }

    public Sexe(String pHumain, String pSexe)
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
            return super.toString() + " Je suis une " + sexe + ".";
        else
            return super.toString() + " Je suis un " + sexe + ".";
    }

}
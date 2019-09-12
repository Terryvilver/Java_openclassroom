/* Création d'un programme chargé de calculer la moyenne d'un étudiant en fonction de sa spécialité.*/

import java.text.DecimalFormat;

class SpePhilo extends Etudiant
{
    /* CONSTRUCTEUR */
    SpePhilo()
    {

    }

    SpePhilo(String pPrenom, double pNoteFrancais, double pNoteMath, double pNotePhilo)
    {
        this.prenom = pPrenom;
        this.noteFrancais = pNoteFrancais;
        this.noteMath = pNoteMath;
        this.notePhilo = pNotePhilo;
    }

    /* ACCESSEUR */
    String getPrenom()
    {
        return this.prenom;
    }

    double getNoteFrancais()
    {
        return this.noteFrancais;
    }

    double getNoteMath()
    {
        return this.noteMath;
    }

    double getNotePhilo()
    {
        return this.notePhilo;
    }


    /* METHODE D'INSTANCE */
     double calcul() //methode calculant la moyenne de l'étudiant
    {
        return (this.notePhilo*20+this.noteMath*5+this.noteFrancais*5)/30;
    }

    String moyenne()
    {
        DecimalFormat df = new DecimalFormat("0.##");
        double moyenne = calcul();

        if(moyenne >= 10)
            return df.format(moyenne) + "! Votre année est validée !";
        else
            return df.format(moyenne) + "! Votre année n'est pas validée !";
    }

}

class SpeMath extends Etudiant
{
    /* CONSTRUCTEUR */
    SpeMath()
    {

    }

    SpeMath(String pPrenom, double pNoteFrancais, double pNoteMath, double pNotePhilo)
    {
        this.prenom = pPrenom;
        this.noteFrancais = pNoteFrancais;
        this.noteMath = pNoteMath;
        this.notePhilo = pNotePhilo;
    }

    /* ACCESSEUR */
    String getPrenom()
    {
        return this.prenom;
    }

    double getNoteFrancais()
    {
        return this.noteFrancais;
    }

    double getNoteMath()
    {
        return this.noteMath;
    }

    double getNotePhilo()
    {
        return this.notePhilo;
    }


    /* METHODE D'INSTANCE */
     double calcul() //methode calculant la moyenne de l'étudiant
    {
        return (this.notePhilo*5+this.noteMath*20+this.noteFrancais*5)/30;
    }

    String moyenne()
    {
        DecimalFormat df = new DecimalFormat("0.##");
        double moyenne = calcul();

        if(moyenne >= 10)
            return df.format(moyenne) + "! Votre année est validée !";
        else
            return df.format(moyenne) + "! Votre année n'est pas validée !";
    }

}

class SpeFrancais extends Etudiant implements EtudiantHeureux
{
    /* CONSTRUCTEUR */
    SpeFrancais()
    {

    }

    SpeFrancais(String pPrenom, double pNoteFrancais, double pNoteMath, double pNotePhilo)
    {
        this.prenom = pPrenom;
        this.noteFrancais = pNoteFrancais;
        this.noteMath = pNoteMath;
        this.notePhilo = pNotePhilo;
    }

    /* ACCESSEUR */
    String getPrenom()
    {
        return this.prenom;
    }

    double getNoteFrancais()
    {
        return this.noteFrancais;
    }

    double getNoteMath()
    {
        return this.noteMath;
    }

    double getNotePhilo()
    {
        return this.notePhilo;
    }

   

    /* METHODE D'INSTANCE */
     double calcul() //methode calculant la moyenne de l'étudiant
    {
        return (this.notePhilo*5+this.noteMath*5+this.noteFrancais*20)/30;
    }

    String moyenne()
    {
        DecimalFormat df = new DecimalFormat("0.##");
        double moyenne = calcul();

        if(moyenne >= 10)
            return df.format(moyenne) + "! Votre année est validée !";
        else
            return df.format(moyenne) + "! Votre année n'est pas validée !";
    }

    public void frimer()
    {
        System.out.println(this.prenom + " frime devant ces camarades.");
    }

    public void crier()
    {
        System.out.println(this.prenom + " crie de joie.");
    }

}

abstract class Etudiant
{
    /* VARIABLE D'INSTANCE */
    protected String prenom;
    protected double noteFrancais;
    protected double noteMath;
    protected double notePhilo;

    /* METHODE D'INSTANCE */
    abstract double calcul();
    abstract String moyenne();

    public String toString()
    {
        return "Prenom : " + this.prenom + "\n" + "Note en Francais : " + this.noteFrancais + "\n" + "Note en Math : " + this.noteMath + "\n" + "Note en Philosophie : " + this.notePhilo + "\n" + "Votre moyenne est de "+ this.moyenne() + "\n";
    }

    public void aSavoir() // Methode donnant des informations sur le calcul de la moyenne
    {
        System.out.print("Le coefficient en math, philo et français dépends de la spécialisation. Un étudiant en spécialisation Math par exemple aura un coefficient 20 en math, et un coefficient de 5 dans les autres matières. \n\n");
    }

     /* MUTATEUR */
    void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }

    void setNoteFrancais(double noteFrancais)
    {
        this.noteFrancais = noteFrancais;
    }

    void setNoteMath(double noteMath)
    {
        this.noteMath = noteMath;
    }

    void setNotePhilo(double notePhilo)
    {
        this.notePhilo = notePhilo;
    }
}

interface EtudiantHeureux{
    public void frimer();
    public void crier();
}
public class ApplicationAbstrait{
    public static void main(String []args){

        SpeFrancais e2 = new SpeFrancais("Marie", 8, 7, 17);
        e2.setNoteFrancais(15);
        System.out.println(e2);
        e2.frimer();
        e2.crier();


    }
}
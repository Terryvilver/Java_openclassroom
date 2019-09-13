interface MechantLoup extends PetiteFille
{
    public static void affamer()
    {
        PetiteFille.promenade();
        System.out.println("Le méchant loup veut la dévorer.\n");
    }

}

interface Grandmere extends PetiteFille
{
    public static void regarde()
    {
        PetiteFille.promenade();
        System.out.println("La grand mère regarde la petite fille se promener.\n");
    }
}

interface PetiteFille
{
    public static void promenade()
    {
        System.out.println("La petite fille se promène.");
    }
}

public class ChaperonRouge{
    public static void main(String []args){
        PetiteFille.promenade();
        System.out.print("\n");

        Grandmere.regarde();
        
        MechantLoup.affamer();
    }
}
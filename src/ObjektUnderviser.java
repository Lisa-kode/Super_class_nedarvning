public class ObjektUnderviser extends Medarbejdere {
    //Dette er en SUB CLASS, som nedarver fra 'Medarbejdere'-klassen, den har derved adgang til alle variabler derfra.
    //Denne klasse indeholder også særegne egenskaber og metoder for et specifikt objekt


    //Egenskab
    String fag;
    boolean pædagogisk;


    //Metoder

    public void undervise(){
        if (pædagogisk)
            System.out.println("læren únderviser pædagogisk");
        else
            System.out.println("læren er uprofessionel");
    }

}

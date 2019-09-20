public class ObjektUnderviser extends Medarbejdere {

    //Dette er en SUB CLASS, den indeholder særegne egenskaber og meetoder for et specifikt objekt

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

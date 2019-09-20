public class ObjektUnderviser extends Medarbejdere {

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

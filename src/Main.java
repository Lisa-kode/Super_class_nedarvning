public class Main {

    public static void main(String[] args) {

        //Instanserer objekt som er en underviser
        ObjektUnderviser underviser1 = new ObjektUnderviser();

        underviser1.fag = "cooking";      //Kald af særegn metode for objektets egen klasse, 'sub class'
        underviser1.adresse = "Slagelse"; //Kald fra 'super class'
        underviser1.cpr = 150248-1113;    //Kald fra 'super class'
        underviser1.undervise();          //Kald af særegn metode for objektets egen klasse, 'sub class'

        //Instanserer objekt som er en underviser
        ObjektUnderviser underviser2 = new ObjektUnderviser();

        underviser2.fag = "english";        //Kald af særegn metode for objektets egen klasse, 'sub class'
        underviser2.adresse = "København";  //Kald fra 'super class'
        underviser2.cpr = 010689-6822;      //Kald fra 'super class'
        underviser2.undervise();            //Kald af særegn metode for objektets egen klasse, 'sub class'


    }
}

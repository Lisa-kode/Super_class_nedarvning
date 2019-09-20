public class Main {

    public static void main(String[] args) {

        //Instanserer objekt som er en underviser
        ObjektUnderviser underviser1 = new ObjektUnderviser();

        underviser1.navn = "Anders";
        underviser1.adresse = "Slagelse"; //Kald fra 'super class'
        underviser1.alder = 62;           //Kald fra 'super class'
        underviser1.fag = "cooking";      //Kald af særegn egenskab for objektets egen klasse, 'sub class'
        underviser1.undervise();          //Kald af særegn metode for objektets egen klasse, 'sub class'

        //Instanserer objekt som er en underviser
        ObjektUnderviser underviser2 = new ObjektUnderviser();

        underviser2.navn = "Merethe";       //Kald fra 'super class'
        underviser2.adresse = "København";  //Kald fra 'super class'
        underviser2.alder = 33;             //Kald fra 'super class'
        underviser2.fag = "english";        //Kald af særegn egenskab for objektets egen klasse, 'sub class'
        underviser2.undervise();            //Kald af særegn metode for objektets egen klasse, 'sub class'

        //Instanserer objekt som er en administrator
        ObejktAdministrator administrator1 = new ObejktAdministrator();

        administrator1.navn = "Peter";      //Kald fra 'super class'
        administrator1.adresse = "Næstved"; //Kald fra 'super class'
        administrator1.alder = 42;          //Kald fra 'super class'
        administrator1.afdeling = "økonomi";//Kald af særegn egenskab for objektets egen klasse, 'sub class'
        administrator1.niveau = 3;          //Kald af særegn egenskab for objektets egen klasse, 'sub class'

        //Instanserer objekt som er en administrator
        ObejktAdministrator administrator2 = new ObejktAdministrator();

        administrator2.navn = "Ingeborg";   //Kald fra 'super class'
        administrator2.adresse = "Haslev";  //Kald fra 'super class'
        administrator2.alder = 68;          //Kald fra 'super class'
        administrator2.afdeling = "it";     //Kald af særegn egenskab for objektets egen klasse, 'sub class'
        administrator2.niveau = 100;        //Kald af særegn egenskab for objektets egen klasse, 'sub class'






    }
}

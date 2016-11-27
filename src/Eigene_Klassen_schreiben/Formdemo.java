package Eigene_Klassen_schreiben;

/**
 * Created by Johannes Brüß on 28.08.2016.
 */
public class Formdemo {
    public static void main( String args[] )
    {
        Rechteck re = new Rechteck(0,0,4,5);
        Kreis kr = new Kreis( 0,0,5);
        FormContainer cont = new FormContainer();

        System.out.println(kr);
        System.out.println(re);

        cont.add(kr);
        cont.add(re);

        System.out.println("\nDie Summe aller Flaechen betraegt: " + cont.gesamtFläche());
    }
}

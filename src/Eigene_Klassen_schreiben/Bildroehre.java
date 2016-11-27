package Eigene_Klassen_schreiben;

/**
 * Created by Johannes Brüß on 03.09.2014.
 */
public class Bildroehre extends Konsumgeraet {

    public Bildroehre(String Geraetname)
    {
        super(Geraetname);
    }

    static boolean eingeschaltet;

    static public Fernseher fernseher;

    static {
        if (Fernseher.eingeschaltet==true) {
            an();
            System.out.println("Bildröhre ist eingeschaltet");
            System.exit(0);
        }
    }
}

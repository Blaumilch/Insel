package Eigene_Klassen_schreiben;

/**
 * Created by Johannes Brüß on 13.08.2016.
 */
public class Feuermelder extends Konsumgeraet {
    public Feuermelder (String Geraetname) {
        super(Geraetname);
    }

    public static void aus() {
        Feuermelder.aus();
    }
}

package Eigene_Klassen_schreiben;
import java.util.*;
import java.util.Comparator;


/**
 * Created by Johannes Brüß on 24.08.2014.
 */
public class Haus {

    private static ArrayList<Konsumgeraet> konsumgeraete = new ArrayList<Konsumgeraet>();

    public static void main( String args[] )
    {
        Radio schlafzimmerradio = new Radio("schlafzimmerradio");
        Radio wohnzimmerradio = new Radio("wohnzimmerradio");
        Fernseher bügeltv = new Fernseher("bügeltv");
        Radio kloRadio = new Radio("kloRadio");
        Feuermelder alarm = new Feuermelder("alarm");
        Haus h = new Haus();
        h.add( schlafzimmerradio );
        h.add( wohnzimmerradio );
        h.add( bügeltv );
        h.add( kloRadio );
        h.add( alarm );
        h.urlaub();
    }

    public void add(Konsumgeraet konsumgeraet)  {
        konsumgeraete.add(konsumgeraet);
    }

    public void anzahlKonsumgeraete()   {
        int geraeteanzahl;
        geraeteanzahl=konsumgeraete.size();
        System.out.println(Integer.toString(geraeteanzahl));
    }

    public static void urlaub()    {
        for (Konsumgeraet k:konsumgeraete) {
            k.aus();
        }
    }

    private int qm;

    public void setSize (int size)  {
        this.qm=size;
    }

    public int getSize()    {
        return qm;
    }
    }



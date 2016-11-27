package Eigene_Klassen_schreiben;

/**
 * Created by Johannes Brüß on 06.09.2014.
 */
public class Konsumgeraet {
    public String Geraetname;
    public static boolean eingeschaltet;
    public int lautstaerke;
    public String Radiosender;
    public double Radiofrequenz;

    public void setName(String name)    {
        Geraetname=name;
    }

    public static void aus()   {
        eingeschaltet=false;
    }

    static public void an()    {
        eingeschaltet=true;
    }

    public Konsumgeraet(String Geraetname)
    {this.Geraetname=Geraetname;}

    public void setRadiosender(String Sender)   {
        Radiosender=Sender;
    }

    public void setRadiofrequenz(Double Frequenz)   {
        Radiofrequenz=Frequenz;
    }
}

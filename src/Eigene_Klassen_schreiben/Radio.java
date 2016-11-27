package Eigene_Klassen_schreiben;

/**
 * Created by Johannes Brüß on 24.08.2014.
 */
public class Radio extends Konsumgeraet {

    public Radio() {
        this(STANDARDFREQUENZ);
    }

    public Radio(double radiofrequenz) {
        super("");
        setRadiofrequenz(radiofrequenz);
    }

    public Radio(String Geraetname)   {
        super(Geraetname);
    }

    /*public Radio(String Radiosender)    {
        super(Radiosender);
        if (Radio.toFreq(Radiosender)==radiofrequenz)
        setRadiosender(Radiosender);
    }*/

    public Radio(String Radiosender, int band)    {
        super(Radiosender);
        if (Radio.toFreq(Radiosender)==radiofrequenz)
            setRadiosender(Radiosender);
        this.band=band;
    }

    public static final int FM=1;
    public static final int AM=2;
    public static final double STANDARDFREQUENZ=87;

    static double radiofrequenz;
    static String Radiosender;
    static double[] frequenzliste={88.00, 89.00, 90.00, 91.00};
    static String[] senderliste={"FFH", "FFM", "FFG", "FFF"};
    private int band;

    void lauter()
    {
        lautstaerke += 1;
    }

    void leiser()
    {
        lautstaerke -= 1;
    }

    boolean istAn()
    {
        boolean Zustand;
        String An;
        if (eingeschaltet=true && lautstaerke >0 && lautstaerke<=100)
            Zustand=true;
        else
            Zustand=false;
        return Zustand;
    }

    boolean istAus()
    {
        boolean zustand;
        if (eingeschaltet=true)
            zustand=false;
        else if (eingeschaltet=false)
            System.out.println("Radio ist ausgeschaltet");
            zustand=true;
        return zustand;
    }

    void wähleSender(double frequenz)
    {
        radiofrequenz=frequenz;
    }

    public String toString()
    {
        String Radio;
        if (istAn()==false)
            Radio="Radio aus";
        else
            Radio ="Radio an:" + " Freq=" + radiofrequenz + ", Laut=" + lautstaerke + ", Band=" + band;
    return Radio;
    }

    static void neuerSender(String Sender, double frequenz)
    {
        Radiosender=Sender;
        radiofrequenz=frequenz;
    }

    static double toFreq(String Sendername)   {
        if (!Sendername.equals(Radiosender))
            System.out.printf("Radiosender nicht gefunden: ");
        return radiofrequenz;
    }

    static String toFreq(double radiofrequenz)  {
        String frequenzradio=Double.toString(radiofrequenz);
        String Error="radiofrequenz " + radiofrequenz + "nicht gefunden";
        for (int i=0; i<=frequenzliste.length; i++)
            if (radiofrequenz==frequenzliste[i])
                return senderliste[i];
            else return Error;
        return frequenzradio;
    }

    void setzeBand(int band)
    {
        if ((band==FM) || (band==AM))
            this.band=band;
        else
            System.out.println("Falsches Band !");
    }

    private void initialize(String Radiosender)
    {
        setRadiosender(Radiosender);
    }

}

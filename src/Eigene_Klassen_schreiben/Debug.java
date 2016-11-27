package Eigene_Klassen_schreiben;

/**
 * Created by Johannes Brüß on 26.08.2014.
 */
public class Debug {
    static boolean eingeschaltet;
    String name;

    static void out(String Debugger)
    {
        if (eingeschaltet==true)
        System.out.println(Debugger + " wird debuggt");
    }

    static void einschalten()
    {
        eingeschaltet=true;
    }

    static void ausschalten()
    {
        eingeschaltet=false;
    }
}

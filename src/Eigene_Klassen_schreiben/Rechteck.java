package Eigene_Klassen_schreiben;
import java.util.Objects;

/**
 * Created by Johannes Brüß on 28.08.2016.
 */
public class Rechteck extends Form{
    double breite, höhe;

    public Rechteck(double x, double y, double breite, double höhe)
    {
        setX(x);
        setY(y);
        setBreite(breite);
        setHöhe(höhe);
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public void setHöhe(double höhe)
    {
        this.höhe = höhe;
    }

    public void setBreite(double breite)
    {
        this.breite = breite;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public double getHöhe()
    {
        return höhe;
    }

    public double getBreite()
    {
        return breite;
    }

    @Override
    public double fläche()  {
        return höhe*breite;
    }

    @Override
    public String toString()
    {
        return "Rechteck(x = " + x + ",y = " + y + "), Breite = " + breite + ", Hoehe = " + höhe + ",  Flaeche = " + fläche() + "!";
    }
}

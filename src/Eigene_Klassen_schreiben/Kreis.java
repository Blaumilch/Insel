package Eigene_Klassen_schreiben;

/**
 * Created by Johannes Brüß on 28.08.2016.
 */
public class Kreis extends Form
{
    protected double radius;

    public Kreis( double x, double y, double radius )
    {
        setX( x );
        setY( y );
        setRadius( radius );
    }

    public void setX( double x )
    {
        this.x = x;
    }

    public void setY( double y )
    {
        this.x = y;
    }

    public void setRadius( double radius )
    {
        this.radius = radius;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return x;
    }

    public double getRadius()
    {
        return radius;
    }

    @Override
    public double fläche()
    {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString()
    {
        return "Kreis(x = " + x + ",y = " + y +
                "), Radius r = " + radius +
                ", Flaeche = " + fläche() + "!";
    }
}
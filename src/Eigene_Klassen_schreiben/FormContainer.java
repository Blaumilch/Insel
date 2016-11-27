package Eigene_Klassen_schreiben;

/**
 * Created by Johannes Brüß on 28.08.2016.
 */
public class FormContainer {
    private static final int MAX = 10;

    private Form fc[] = new Form[MAX];
    private int count;

    public void add( Form f )
    {
        if ( count < fc.length )
            fc[ count++ ] = f;
        else
            System.out.println( "ArrayIndexOutOfBounds!" );
    }

    public double gesamtFläche()
    {
        double summe = 0;

        for ( int i = 0; i < count; i++ )
            summe += fc[ i ].fläche();

        return summe;
    }
}

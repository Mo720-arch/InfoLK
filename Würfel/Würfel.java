
/**
 * Beschreiben Sie hier die Klasse Würfel.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Würfel
{
    int augenzahl;
    int seiten;

    Würfel(int s){
        
        augenzahl = new java.util.Random().nextInt(s) + 1;
        seiten = s;
    }
    
    public wurf(){
        augenzahl = new java.util.Random().nextInt(seiten) + 1;
    }
}
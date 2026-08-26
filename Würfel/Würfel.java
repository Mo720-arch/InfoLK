
/**
 * Beschreiben Sie hier die Klasse Würfel.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Würfel
{
    int augenzahl;
    Würfel(){
        
        augenzahl = new java.util.Random().nextInt(6) + 1;
    }
    
    public int wurf(){
        augenzahl = new java.util.Random().nextInt(6) + 1;
        return augenzahl;
    }
}
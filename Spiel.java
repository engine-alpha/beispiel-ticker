import ea.*;

/**
 * Diese Klasse demonstriert anhand eines Textes und durch das Implementieren des Interfaces Ticker (!!), wie 
 * man einen kleinen Sekundenzaehler machen koennnte.
 * 
 * @version 2.0
 * @author  Michael Andonie
 */
public class Spiel
extends Game 
implements Ticker { //Implementieren des Ticker-Interface !! !!
    
    /**
     * Ein Rundenzaehler
     */
    private int runde;
    
    /**
     * Der Display-Text.
     */
    private Text text;
    
    /**
     * Konstruktor-Methode.<br />
     * Hierin wird der Display-Text erstellt und diese Klasse als Ticker angemeldet.
     */
    public Spiel() {
        super(500, 400, "Ticker-Beispiel");
        runde = 0;
        //Text erstellen
        text = new Text(runde + " Sekunden", 100, 200);
        //Text sichtbar machen
        wurzel.add(text);
        
        //Diese Klasse als Ticker am manager anmelden
        //Anzumeldender Ticker: this
        //Aufrufintervall (in ms): 1000 Millisekunden = 1 Sekunde
        manager.anmelden(this, 1000);
    }
    
    /**
     * Dies ist die Tick-Methode.<br />
     * Diese wird immer in dem festen, bestimmten Intervall aufgerufen, sollte diese 
     * Klasse als Ticker am <code>manager</code> angemeldet worden sein.
     */
    @Override
    public void tick() {
        //Rundenzaehler raufzaehlen
        runde = runde+1;
        //Text aktualisieren
        text.inhaltSetzen(runde + " Sekunden");
    }
    
    /**
     * Diese Tick-Reagieren-Methode wird nicht benutzt.
     * @param   tastencode  Der Code der heruntergedrueckten Taste.
     */
    @Override
    public void tasteReagieren(int tastencode) {
        //NICHT BENUTZT
    }
}
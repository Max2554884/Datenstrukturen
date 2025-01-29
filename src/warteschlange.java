public class warteschlange {
      // Gib den ersten Kunden in der Warteschlange an
    private Knoten  erster;

    // Konstruktor
    public warteschlange() {
        erster = null;
    }

    // Rückgabe des ersten Kunden
    public Knoten getErsten() {
        return erster;
    }

    // Setzen des ersten Kunden
    public void setErsten(Knoten pKnoten) {
        erster = pKnoten;
    }

    // Hinzufügen eines Kunden am Ende der Warteschlange
    public void einfuegen(Knoten pKnoten) {
        if (erster == null) {
            // Wenn die Warteschlange leer ist, wird der Kunde der erste
            erster = pKnoten;
        } else {
            // Sonst zum letzten Kunden führenund den neuen anhängen
           Knoten aktueller = erster;

            while (aktueller.getNachfolger() != null) {  // Schleife läuft so lange, wie es einen Nachfolger gibt
                aktueller = aktueller.getNachfolger(); // Nachfolger wird zu aktueller
            }
            aktueller.setNachfolger(pKnoten); // Mit aktueller.setNachfolger(pKunde) wird der neue Kunde (pKunde) als Nachfolger des letzten Kunden gesetzt.
        }
    }

    // Entfernen des ersten Kunden aus der Warteschlange
    public void entfernen() {
        if (erster != null) {
            // Der Nachfolger des ersten Kunden wird der neue erste
            erster = erster.getNachfolger();
        }
    }

    // Überprüfen, ob die Warteschlange leer ist
    public boolean gibLeer() {
        return erster == null;
    }
}
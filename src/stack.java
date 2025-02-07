public class stack <E>
{
  public E getContent(){

      return null;
}
    public void einfuegen(E pInhalt) {
        Knoten hilfe = new Knoten(pInhalt);
        if (first == null) {
            // Wenn die Warteschlange leer ist, wird der Kunde der erste
            first = hilfe;
        } else {
            // Sonst zum letzten Kunden führen und den neuen anhängen
            Knoten aktueller = first;

            while (aktueller.getNachfolger() != null) {  // Schleife läuft so lange, wie es einen Nachfolger gibt
                aktueller = aktueller.getNachfolger(); // Nachfolger wird zu aktueller
            }
            aktueller.setNachfolger(hilfe); // Mit aktueller.setNachfolger(pKunde) wird der neue Kunde (pKunde) als Nachfolger des letzten Kunden gesetzt.
        }
    }

public void remove(){

}
public boolean isEmpty (){
    return false;
}
}
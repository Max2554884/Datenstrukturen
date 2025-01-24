 public class Kunde {
    private String name;       // Name des Kunden
    private Kunde nachfolger;  // nächster Kunden
    private Kunde letzter;
    // Standardkonstruktor
    public Kunde(String pName) {
        name = "";
        nachfolger = null;
        letzter = null;
    }

    //


    // Setzen des Nachfolgers
    public void setNachfolger(Kunde pKunde) {
        nachfolger = pKunde;
    }

    // Rückgabe des Nachfolgers
    public Kunde getNachfolger() {
        return nachfolger;
    }

    // Setzen des Namens
    public void setName(String pName) {
        name = pName;
    }

    // Rückgabe des Namens
    public String getName() {
        return name;
    }
}


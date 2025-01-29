 public class Kunde {
    private String name;       // Name des Kunden
    private Kunde nachfolger;  // nächster Kunden
    private Kunde letzter;
    // Standardkonstruktor
    public Kunde(String pName) {
        name = pName;
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


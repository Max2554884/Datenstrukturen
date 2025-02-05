public class List <ContentType>
     {


        public Node first;

        public Node last;

        public Node current;



        public List(){
         first = null;
                 current = null;
                 last = null;

    }
    public void append(ContentType pC)
    {
       Node hilfe = new Node(pC);
        if (first == null) {
            // Wenn die Warteschlange leer ist, wird der Kunde der erste
            first = (Node) hilfe;
        } else {
            // Sonst zum letzten Kunden führen und den neuen anhängen
            Node aktueller = first;

            while (aktueller.getNachfolger() != null) {  // Schleife läuft so lange, wie es einen Nachfolger gibt
                aktueller = aktueller.getNachfolger(); // Nachfolger wird zu aktueller
            }
            aktueller.setNachfolger(hilfe); // Mit aktueller.setNachfolger(pKunde) wird der neue Kunde (pKunde) als Nachfolger des letzten Kunden gesetzt.
        }
    }
    }
    public void next(){

    }
    public void insert(ContentType pC){

    }
    public void toFirst(){
      if (erster != null){
      erster = hilfe
      } else if (erster = null) {

      }
    }
    public void toLast(){

    }
    public void remove(){

    }
      public boolean hasAccess (){

    }
      public ContentType getContent(){

    }
      public void setContent(ContentType pC){

      }
}

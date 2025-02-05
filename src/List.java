public class List <ContentType>
     {


        public ContentType First;

        public ContentType last;

        public ContentType current;

        private Node erster;

        public List(){


    }
    public void append(ContentType pC)
    {
       Node hilfe = new Node(pC);
        if (erster == null) {
            // Wenn die Warteschlange leer ist, wird der Kunde der erste
            erster = (Node) hilfe;
        } else {
            // Sonst zum letzten Kunden führen und den neuen anhängen
            Node aktueller = erster;

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

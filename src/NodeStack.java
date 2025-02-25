public class NodeStack<T> {
    private T content;  // Der Inhalt des Knotens
    private NodeStack<T> nextKnoten;  // Verweis auf den nächsten Knoten

    // Konstruktor, um den Inhalt des Knotens zu setzen
    public NodeStack(T pContent) {
        this.content = pContent;
        this.nextNode = null;  // Der nächste Knoten ist zu Beginn null
    }

    // Getter für den Inhalt des Knotens
    public T getContent() {
        return content;
    }

    // Setter für den Inhalt des Knotens
    public void setContent(T pContent) {
        this.content = pContent;
    }

    // Getter für den nächsten Knoten
    public NodeStack<T> getNextNode() {
        return nextNode;
    }

    // Setter für den nächsten Knoten
    public void setNextNode(NodeStack<T> nextKnoten) {
        this.nextNode = nextKnoten;
    }
}
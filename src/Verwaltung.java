import java.util.Scanner;



public class Verwaltung {
    private Scanner scanner;

    public static void main(String[] args) {

        new Verwaltung();
        System.out.println("Herzlich willkommen zu Zeichenketten verschluesselerer!");

    }
    public Verwaltung(){
        scanner = new Scanner(System.in);
        warteschlange warteschlange= new warteschlange();
        while (true) {
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("[1]Hinzufuegen");
            System.out.println("[2]Ersten Auslesen");
            int option = scanner.nextInt();
            if(option==1) {
                System.out.println("Wie");
                option = scanner.nextInt();
                //for (int i=0;i<option;i++){
                  //  warteschlange.einfuegen(new Knoten(""+i));

                //}
                Kunde hilf = new Kunde("Hase");
                warteschlange.einfuegen(hilf);
            }else if (option==2){
                Kunde hilfe = (Kunde)warteschlange.getErsten();
                System.out.println(hilfe.getName());
                warteschlange.entfernen();
            }

        }
    }
}
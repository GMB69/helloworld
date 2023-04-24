package OOP2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BankApp {

    public static void main(String[] args) {
        Bankkonto georg = new Bankkonto("Georg", "Brandenburg", 821224, 767, -1000);

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Guten Tag! Wollen Sie ");
        System.out.println();
        System.out.println("ABHEBEN: Drücken Sie (a)");
        System.out.println("EINZAHLEN: Drücken Sie (e)");
        System.out.println("KONTOSTAND: Drücken Sie (k)?");
        System.out.println();
        System.out.println("Bitte bestätigen Sie ihre Eingabe mit der Eingabetaste!");


        String kundenwunsch = scanner.nextLine();

        System.out.println("Kontoinhaber: " + georg.vname + " " + georg.nname + " Kontonummer: " + georg.kontoNr + " Überziehungsrahmen: " + georg.limit + " EURO");
        System.out.println();
        if (kundenwunsch.equals("a")) {
            System.out.println("Alter Kontostand: " + georg.kontostandAnfang + " EURO, Behebung: " + georg.auszahlung() + " EURO, Neuer Kontostand: " + georg.kontostandTiefer() + " EURO, Verfügbar: " + georg.verfügbar() + " EURO,");
            System.out.println();
        } else if (kundenwunsch.equals("e")) {
            System.out.println("Alter Kontostand: " + georg.kontostandAnfang + " Einzahlung: " + georg.einzahlung() + " Neuer Kontostand: " + georg.kontostandHöher() + " Verfügbar: " + georg.verfügbar());
            System.out.println();
        } else if (kundenwunsch.equals("k")) {
            System.out.println("Kontostand: " + georg.kontostandAnfang + " Verfügbar: " + georg.verfügbar());
            System.out.println();
        }
    }
}
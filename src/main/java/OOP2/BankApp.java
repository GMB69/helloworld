package OOP2;


import java.util.Scanner;


public class BankApp {


    public static void main(String[] args) {
        Bankkonto konto = new Bankkonto("Georg", "Berger", "AT12 3456 7890 1234",1000, -1000);
        Scanner scanner = new Scanner(System.in);
        boolean beenden = false;

        while(!beenden) {
        System.out.println();
        System.out.println("Guten Tag! Was möchten Sie tun? ");
        System.out.println();
        System.out.println("EINZAHLEN: Drücken Sie (1)");
        System.out.println("AUSZAHLEN: Drücken Sie (2)");
        System.out.println("KONTOSTAND ABFRAGEN: Drücken Sie (3)?");
        System.out.println("ABBRECHEN: Drücken Sie (4)");
        System.out.println();
        System.out.println("Bitte bestätigen Sie ihre Eingabe mit der Eingabetaste!");

        int auswahl = scanner.nextInt();
        System.out.println(konto);

        switch (auswahl) {
            case 1:
                System.out.println();
                System.out.println("Bitte geben Sie den Betrag ein, den Sie EINZAHLEN wollen! Bestätigen Sie mit der Eingabetaste.");
                double einzahlenBetrag = scanner.nextDouble();
                konto.einzahlen(einzahlenBetrag);
                System.out.println("Einzahlung erfolgreich! Neuer Kontostand: " + konto.getKontostand() + " €");
                beenden = true;
                break;

            case 2:
                System.out.println();
                System.out.println("Bitte geben Sie den Betrag ein, den Sie ABHEBEN wollen! Bestätigen Sie mit der Eingabetaste.");
                double auszahlenBetrag = scanner.nextDouble();

                if (konto.auszahlen(auszahlenBetrag)) {
                    System.out.println("Auszahlung erfolgreich! Neuer Kontostand: " + konto.getKontostand() + " €");
                    beenden = true;
                } else {
                    System.out.println("Auszahlung fehlgeschlagen. Limit überschritten!");
            }
             break;

            case 3:
                System.out.println("Aktueller Kontostand: " + konto.getKontostand() + "€");
                beenden = true;
                break;

            case 4:
                System.out.println("Programm wird beendet.");
                beenden = true;
                break;

            default:
                System.out.println("Ungültige Eingabe!");
                break;
        }
        }

        scanner.close();
    }
}
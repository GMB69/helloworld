package OOP2;


import java.util.Scanner;


public class BankApp {


    public static void main(String[] args) {
        // Instanz Konto der klasse Bankkonto
        Bankkonto konto = new Bankkonto("Georg", "Berger", "AT12 3456 7890 1234",1000, -1000);
        Scanner scanner = new Scanner(System.in);
        boolean beenden = false;

        // while-Schleife wird beendet (beenden==true), wenn Operation abgeschlossen wird, durch 1,2,3, oder 4
        while(!beenden) {
        System.out.println();
        System.out.println("Guten Tag! Was möchten Sie tun? ");
        System.out.println();
        System.out.println("(1) EINZAHLEN");
        System.out.println("(2) AUSZAHLEN");
        System.out.println("(3) KONTOSTAND ABFRAGEN");
        System.out.println("(4) ABBRECHEN");
        System.out.println();
        System.out.println("Bitte bestätigen Sie ihre Eingabe mit der Eingabetaste!");

        int auswahl = scanner.nextInt();
        System.out.println(konto);

        switch (auswahl) {
            case 1:
                System.out.println();
                System.out.println("Welchen Betrag wollen Sie EINZAHLEN? Bestätigen Sie mit der Eingabetaste.");
                double einzahlenBetrag = scanner.nextDouble();
                konto.einzahlen(einzahlenBetrag);  // der Wert von einzahlenBetrag wird als Argument an die Methode einzahlen übergeben;
                System.out.println("Einzahlung erfolgreich! Neuer Kontostand: " + konto.getKontostand() + " €");
                beenden = true;
                break;

            case 2:
                System.out.println();
                System.out.println("Welchen Betrag wollen Sie AUSZAHLEN? Bestätigen Sie mit der Eingabetaste.");
                double auszahlenBetrag = scanner.nextDouble();

                // wird durch Behebung das Limit überschritten, gibt die Methode auszahlen den Wert false zurück, damit ergibt sich "else"
                // wird das Limit nicht überschritten, wird true zurückgegeben;
                if (konto.auszahlen(auszahlenBetrag)) { // der Wert von auszahlenBetrag wird als Argument an die Methode auszahlen übergeben;
                    System.out.println("Auszahlung erfolgreich! Neuer Kontostand: " + konto.getKontostand() + " €");
                    beenden = true;
                } else {
                    System.out.println("Auszahlung fehlgeschlagen. Limit überschritten!");
            }
             break;

            case 3:
                System.out.println("Aktueller Kontostand: " + konto.getKontostand() + "€ , " + konto.getLimit() + "€");
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
package OOP2;

import java.util.Scanner;

public class Bankkonto {
    String vname;
    String nname;
    int kontoNr;
    double kontostandAnfang;
    double kontostandJetzt;
    int limit;

    Bankkonto(String vname, String nname, int kontoNr, double kontostandAnfang, int limit) {
        this.vname = vname;
        this.nname = nname;
        this.kontoNr = kontoNr;
        this.kontostandAnfang = (double) kontostandAnfang;
        this.limit = limit;
    }

    public double einzahlung() {
        System.out.println();
        System.out.println("Bitte geben Sie den Betrag ein, den EINZAHLEN wollen! Bestätigen Sie mit der Eingabetaste.");
        Scanner scanner = new Scanner(System.in);
        double einzahlung1 = scanner.nextInt();
        return einzahlung1;
    }

    public double auszahlung() {
        System.out.println("Bitte geben Sie den Betrag ein, den ABHEBEN wollen! Bestätigen Sie mit der Eingabetaste.");
        Scanner scanner = new Scanner(System.in);
        double auszahlung1 = scanner.nextInt();
        if (kontostandAnfang - auszahlung1 >= limit) {
            return (double) (auszahlung1);
        } else {
            System.out.println("Dieser Betrag übersteigt das verfügbare Limit!");
            return 0;
        }
    }

    public double kontostandHöher() {
        return (double) (kontostandAnfang + einzahlung());
    }

    public double kontostandTiefer() {
        return (double) (kontostandAnfang - auszahlung());
    }

    public double verfügbar() {
        if (einzahlung() > 0) return (double) (kontostandHöher() - limit);
        else if (auszahlung() > 0) return (double) (kontostandTiefer() - limit);
        else return kontostandAnfang - limit;
    }
}
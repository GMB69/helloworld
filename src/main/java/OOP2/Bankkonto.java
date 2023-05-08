package OOP2;


public class Bankkonto {
    private String vorname;
    private String nachname;
    private String kontonummer;
    private double kontostand;
    private double limit;


    public Bankkonto(String vorname, String nachname, String kontonummer, double kontostand, double limit) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.kontonummer = kontonummer;
        this.kontostand = kontostand;
        this.limit = limit;
    }

    // Getter-Methoden
        public double getKontostand() {
                return kontostand;
    }

    public double getLimit() {
                return limit;
    }

    // Methoden
    public void einzahlen(double betrag) { // der Wert von einzahlenBetrag wird als Argument für den Parameter betrag übernommen;
                kontostand += betrag;       //  kontostand der Instanz konto wird um betrag erhöht
    }

    public boolean auszahlen(double betrag) {
        if (betrag <= kontostand - limit) {
            kontostand -= betrag;
            return true;
        } else {
            return false;
        }
    }
    public String toString() {
        return "Kontoinhaber: " + vorname + " " + nachname + ", Kontonummer: " + kontonummer + ", Kontostand: " + kontostand + "€, Limit: " + limit;
    }
}

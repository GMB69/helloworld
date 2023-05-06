package OOP2;


import java.util.Scanner;

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
    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getKontonummer() {
        return kontonummer;
    }

    public double getKontostand() {
        return kontostand;
    }

    public double getLimit() {
        return limit;
    }

    // Methoden
    public void einzahlen(double betrag) {
        kontostand += betrag;
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
        return "Kontoinhaber: " + vorname + " " + nachname + ", Kontonummer: " + kontonummer + ", Kontostand: " + kontostand + "€";
    }
}

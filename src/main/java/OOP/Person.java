package OOP;

import java.time.LocalDate;

class Person {

    static int mindestgeburtsjahr = 1990;
    private String vorname;
    private String nachname;
    public double gewicht;
    private LocalDate  geburtsDatum;

    Person(String vorname, String nachname, LocalDate geburtsDatum, double gewicht) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsDatum = geburtsDatum;
        this.gewicht = gewicht;
    }

    //<Sichtbarkeit> <static/non-static> <RückgabeTyp> <MethodenName> (<ParameterListe>)
    // return -> Rückgabe und Abbruch der Ausführung der Methode
    // keine Rückgabe -> RückgabeTyp: void
    public int alter() {
        int jetzigesJahr = LocalDate.now().getYear();
        int geburtsJahr = this.geburtsDatum.getYear();
        return jetzigesJahr - geburtsJahr;
    }
    public void zunehmen(double kg){
        gewicht += kg;
    }
    public void abnehmen(double kg){
        gewicht -= kg;
    }
}

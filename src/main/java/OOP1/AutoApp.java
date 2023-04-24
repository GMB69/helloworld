package OOP1;

public class AutoApp {

    public static void main(String[] args) {
        Auto vw = new Auto("L-1275 E", 70, 6.50,97500, 98320);
        Auto ford = new Auto("K-763 GU",55 , 7.30,113211, 113650);
        System.out.println();
        System.out.println("Das Fahrzeug mit dem Kennzeichen " + ford.kennzeichen + " hat ein Tankvolumen von " + ford.tankvolumen + " Liter Kraftstoff.");
        System.out.println("Der Anfangskilometerstand lautete " + ford.kmStandAnfang + " km. Der neue Kilometerstand ist " + ford.kmStandEnde + " km.");
        System.out.println("Die heutige Fahrstrecke betrug " + ford.fahren() + " km. Zum Volltanken werden " + ford.tanken() + " Liter Kraftstoff benötigt.");
        System.out.println();
        System.out.println("Das Fahrzeug mit dem Kennzeichen " + vw.kennzeichen + " hat ein Tankvolumen von " + vw.tankvolumen + " Liter Kraftstoff.");
        System.out.println("Der Anfangskilometerstand lautete " + vw.kmStandAnfang + " km. Der neue Kilometerstand ist " + vw.kmStandEnde + " km.");
        System.out.println("Die heutige Fahrstrecke betrug " + vw.fahren() + " km. Zum Volltanken werden " + vw.tanken() + " Liter Kraftstoff benötigt.");
        System.out.println();
    }
}

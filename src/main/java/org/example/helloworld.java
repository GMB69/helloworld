package org.example;

public class helloworld {
    public static int summe(int n) {
// TODO: Implementierung
        int summe = 0;
        for (int i = 1; i <= n; i++) {
            summe = summe + i;
        }
        return summe;
    }

    public static void main(String[] args) {
// TODO: Funktion summe aufrufen und auf der Konsole ausgeben }
        int ergebnis = summe(10);
        System.out.println("Die Summe der natürlichen Zahlen von 1 bis 10 ist: " + ergebnis);

    }
}

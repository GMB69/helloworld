package org.example;

public class Main {
    public static void main(String[] args) {
        // Kompilieren Test
        int b = 93/2;
        System.out.println("b ist: " + b);
        int c = 21;
        //System.out.println(++c);
        //System.out.println(c++);
        //System.out.println(c%9);
        //System.out.println(c < 3);
        boolean b1 =!true;
        System.out.println("Der Wert von b1 ist: " +b1);
        boolean b2 = (3 > 3) && ((2 == 2) || (4 > 90));
        System.out.println("Der Wert von b2 ist: " +b2);
        boolean b3 = (45 != 9) & ! true;
        System.out.println("Der Wert von b3 ist: " +b3);
        int d = (int) 92.4/3;
        System.out.println("Der Wert von d ist: " +d);
        //Division
        System.out.println("Das Ergebnis der Division ist: " + (7/2));
        System.out.println("Das Ergebnis der Division ist: " + (7.0/2));
        System.out.println("Das Ergebnis der Division ist: " + (7.0/2));
        // Operation of Characters
        System.out.println("Buchstabe a: " + ((int)'a'));
        System.out.println("a + 1: " + ('a'+1));
        System.out.println("a + 1: " + ((char)('a'+1)));
    }
}
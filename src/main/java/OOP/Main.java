package OOP;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Person georg = new Person("Georg", "Brandenburg", LocalDate.of(1969, 05, 24), 83);
        georg.abnehmen(5);
        System.out.println("Das Alter von Georg ist: " + georg.alter());
        System.out.println("Sein Gewicht ist: " + georg.gewicht);
    }
}
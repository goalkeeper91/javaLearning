package JavaUebung02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kreisberechnung4Console {
    public static void main(String[] args) {
        double radius, umfang, flaeche;
        String einheit, eingabe;

        BufferedReader eingabepuffer = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Geben Sie den Kreisradius ein: ");

        try {
            eingabe = eingabepuffer.readLine();
            radius = Double.parseDouble(eingabe);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.print("Geben Sie die Einheit ein: ");

        try {
            eingabe = eingabepuffer.readLine();
            einheit = eingabe;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        umfang = 2.0 * 3.1415926 * radius;
        flaeche = 3.1415926 * radius * radius;

        System.out.println("Umfang: " + umfang + " " + einheit);
        System.out.println("Fläche: " + flaeche + " " + einheit + '²');
    }
}

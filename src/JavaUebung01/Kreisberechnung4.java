package JavaUebung01;

import javax.swing.*;

/* Kreisberechnung: Der Radius für einen Kreis und die Einheit
 * werden über die Tastatur eingegeben. Anschließend
 * werden der Umfang und der Flächeninhalt berechnet.
 */
public class Kreisberechnung4 {
    public static void main(String[] args) {
        double radius, umfang, flaeche;
        String einheit, eingabe;

        eingabe = JOptionPane.showInputDialog("Geben Sie den Kreisradius ein: ");
        radius = Double.parseDouble(eingabe);

        eingabe = JOptionPane.showInputDialog(null,"Geben Sie die Einheit ein: ", "Eingabe", JOptionPane.PLAIN_MESSAGE);
        einheit = eingabe;

        umfang = 2.0 * 3.1415926 * radius;
        flaeche = 3.1415926 * radius * radius;

        System.out.println("Umfang: " + umfang + " " + einheit);
        System.out.println("Fläche: " + flaeche + " " + einheit + '²');
    }
}

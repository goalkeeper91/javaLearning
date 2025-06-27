package JavaUebung03;

// Java-Programm mit if-Anweisung

import javax.swing.*;

public class Selektion1 {
    public static void main(String[] args) {
        // Wäre ein int nicht sinnvoller bei dem Alter?
        double alter;
        String eingabe, ausgabe;

        eingabe = JOptionPane.showInputDialog("Geben sie ihr Alter ein: ");
        // Überprüfung des inputs ist auch hier noch nicht im Lehrbuch, hier wäre eine Prüfung auf den Input Sinnvoll
        alter = Double.parseDouble(eingabe);

        /* Das Lehrbuch sieht die erstellung des jeweiligen shoMessageDialogs innerhalb der if-Abfrage vor.
         * Da aber lediglich er Text ein anderer ist, habe ich mich für eine Abweichung zum Lehrbuch entschiedn.
        */
        if (alter < 18) {
            ausgabe = "Sorry, noch nicht volljährig!";
        } else {
            ausgabe = "Glückwunsch! Sie sind volljährig";
        }

        JOptionPane.showMessageDialog(null, ausgabe);
    }
}

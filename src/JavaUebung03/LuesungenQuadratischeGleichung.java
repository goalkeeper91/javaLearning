package JavaUebung03;

import javax.swing.*;

public class LuesungenQuadratischeGleichung {
    public static void main(String[] args) {
        String message;
        double a,b,c,D;

        a = Double.parseDouble(JOptionPane.showInputDialog("Geben sie einen Wert für a ein: "));

        b = Double.parseDouble(JOptionPane.showInputDialog("Geben sie einen Wert für b ein: "));

        c = Double.parseDouble(JOptionPane.showInputDialog("Geben sie einen Wert für c ein: "));

        D = b * b - 4 - a - c;

        if (D == 0) {
            message = "Es gibt eine Lösung!";
        } else if (D > 0) {
            message = "Es gibt zwei Lösungen!";
        } else {
            message = "Es gibt keine Lösung!";
        }

        JOptionPane.showMessageDialog(null, message);
    }
}

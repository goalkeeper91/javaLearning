package JavaUebung03;

import javax.swing.*;

public class Schaltjahr {
    public static void main(String[] args) {
        int year;
        String message;

        year = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie ein Jahr ein: "));

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            message = "Das Jahr " + year + " ist ein Schaltjahr!";
        } else {
            message = "Das Jahr " + year + " ist kein Schaltjahr!";
        }

        JOptionPane.showMessageDialog(null, message);
    }
}

package JavaUebung03;

import javax.swing.*;

public class Zahlentest {
    public static void main(String[] args) {
        String input, output;
        double number;

        input = JOptionPane.showInputDialog("Bitte geben sie eine Zahl ein: ");
        number = Double.parseDouble(input);

        if (number < 0 ) {
            output = "Die Zahl ist negativ!";
        } else {
            output = "Die Zahl ist nicht negativ!";
        }

        JOptionPane.showMessageDialog(null, output);
    }
}

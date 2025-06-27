package JavaUebung03;

/* Programm zum Testen auf Vokal
 *
 * Marcel Turlach
 * 27.06.2025
 */

import javax.swing.*;

public class Vokaltest2 {
    public static void main(String[] args) {
        String input, output;
        char c;
        boolean isVocal;

        input = JOptionPane.showInputDialog("Geben Sie einen Buchstaben ein: ");
        c =input.charAt(0);

        isVocal = c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';

        if (isVocal) {
            output = " ist ein Vokal!";
        } else {
            output = " ist kein Vokal!";
        }

        JOptionPane.showMessageDialog(null, c + output);
    }
}

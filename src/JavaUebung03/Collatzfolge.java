package JavaUebung03;

import javax.swing.*;
import java.util.ArrayList;

public class Collatzfolge {
    public static void main(String[] args){
        int x0, xn;
        StringBuilder message = new StringBuilder();
        boolean first = true;
        ArrayList<Integer> folge = new ArrayList<>();

        x0 = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie eine Start Zahl ein: "));

        while (true) {
            if (!first) {
                message.append(", ");
            } else {
                first = false;
            }

            message.append(x0);

            if (x0 == 1) {
                break; // Sobald 1 erreicht ist, abbrechen
            }

            // Collatz-Regel
            if (x0 % 2 == 0) {
                xn = x0 / 2;
            } else {
                xn = 3 * x0 + 1;
            }

            x0 = xn;
        }

        JOptionPane.showMessageDialog(null, message.toString());
    }
}

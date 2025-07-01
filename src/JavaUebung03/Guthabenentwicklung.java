package JavaUebung03;

import javax.swing.*;

public class Guthabenentwicklung {
    public static void main(String[] args) {
        float g0, g1, z;

        g0 = Float.parseFloat(JOptionPane.showInputDialog("Geben sie das Guthaben ein: "));
        z = Float.parseFloat(JOptionPane.showInputDialog("Geben sie den Zins ein: "));

        for (int i = 0; i < 10; i++) {
            g1 = g0 * (1 + z / 100);
            g0 = g1;
        }

        // auf 2 Stellen nach dem Komma gerundet
        g0 = Math.round(g0 * 100f) / 100f;

        JOptionPane.showMessageDialog(null, "Nach 10 Jahren haben sie " + g0 + "€");
    }
}

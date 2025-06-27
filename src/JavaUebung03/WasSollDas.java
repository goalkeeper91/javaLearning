package JavaUebung03;

import javax.swing.*;

public class WasSollDas {
    public static void main(String[] args) {
        int m,n;

        m = Integer.parseInt(JOptionPane.showInputDialog("Geben sie einen Wert für m ein: "));
        n = Integer.parseInt(JOptionPane.showInputDialog("Geben sie einen Wert für n ein: "));

        //Gibt man Zahlen, die nicht weiter Teilbar sind (bsp. 1 und 0) gerät man in eine Endlosschleife.
        while (m != n) {
            if (m > n) {
                m = m - n;
            } else {
                n = n - m;
            }
        }

        System.out.println(m + " " + n);
    }
}


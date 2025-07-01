package JavaUebung03;

import javax.swing.*;

public class ggtEuklid {
    public static void main(String[] args) {
        int m,n,r;

        m = Integer.parseInt(JOptionPane.showInputDialog("Geben sie einen Wert für m ein: "));
        n = Integer.parseInt(JOptionPane.showInputDialog("Geben sie einen Wert für n ein: "));

        r = m % n;

        //Gibt man Zahlen, die nicht weiter Teilbar sind (bsp. 1 und 0) gerät man in eine Endlosschleife.
        while (r > 0) {
            m = n;
            n = r;
            r = m % n;
        }

        System.out.println(n);
    }
}

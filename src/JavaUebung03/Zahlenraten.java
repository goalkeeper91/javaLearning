package JavaUebung03;

import javax.swing.*;

public class Zahlenraten {
    public static void main(String[] args) {
        int inputNumber;
        final int hit = 6;

        inputNumber = Integer.parseInt(JOptionPane.showInputDialog("Gib eine Zahl zwischen 0 und 10 ein: "));

        switch (inputNumber) {
            case hit:
                JOptionPane.showMessageDialog(null, "Treffer!");
                break;
            case hit - 2:
            case hit - 1:
            case hit + 1:
            case hit + 2:
                JOptionPane.showMessageDialog(null, "Knapp daneben!");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Daneben!");
        }
    }
}

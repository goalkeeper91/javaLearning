package JavaUebung03;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class Collatzfolge2 {
    public static void main(String[] args){
        int x0, xn;
        ArrayList<Integer> folge = new ArrayList<>();

        x0 = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie eine Start Zahl ein: "));

        while (x0 != 1) {
            folge.add(x0); // 1 wird hier nie gespeichert

            if (x0 % 2 == 0) {
                xn = x0 / 2;
            } else {
                xn = 3 * x0 + 1;
            }

            x0 = xn;
        }

        StringBuilder message = new StringBuilder();
        for (int i = 0; i < folge.size(); i++) {
            message.append(folge.get(i));
            if (i < folge.size() - 1) {
                message.append(", ");
            }
        }

        message.append("\nAnzahl der Folgeglieder: ").append(folge.size());
        message.append("\nDie größte Zahl in der Folge ist: ").append(Collections.max(folge));
        JOptionPane.showMessageDialog(null, message.toString());
    }
}

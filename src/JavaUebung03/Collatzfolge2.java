package JavaUebung03;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class Collatzfolge2 {

    public static ArrayList<Integer> berechneFolge(int startwert) {
        ArrayList<Integer> folge = new ArrayList<>();
        int x = startwert;
        while (x != 1) {
            folge.add(x);
            if (x % 2 == 0) {
                x = x / 2;
            } else {
                x = 3 * x + 1;
            }
        }
        return folge;
    }

    public static void main(String[] args){
        int startwert = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie eine Start Zahl ein: "));
        ArrayList<Integer> folge = berechneFolge(startwert);

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

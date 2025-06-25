package JavaUebung01;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class GrussMitProgrammfenster extends JFrame {
    public GrussMitProgrammfenster() {
        super("Hallo");

        Icon icon;
        URL imgURL = getClass().getResource("GoalKeeper91ttv.png");
        if (imgURL != null) {
            icon = new ImageIcon(imgURL);
        } else {
            System.err.println("Warnung: Bilddatei nicht gefunden!");
            // Optional: Standard-Icon oder leeres Icon
            icon = UIManager.getIcon("OptionPane.warningIcon");
        }
        JLabel label1 = new JLabel("Viel Erfolg beim", JLabel.CENTER);
        JLabel label2 = new JLabel("Programmieren mit Java!", JLabel.CENTER);
        JLabel label3 = new JLabel(icon);
        Font schrift = new Font("SansSerif", Font.BOLD, 24);
        label1.setFont(schrift);
        label1.setForeground(Color.red);
        label2.setFont(schrift);
        label2.setForeground(Color.red);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(Color.white);
        c.add(label1);
        c.add(label2);
        c.add(label3);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,450);
        setVisible(true);
    }

    public static void main(String [] args) {
        new GrussMitProgrammfenster();
    }
}

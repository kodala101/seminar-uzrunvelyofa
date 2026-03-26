package seminar7TreeButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickCounterApp {
    private int counter = 0;

    public ClickCounterApp() {
        JFrame frame = new JFrame("Counter");
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JButton button = new JButton("Button");
        JLabel label = new JLabel("count = 0");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                label.setText("count: " + counter);
            }
        });

        panel.add(button, BorderLayout.CENTER);
        panel.add(label, BorderLayout.SOUTH);
        frame.add(panel);
        frame.setVisible(true);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ClickCounterApp();
    }
}

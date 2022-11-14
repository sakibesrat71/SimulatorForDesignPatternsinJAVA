import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIforDecorator implements ActionListener{
    CountingDuck duck;
    JFrame frame = new JFrame("Decorator");
    public GUIforDecorator() {
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    JButton button = new JButton("Make a counting duck");
    JButton quack = new JButton("Quack");

    JLabel counter = new JLabel("");

    JPanel panel = new JPanel();
    public void addQuackButton() {
        panel.add(button);
        panel.add(quack);
        quack.setBackground(java.awt.Color.RED);
        quack.setEnabled(false);
        button.addActionListener(this);
        quack.addActionListener(this);
        frame.getContentPane().add(panel);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            duck = new CountingDuck(new Duck());
            quack.setBackground(java.awt.Color.GREEN);
            quack.setEnabled(true);
        }
        if (e.getSource() == quack) {
            duck.quack();
            counter.setText("Quack counter: " + duck.counter);
            panel.add(counter);
        }

    }
}

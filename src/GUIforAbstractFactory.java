import javafx.event.ActionEvent;
import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.event.ActionListener;

public class GUIforAbstractFactory implements ActionListener {
    AbstractDuckFactory duckFactory;

    Quackable duck;
    JFrame frame = new JFrame("Abstract Factory");
    public GUIforAbstractFactory() {
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    JPanel panel = new JPanel();
    JButton makeduckbutton = new JButton("Make a duck");
    JButton quackbutton = new JButton("Quack");

    JLabel counterofQuacks = new JLabel("");
    public void addQuackButton() {
        panel.add(makeduckbutton);
        panel.add(quackbutton);
        panel.add(counterofQuacks);
        quackbutton.setBackground(java.awt.Color.RED);
        quackbutton.setEnabled(false);
        quackbutton.addActionListener(this);
        makeduckbutton.addActionListener(this);
        frame.getContentPane().add(panel);
    }


    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
            if(e.getSource() == makeduckbutton) {
                duckFactory = new DuckFactory();
                duck = duckFactory.createDuck();
                quackbutton.setBackground(java.awt.Color.GREEN);
                quackbutton.setEnabled(true);

            }
            if (e.getSource() == quackbutton) {
                duck.quack();
            }
    }
}


import javafx.event.ActionEvent;
import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.event.ActionListener;

public class GUIforAdapter implements ActionListener {
    Quackable duck;
    Goose goose;
    JFrame frame = new JFrame("Adapter");
    public GUIforAdapter() {
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    JPanel panel = new JPanel();
    JButton makeduckbutton = new JButton("Make a duck");
    JButton quackbutton = new JButton("Quack");

    JButton adaptTheDuck = new JButton("Adapt the duck to honk");

    JButton createGoose = new JButton("Create a goose");

    public void addQuackButton() {
        panel.add(makeduckbutton);
        panel.add(quackbutton);
        panel.add(adaptTheDuck);
        panel.add(createGoose);
        quackbutton.setBackground(java.awt.Color.RED);
        adaptTheDuck.setBackground(java.awt.Color.RED);
        quackbutton.setEnabled(false);
        adaptTheDuck.setEnabled(false);
        quackbutton.addActionListener(this);
        makeduckbutton.addActionListener(this);
        adaptTheDuck.addActionListener(this);
        createGoose.addActionListener(this);
        frame.getContentPane().add(panel);
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
            if(e.getSource() == makeduckbutton) {
                duck = new Duck();
                quackbutton.setBackground(java.awt.Color.GREEN);
                quackbutton.setEnabled(true);
                quackbutton.setText("Quack");

            }
            if (e.getSource() == quackbutton) {
                duck.quack();
            }
            if(e.getSource() == createGoose) {
                goose = new Goose() ;
                adaptTheDuck.setBackground(java.awt.Color.GREEN);
                adaptTheDuck.setEnabled(true);
            }

            if(e.getSource() == adaptTheDuck) {
                quackbutton.setText("Quack but Honk");
                duck = new GooseDuckAdapter(goose);
                quackbutton.setBackground(java.awt.Color.GREEN);
                quackbutton.setEnabled(true);
                quackbutton.setText("quack but Honk?");
            }
    }

}

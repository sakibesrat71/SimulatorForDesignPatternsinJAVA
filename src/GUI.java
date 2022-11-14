import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    JFrame frame = new JFrame("Duck Simulator");
    public GUI() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    JPanel panel = new JPanel();
    JButton button = new JButton("Abstract Factory Demo");
    JButton button2 = new JButton("Decorator Demo");

    JButton button3 = new JButton("Adapter Demo");

    JButton button4 = new JButton("Composite Demo");

    JButton button5 = new JButton("Observer Demo");
    public void addQuackButton() {
        button.addActionListener(this);
        panel.add(button);
        button2.addActionListener(this);
        panel.add(button2);
        button3.addActionListener(this);
        panel.add(button3);
        button4.addActionListener(this);
        panel.add(button4);
        button5.addActionListener(this);
        panel.add(button5);

        frame.getContentPane().add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button) {
        GUIforAbstractFactory guIforAbstractFactory = new GUIforAbstractFactory();
        guIforAbstractFactory.addQuackButton();
    }
    if (e.getSource() == button2) {
        GUIforDecorator guIforDecorator = new GUIforDecorator();
        guIforDecorator.addQuackButton();
    }
    if (e.getSource() == button3) {
        GUIforAdapter guIforAdapter = new GUIforAdapter();
        guIforAdapter.addQuackButton();
    }
    if (e.getSource() == button4) {
        GUIforComposite guIforComposite = new GUIforComposite();
        guIforComposite.addQuackButton();
    }
    if (e.getSource() == button5) {
        GUIforObserver guIforObserver = new GUIforObserver();
        guIforObserver.addQuackButton();
    }

    }
}

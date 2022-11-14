import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUIforComposite implements ActionListener {
    Quackable duck;
    Quackable flock[];

    FlockOfDucks flockOfDucks;
    int counter = 0;
    JFrame frame = new JFrame("Composite");
    public GUIforComposite() {
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    JPanel panel = new JPanel();
    JButton addDuck = new JButton("increase duck no");
    JButton decreaseDuckCounter = new JButton("decrease duck no");

    JButton createFlock = new JButton("Create a flock");

    JButton quackFlock = new JButton("u will hear quack");

    JLabel counterofQuacks = new JLabel("0");
    public void addQuackButton() {
        panel.add(addDuck);
        panel.add(counterofQuacks);
        panel.add(decreaseDuckCounter);
        panel.add(createFlock);
        panel.add(quackFlock);
        decreaseDuckCounter.setBackground(java.awt.Color.RED);
        decreaseDuckCounter.setEnabled(false);
        decreaseDuckCounter.addActionListener(this);
        addDuck.addActionListener(this);
        createFlock.addActionListener(this);
        quackFlock.addActionListener(this);
        frame.getContentPane().add(panel);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == addDuck) {
            decreaseDuckCounter.setBackground(java.awt.Color.GREEN);
            decreaseDuckCounter.setEnabled(true);
            counter++;
            counterofQuacks.setText("counter: " + counter);
            createFlock.setText("Create a flock with " + counter + " ducks");
        }
        if (e.getSource() == decreaseDuckCounter) {
            counter--;
            counterofQuacks.setText("counter: " + counter);
            createFlock.setText("Create a flock with " + counter + " ducks");
            if(counter == 0) {
                decreaseDuckCounter.setBackground(java.awt.Color.RED);
                decreaseDuckCounter.setEnabled(false);
            }
        }
        if(e.getSource() == createFlock) {
            flock = new Quackable[counter];
            for(int i = 0; i < counter; i++) {
                flock[i] = new Duck();
            }
            flockOfDucks = new FlockOfDucks(flock);
            quackFlock.setText("you will hear " + counter + " quacks");

        }
        if(e.getSource() == quackFlock) {
            flockOfDucks.quack();
        }

    }
}

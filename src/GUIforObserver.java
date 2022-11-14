import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class GUIforObserver implements ActionListener{
    Duck duck;
    WoodenDuck woodenDuck;
   MallardDuck mallardDuck;
    NotificationService notificationService;
    public List<Listeners> listeners = new ArrayList<Listeners>();
    JFrame frame = new JFrame("Observer");
    public GUIforObserver() {
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    JPanel panel = new JPanel();
    JButton addObserver = new JButton("Add an observer");
    JButton removeObserver = new JButton("Remove the observer");

    JButton makeDuck = new JButton("Simple Duck Quacking");
    JButton makeWoodenDuck = new JButton("Wooden Duck Quacking");
    JButton makeMallardDuck = new JButton("Mallard Duck Quacking");
    JTextField observerName = new JTextField("Observer name");
    JTextField interestName = new JTextField("Interest name");

    JButton createObserver = new JButton("Create an observer");

    JButton createNotificationService = new JButton("Create the notification service");
    JLabel event = new JLabel("Event: ");


    public void addQuackButton() {

        panel.add(createObserver);
        panel.add(observerName);
        panel.add(interestName);
        // panel.add(createNotificationService);
        panel.add(makeDuck);
        panel.add(makeWoodenDuck);
        panel.add(makeMallardDuck);
        panel.add(event);


        createObserver.addActionListener(this);
        makeDuck.addActionListener(this);
        makeWoodenDuck.addActionListener(this);
        makeMallardDuck.addActionListener(this);
        // createNotificationService.addActionListener(this);
        frame.getContentPane().add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == createObserver) {
//            notificationService = new NotificationService();
//            notificationService.addListener(new Listeners(observerName.getText(), interestName.getText()));
//            removeObserver.setBackground(java.awt.Color.GREEN);
//            removeObserver.setEnabled(true);
            listeners.add(new Listeners(observerName.getText(), interestName.getText()));

        }
        if(e.getSource() == makeDuck) {
            duck = new Duck();
            duck.notificationService.listeners = listeners;
            duck.quack();

        }
        if(e.getSource() == makeWoodenDuck) {
            woodenDuck = new WoodenDuck("woodenDuck");
            woodenDuck.notificationService.listeners = listeners;
            woodenDuck.quack();
        }
        if(e.getSource() == makeMallardDuck) {
            mallardDuck = new MallardDuck("mallardDuck");
            mallardDuck.notificationService.listeners = listeners;
            mallardDuck.quack();
        }
//        if (e.getSource() == createNotificationService) {
//
//            for (Listeners listener : listeners) {
//                notificationService.addListener(listener);
//            }
//        }


    }
}

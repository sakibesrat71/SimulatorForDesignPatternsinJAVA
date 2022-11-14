import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
public class MallardDuck implements Quackable {

    String name;
    NotificationService notificationService = new NotificationService();

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    // constructor
    public MallardDuck(String name) {
        this.name = name;
    }

    public void quack() {
        System.out.println(name + "Quack");
        Duck.playQuackSound("quack.wav");
        notificationService.setDuckType("mallardDuck");
        notificationService.notifyListeners();
    }
}


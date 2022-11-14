import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

public class Duck implements Quackable {

    NotificationService notificationService = new NotificationService();
     public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    public void quack() {
        System.out.println("Quack");
        playQuackSound("quack.wav");
        notificationService.setDuckType("simpleDuck");
        notificationService.notifyListeners();

    }
    public static void playQuackSound(String filename) {
        InputStream quack;
        try{
            File file = new File(filename);
            if(file.exists()){
                quack = new FileInputStream(file);
                AudioInputStream audioIn = AudioSystem.getAudioInputStream(file);
                Clip clip = AudioSystem.getClip();
                clip.open(audioIn);
                clip.start();
                Thread.sleep(clip.getMicrosecondLength()/1000);
            }
            else {
                System.out.println("Can't find file");
            }


    }
        catch(Exception e) {
            System.out.println("Error playing sound");
        }

    }
}



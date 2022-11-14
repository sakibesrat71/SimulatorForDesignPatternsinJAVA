import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Goose implements Honkable {
    public void honk() {
        System.out.println("Honk");
        playHonkSound("honk.wav");
    }

    public static void playHonkSound(String filename) {
        InputStream quack;
        try{
            File file = new File(filename);
            if(file.exists()){
                quack = new FileInputStream(file);
                AudioInputStream audioIn = AudioSystem.getAudioInputStream(file);
                Clip clip = AudioSystem.getClip();
                clip.open(audioIn);
                clip.start();
                // JOptionPane.showMessageDialog(null, "Press OK to stop playing");
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

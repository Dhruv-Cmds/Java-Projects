package AlarmClock;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AlarmClock implements Runnable {

    private final LocalTime alarmTime;
    private final String filepath;
    private final Scanner scanner;

    AlarmClock(LocalTime alarmTime, String filepath, Scanner scanner) {
        this.alarmTime = alarmTime;
        this.filepath = filepath;
        this.scanner = scanner;
    }

    @Override
    public void run() {
        while (LocalTime.now().isBefore(alarmTime)) {
            try {
                Thread.sleep(1000);

                LocalTime now = LocalTime.now();
                
                // int hours = now.getHour(); 
                // int minutes = now.getMinute(); 
                // int seconds = now.getSecond(); 
                // System.out.printf("\r%02d:%02d:%02d\n" , hours, minutes , seconds);

                System.out.printf("\r%02d:%02d:%02d",
                        now.getHour(),
                        now.getMinute(),
                        now.getSecond());
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }
        System.out.println("\n*ALARM NOISES*");
        playSound(filepath);
    }

    private void playSound(String filepath) {

        File audioFile = new File(filepath);

        try (AudioInputStream audioInputStream =
                     AudioSystem.getAudioInputStream(audioFile)) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);   // FIXED
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();

            System.out.print("Press Enter to stop the alarm:");
            scanner.nextLine();

            clip.stop();
            clip.close();

        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file format is not supported.");
        } catch (LineUnavailableException e) {
            System.out.println("Audio is unavailable.");
        } catch (IOException e) {
            System.out.println("Error reading audio file.");
        }
    }
}
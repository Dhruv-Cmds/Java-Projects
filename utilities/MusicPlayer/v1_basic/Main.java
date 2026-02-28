package MusicPlayer.v1_basic;

import java.io.File;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Main {

    public static void main(String[] args) {
        // MUSIC PLAYER
        File[] songs = {
            new File("utilities/MusicPlayer/track1.wav"),
            new File("utilities/MusicPlayer/track2.wav"),
            new File("utilities/MusicPlayer/track3.wav"),
            new File("utilities/MusicPlayer/track4.wav"),
            new File("utilities/MusicPlayer/track5.wav")
        };

        int songIndex = 0;
        Clip clip = null;
        long pausePosition = 0;

        Scanner scanner = new Scanner(System.in);

        try {
            AudioInputStream audioStream =
                    AudioSystem.getAudioInputStream(songs[songIndex]);

            clip = AudioSystem.getClip();
            clip.open(audioStream);

            String choice = "";

            while (!choice.equals("Q")) {

                System.out.println("\nP = Play");
                System.out.println("S = Pause");
                System.out.println("C = Back 10 sec");
                System.out.println("D = Forward 10 sec");
                System.out.println("N = Next song");
                System.out.println("R = Restart");
                System.out.println("Q = Quit");
                System.out.print("Choice: ");

                choice = scanner.next().toUpperCase();

                if (choice.equals("P")) {
                    clip.setMicrosecondPosition(pausePosition);
                    clip.start();
                }

                else if (choice.equals("S")) {
                    pausePosition = clip.getMicrosecondPosition();
                    clip.stop();
                }

                else if (choice.equals("C")) {
                    long newPos = clip.getMicrosecondPosition() - 10_000_000;
                    if (newPos < 0) newPos = 0;
                    clip.setMicrosecondPosition(newPos);
                }

                else if (choice.equals("D")) {
                    long newPos = clip.getMicrosecondPosition() + 10_000_000;
                    if (newPos > clip.getMicrosecondLength())
                        newPos = clip.getMicrosecondLength();
                    clip.setMicrosecondPosition(newPos);
                }
                else if (choice.equals("N")) {
                    clip.stop();
                    clip.close();

                    songIndex++;
                    if (songIndex == songs.length) {
                        songIndex = 0;
                    }
                    pausePosition = 0;
                    AudioInputStream newStream =
                            AudioSystem.getAudioInputStream(songs[songIndex]);

                    clip = AudioSystem.getClip();
                    clip.open(newStream);
                    clip.start();
                }

                else if (choice.equals("R")) {
                    pausePosition = 0;
                    clip.setMicrosecondPosition(0);
                }
            }
            clip.close();
            scanner.close();
        }
        catch (Exception e) {
            System.out.println("Error playing music");
        }
    }
}
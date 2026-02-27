package AlarmClock.v1_basic;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // ALARM CLOCK

        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmtime = null;
        String filepath = "your file path";

        while (alarmtime == null) {
            try {
                System.out.print("Enter an alarm time (HH:MM:SS): ");
                String inputTime = scanner.nextLine();

                LocalTime enteredTime = LocalTime.parse(inputTime, formatter);

                if (enteredTime.isBefore(LocalTime.now())) {
                    System.out.println("Alarm time is in the past. Please enter a future time.");
                }

                else {
                    alarmtime = enteredTime;
                    System.out.println("Alarm set for " + alarmtime);
                }

            } catch (DateTimeParseException e) {
                System.out.println("Invalid format. Please use HH:MM:SS");
            }
        }

        AlarmClock alarmClock = new AlarmClock(alarmtime, filepath, scanner);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();
    }
}
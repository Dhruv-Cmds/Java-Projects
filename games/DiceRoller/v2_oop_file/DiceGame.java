package DiceRoller.v2_oop_file;

import java.util.Scanner;

public class DiceGame {

    private final Scanner scanner = new Scanner(System.in);
    private final Die die = new Die();

    public void start() {

        System.out.print("Enter the # of dice to roll: ");
        int numOfDice = scanner.nextInt();

        if (numOfDice <= 0) {
            System.out.println("Number of dice must be greater than 0.");
            return;
        }

        int total = 0;

        for (int i = 1; i <= numOfDice; i++) {

            int roll = die.roll();

            DicePrinter.print(roll);
            System.out.println("You rolled: " + roll);

            FileManager.saveRoll(i, roll);

            total += roll;
        }

        System.out.println("Total: " + total);
        FileManager.saveTotal(total);

        scanner.close();
    }
}
package DiceRoller.v2_oop_file;

public class DicePrinter {

    public static void print(int roll) {

        String dice1 = """
                ---------
                |       |
                |   ●   |
                |       |
                ---------
                """;

        String dice2 = """
                ---------
                |●      |
                |       |
                |     ● |
                ---------
                """;

        String dice3 = """
                ---------
                |●      |
                |   ●   |
                |     ● |
                ---------
                """;

        String dice4 = """
                ---------
                |●     ●|
                |       |
                |●     ●|
                ---------
                """;

        String dice5 = """
                ---------
                |●     ●|
                |   ●   |
                |●     ●|
                ---------
                """;

        String dice6 = """
                ---------
                |●     ●|
                |●     ●|
                |●     ●|
                ---------
                """;

        switch (roll) {
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.print("Invalid roll");
        }
    }
}
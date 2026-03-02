package HangMan.v2_oop_file;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {

    public void start() {

        Scanner scanner = new Scanner(System.in);

        WorldLoader file = new WorldLoader();
        ArrayList<String> words = file.getWords();

        if (words.isEmpty()) {
            System.out.println("No words loaded. Check words.txt path.");
            return;
        }

        Random random = new Random();

        String word = words.get(random.nextInt(words.size())).toLowerCase();


        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        HangmanArt art = new HangmanArt();

        System.out.println("-------------------");
        System.out.println("Welcome to Hangman!");
        System.out.println("-------------------");

        while (wrongGuesses < 6) {

            System.out.println(art.getHangmanArt(wrongGuesses));

            System.out.print("Word: ");
            for (char c : wordState) {
                System.out.print(c + " ");
            }

            System.out.println();
            System.out.print("Guess a letter: ");

            char guess = scanner.next().toLowerCase().charAt(0);

            if (word.indexOf(guess) >= 0) {

                System.out.println("Correct guess!");

                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        wordState.set(i, guess);
                    }
                }

                if (!wordState.contains('_')) {
                    System.out.println(art.getHangmanArt(wrongGuesses));
                    System.out.println("You WIN!");
                    System.out.println("The word was: " + word);
                    return;
                }

            } else {
                wrongGuesses++;
                System.out.println("Wrong guess!");
            }
        }

        System.out.println(art.getHangmanArt(wrongGuesses));
        System.out.println("Game OVER!");
        System.out.println("The word was: " + word);
    }
}
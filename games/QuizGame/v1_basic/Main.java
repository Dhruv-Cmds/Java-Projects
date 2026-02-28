package QuizGame.v1_basic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                    // QUIZ GAME
        String[] questions = {"I. Which language is good for ML?", 
                              "II. How many finger do humans have?", 
                              "III. Most importent part of human?", 
                              "IV. How Many months are in one month?", 
                              "VI. How many years in one month?"};

        String[][] options = {{"1. java" , "2. python"},
                              {"1. 10" , "2. 20"},
                              {"1. Brain" , "2. heart"}, 
                              {"1. 30" , "2. 0"}, 
                              {"1 . 0" , "2. 12"}};

        int[] answers = {2 , 1 , 1 , 2 , 1};

        int score = 0;
        int guess = 0;  

        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------");
        System.out.println("Welcome to Quiz Game!");
        System.out.println("---------------------");

        for(int i = 0 ; i < questions.length ; i ++){
            System.out.println(questions[i]);
            for(String option : options[i]){
                System.out.println(option);
            }

            System.out.print("Enter your Guess: ");
            guess = scanner.nextInt();

            if(guess == answers[i]){
                System.out.println("----------");
                System.out.println(" CORRECT! ");
                System.out.println("----------");
                score += 1;
            }

            else{
                System.out.println("--------");
                System.out.println(" WRONG! ");
                System.out.println("--------");
            }

        }
        System.out.println("You final score is: " + score + " out of " + questions.length);
        
        scanner.close();
    }
}   
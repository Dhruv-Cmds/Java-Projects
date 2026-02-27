package RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // ROCK PAPER SCISSORS 
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] choices = {"stone" , "paper" , "scissors"};

        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do{
            System.out.print("Enter your move (rock , paper , scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();
    
            if(!playerChoice.equals("rock") && 
               !playerChoice.equals("paper") && 
               !playerChoice.equals("scissors")){
    
                System.out.println("Invalid Choice");   
                continue;
            }
    
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);
    
            if(playerChoice == computerChoice){
                System.out.println("------");
                System.out.println(" Tie! ");
                System.out.println("------");
            }
            else if (
                (playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (playerChoice.equals("paper") && computerChoice.equals("stone")) ||
                (playerChoice.equals("scissors") && computerChoice.equals("paper"))
            ) {  
                System.out.println("----------");
                System.out.println(" You win! ");
                System.out.println("----------");
            }
    
            else{
                System.out.println("-------------");
                System.out.println("Computer win!");
                System.out.println("-------------");
            }
    
            System.out.println("Wanna play again? (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
        }

        while(playAgain.equals("yes"));

        System.out.println("---------");
        System.out.println("Good Bye!");
        System.out.println("---------");
        scanner.close();
    }
}
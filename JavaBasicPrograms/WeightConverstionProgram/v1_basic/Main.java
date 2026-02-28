package WeightConverstionProgram.v1_basic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //  WEIGHT CONVERSION PROGRAM

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;
        
        System.out.println("----------------------------------");
        System.out.println("Welcome to Weight Converter Center");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.print("Chose an option: ");
        choice = scanner.nextInt();

        if (choice == 1){
            System.out.print("Enter your weight in {lbs}: ");
            weight = scanner.nextDouble();

            newWeight = weight * 0.453592;
            System.out.printf("The new WEIGHT in kgs is: %.2f " , newWeight);
        }
        else if(choice == 2){
            System.out.print("Enter your weight in {kgs}: ");
            weight = scanner.nextDouble();
            
            newWeight = weight * 2.20462;
            System.out.printf("The new WEIGHT in lbs is: %.2f " , newWeight);
            
        }
        else{
            System.out.println("Enter valid number! ");
        }
        
        scanner.close();
    }

}
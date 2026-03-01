package WeightConverstionProgram.v2_oop_file;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Kgs kgs = new Kgs();
        Lbs lbs = new Lbs();

        double weight;
        double newWeight = 0;
        int choice;

        System.out.println("----------------------------------");
        System.out.println("Welcome to Weight Converter Center");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        System.out.println("3. Exit");

        while(true){

            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            if(choice == 1){
                System.out.print("Enter your weight in {lbs}: ");
                weight = scanner.nextDouble();
                lbs.lb(weight , newWeight);
            }
            else if(choice == 2){
                System.out.print("Enter your weight in {kgs}: ");
                weight = scanner.nextDouble();
                kgs.kg(weight , newWeight);
                break;
            }

            else if(choice == 3){
                System.out.println("Thank you for using us! Have a nice day.");
                break;
            }

            else{
                System.out.println("Invalid choice.");
            }
        }
    }
}

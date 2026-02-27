package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // CALCULATOR

        Scanner scanner = new Scanner(System.in);

        double num1;
        char operator;
        double num2;
        double result = 0;
        boolean validOperation = true;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the operation {+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the secound number: ");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;                 
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '^' -> result = Math.pow(num1, num2);
            case '/' -> {
                if(num2 == 0){
                    System.out.println("Number must be a greater than zero");
                    validOperation = false;
                }
                else{
                    System.out.println(result = num1 / num2);
                }
            }
            default -> {
                System.out.println("Invalid operator!");
                validOperation = false;
            }
        }
        if(validOperation){
            System.out.println(result);
        }
        scanner.close();
    }
}
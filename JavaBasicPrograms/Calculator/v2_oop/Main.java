package Calculator.v2_oop;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Square square = new Square();
        Division division = new Division();
        Multiplication multiplication = new Multiplication();

        double num1;
        double num2;
        char operator;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Choose any operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        if(operator == '+'){
            System.out.println(addition.add(num1 , num2));
        }

        else if (operator == '-'){
            System.out.println(subtraction.sub(num1 , num2));
        }

        else if (operator == '^'){
            System.out.println(square.sqr(num1 , num2));
        }

        else if (operator == '/'){
            System.out.println(division.div(num1 , num2));
        }

        else if (operator == '*'){
            System.out.println(multiplication.mul(num1 , num2));
        }

        else{
            System.out.println("Invalid Operator.");
        }
        scanner.close();
    }
}

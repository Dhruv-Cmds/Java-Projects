package Bankig.v2_oop;

public class Withdraw {

    double amount;

    public double withdraw (double amount , double balances){
        if(amount <= 0){
            System.out.println("Amount must be greater than 0.");
            return balances;
        }

        if (amount > balances){
            System.out.println("Insufficient Balance.");
            return  balances;
        }
        balances -= amount;
        System.out.println("Your Money Withdrawn Successfully from your Account");
        System.out.printf("Amount: $%.2f%n" , amount);
        return  balances;
    }
}

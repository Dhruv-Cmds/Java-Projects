package Bankig.v2_oop;

public class Deposit {

    public double deposit (double amount , double balances){
        balances += amount;
        System.out.println("Your Money Deposited Successfully to your Account");
        return balances;
    }
}

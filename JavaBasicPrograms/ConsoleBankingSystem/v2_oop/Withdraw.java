package ConsoleBankingSystem.v2_oop;

public class Withdraw {

    Transaction transaction;

    public Withdraw (Transaction transaction){
        this.transaction = transaction;
    }

    public double withdraw (double amount , double balance){

        if(amount <= 0){
            System.out.println("Amount must be greater than 0.");
            return  balance;
        }

        if(amount >= balance){
            System.out.println("Insufficient funds.");
            return balance;
        }

        balance -= amount;
        System.out.println("Amount withdrawn from your account.");
        transaction.addHistory("Withdraw: $" + amount);
        return  balance;
    }
}

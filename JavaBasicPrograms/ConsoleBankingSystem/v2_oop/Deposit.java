package ConsoleBankingSystem.v2_oop;

public class Deposit {
    Transaction transaction;

    public Deposit (Transaction transaction){
        this.transaction = transaction;
    }
    public double deposit (double amount , double balance){

        if(amount <= 0){
            System.out.println("Amount must be greater than 0.");
            return balance;
        }

        balance += amount;
        System.out.println("Amount added to your account.");
        transaction.addHistory("Deposit: $" + amount);
        return  balance;
    }
}

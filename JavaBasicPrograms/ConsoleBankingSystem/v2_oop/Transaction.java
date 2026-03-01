package ConsoleBankingSystem.v2_oop;

public class Transaction {

    String[] history = new String[100];
    int count = 0;

    public void addHistory(String record) {
        history[count] = record;
        count++;
    }

    public void showHistory() {
        if (count == 0) {
            System.out.println("No transactions yet.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(history[i]);
        }
    }
}
package LifeManager.v2_oop;

public class BirthdayCounter {

    public void bday (int days) throws InterruptedException {

        for (int i = days ; i > 0 ; i--){
            System.out.println(i);
            Thread.sleep(500);
        }
        System.out.println("🎉 Happy Early Birthday!");
    }
}

package LifeManager.v2_oop;

import java.util.Random;

public class Motivation {

    public void mtvn (){

        Random random = new Random();

        int randomNumber;

        randomNumber = random.nextInt(1 , 4);

        switch (randomNumber) {
            case 1 -> System.out.println("Stay disciplined.");
            case 2 -> System.out.println("Consistency beats intensity.");
            case 3 -> System.out.println("Small progress daily.");
        }
    }
}

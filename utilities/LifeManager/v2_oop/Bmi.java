package LifeManager.v2_oop;

public class Bmi {

    public void b (double weight , double height){
        double bmi;

        if (height <= 0 || weight <= 0) {
            System.out.println("Invalid height or weight!");
            return;
        }

        bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.println("You are Underweight.");
        }
        else if (bmi <= 24.9) {
            System.out.println("Your weight is Normal.");
        }
        else if (bmi <= 29.9) {
            System.out.println("You are Overweight.");
        }
        else {
            System.out.println("You are Obese.");
        }
    }
}

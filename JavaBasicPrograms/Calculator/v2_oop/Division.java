package Calculator.v2_oop;

public class Division {

    public double div (double num1 , double num2){

        if(num2 == 0){
            System.out.println("Invalid Division.");
            return 0;
        }

        return  num1/num2;
    }
}

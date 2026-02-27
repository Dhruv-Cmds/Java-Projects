package DiceRoller.v2_oop_file;

import java.util.Random;

public class Die {

       private final Random random = new Random();

       public int roll(){
           return random.nextInt(1 , 7);
        }
}

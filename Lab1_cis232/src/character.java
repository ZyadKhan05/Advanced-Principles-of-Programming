// This class was completed by Zyad Khan for CIS-232-01 Lab #1 on 2/1/23
// The purpose of this class is to create the super class with the speed, strength, and Good/Bad attributes, which are randomly generated with the Random class.

import java.util.Random; // import random class

public class character {
    Random random = new Random();

        public double speed = random.nextDouble(11);

        public double strength = random.nextDouble(11);
        public boolean personality = random.nextBoolean();

}

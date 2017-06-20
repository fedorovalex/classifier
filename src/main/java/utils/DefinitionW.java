package utils;

import java.util.Random;

import static utils.Constants.*;

public class DefinitionW {

    public static double getRandomW() {
        Random random = new Random();

        return MIN_W + (MAX_W - MIN_W) * random.nextDouble();
    }
}

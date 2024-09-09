package hexlet.code;
import java.util.Random;

public class Utils {
    public static final int START_RANDOM = 1;
    public static final int LIMIT_RANDOM = 100;

    public static int generateRandomNumber(int start, int limit) {
        return new Random().nextInt(start, limit);
    }

    public static int generateRandomNumber(int limit) {
        return generateRandomNumber(0,limit);
    }

    public static int generateRandomNumber() {
        return generateRandomNumber(START_RANDOM, LIMIT_RANDOM);
    }

}

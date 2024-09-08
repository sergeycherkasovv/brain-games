package hexlet.code;
import java.util.Random;

public class Utils {
    public static int generateRandomNumber(int start, int limit) {
        return new Random().nextInt(start, limit);
    }
}

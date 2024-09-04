package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;

public class Even {

    public static void run() {
        var questions = new String[3][];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questions[i] = generateRound();
        }
        var rulesGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.run(questions, rulesGame);
    }

    public static String[] generateRound() {
        var number = new Random().nextInt(1, 100);
        var correctAnswer = isEven(number) ? "yes" : "no";
        return new String[]{String.valueOf(number), correctAnswer};
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

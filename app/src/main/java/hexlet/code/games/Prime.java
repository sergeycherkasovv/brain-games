package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final String RULES_GAME = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void run() {
        var questions = new String[Engine.ROUNDS_COUNT][];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questions[i] = generateRound();
        }

        Engine.run(questions, RULES_GAME);
    }

    public static String[] generateRound() {
        var number = Utils.generateRandomNumber();
        var correctAnswer = isPrime(number) ? "yes" : "no";

        return new String[]{String.valueOf(number), correctAnswer};
    }

    public static boolean isPrime(int number) {
        boolean numberPrime = number != 1;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                numberPrime = false;
                break;
            }
        }
        return numberPrime;
    }
}

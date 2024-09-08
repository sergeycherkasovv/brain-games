package hexlet.code.games;

import hexlet.code.Engine; //Импортируем "Движок" Engine
import hexlet.code.Utils;

public class Prime {
    public static final int START_RANDOM = 1;
    public static final int LIMIT_RANDOM = 100;

    public static void run() {
        var questions = new String[Engine.ROUNDS_COUNT][];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questions[i] = generateRound();
        }
        var rulesGame = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.run(questions, rulesGame);
    }

    public static String[] generateRound() {
        var number = Utils.generateRandomNumber(START_RANDOM, LIMIT_RANDOM);
        var correctAnswer = isPrime(number) ? "yes" : "no";

        return new String[]{String.valueOf(number), correctAnswer};
    }

    public static boolean isPrime(int number) {
        boolean numberPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                numberPrime = false;
                break;
            }
        }
        return numberPrime;
    }
}

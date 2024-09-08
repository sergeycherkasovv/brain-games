package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static final int START_RANDOM = 1;
    public static final int LIMIT_RANDOM = 100;
    public static final String RULES_GAME = "Find the greatest common divisor of given numbers.";

    public static void run() {
        var questions = new String[Engine.ROUNDS_COUNT][];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questions[i] = generateRound();
        }

        Engine.run(questions, RULES_GAME);
    }

    public static String[] generateRound() {
        var firstNumber = Utils.generateRandomNumber(START_RANDOM, LIMIT_RANDOM);
        var secondNumber = Utils.generateRandomNumber(START_RANDOM, LIMIT_RANDOM);

        var correctAnswer = findGreatestDivisor(firstNumber, secondNumber);
        var question = firstNumber + " " + secondNumber;

        return new String[]{question, correctAnswer};

    }

    public static String findGreatestDivisor(int firstNumber, int secondNumber) {
        int greatestDivisor = Math.min(firstNumber, secondNumber);

        while (true) {
            if (firstNumber % greatestDivisor == 0 && secondNumber % greatestDivisor == 0) {
                break;
            }
            greatestDivisor--;
        }
        return String.valueOf(greatestDivisor);
    }
}

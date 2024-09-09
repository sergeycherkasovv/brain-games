package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Calc {
    public static final int RANDOM_SYMBOL_LIMIT = 3;
    public static final String RULES_GAME = "What is the result of the expression?";

    public static final String[] SYMBOL = new String[]{"+", "-", "*"};

    public static void run() {
        var questions = new String[Engine.ROUNDS_COUNT][];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questions[i] = generateRound();
        }

        Engine.run(questions, RULES_GAME);
    }

    public static String[] generateRound() {
        var firstNumber = Utils.generateRandomNumber();
        var secondNumber = Utils.generateRandomNumber();
        var randomSymbol = Utils.generateRandomNumber(RANDOM_SYMBOL_LIMIT);

        var calculatedQuestions = questionsCalculated(firstNumber, secondNumber, SYMBOL[randomSymbol]);
        var calculatedAnswer = calculated(firstNumber, secondNumber, SYMBOL[randomSymbol]);

        return new String[]{calculatedQuestions, String.valueOf(calculatedAnswer)};
    }

    public static int calculated(int firstNumber, int secondNumber, String symbol) {
        return switch (symbol) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            default -> throw new RuntimeException("Unknown operator");
        };
    }

    public static String questionsCalculated(int firstNumber, int secondNumber, String symbol) {
        return firstNumber + " " + symbol + " " + secondNumber;
    }
}

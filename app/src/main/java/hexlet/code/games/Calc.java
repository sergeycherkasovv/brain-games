package hexlet.code.games;

import hexlet.code.Engine; //Импортируем "Движок" Engine
import hexlet.code.Utils;


public class Calc {
    public static final int START_RANDOM = 1;
    public static final int LIMIT_RANDOM = 100;
    public static final int OPERATOR_SYMBOL = 3;

    public static final String[] SYMBOL = new String[]{"+", "-", "*"};

    public static void run() {
        var questions = new String[Engine.ROUNDS_COUNT][];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questions[i] = generateRound();
        }
        var rulesGame = "What is the result of the expression?";
        Engine.run(questions, rulesGame);
    }

    public static String[] generateRound() {
        var firstNumber = Utils.generateRandomNumber(START_RANDOM, LIMIT_RANDOM); //Первое число
        var secondNumber = Utils.generateRandomNumber(START_RANDOM, LIMIT_RANDOM); //Второе число
        var operator = Utils.generateRandomNumber(OPERATOR_SYMBOL); //Выполяет число в диапозоне от 0 до 3
                                                    //для того чтобы выбрать один из операторов +, -, *

        var calculatedQuestions = questionsCalculated(firstNumber, secondNumber, SYMBOL[operator]);
        var calculatedAnswer = calculated(firstNumber, secondNumber, SYMBOL[operator]);

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

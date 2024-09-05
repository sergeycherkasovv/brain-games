package hexlet.code.games;

import hexlet.code.Engine; //Импортируем "Движок" Engine
import java.util.Random; //Импортируем Класс Random


public class Calc {
    public static final int NUMBER_START = 1;
    public static final int NUMBER_LIMIT = 100;
    public static final int NUMBER_OPERATOR = 3;

    public static void run() {
        var questions = new String[Engine.ROUNDS_COUNT][];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questions[i] = generateRound();
        }
        var rulesGame = "What is the result of the expression?";
        Engine.run(questions, rulesGame);
    }

    public static String[] generateRound() {
        var firstNumber = new Random().nextInt(NUMBER_START, NUMBER_LIMIT); //Первое число
        var secondNumber = new Random().nextInt(NUMBER_START, NUMBER_LIMIT); //Второе число
        var operator = new Random().nextInt(NUMBER_OPERATOR);//Выполяет число в диапозоне от 0 до 3
                                                    //для того чтобы выбрать один из операторов +, -, *
        char symbol;
        switch (operator) {
            case 0 -> symbol = '+';
            case 1 -> symbol = '-';
            case 2 -> symbol = '*';
            default -> throw new RuntimeException("unknown number");
        }

        var calculatedAnswer = calculated(firstNumber, secondNumber,symbol);
        var calculatedQuestions = calculatedString(firstNumber, secondNumber, symbol);

        return new String[]{calculatedQuestions, calculatedAnswer};
    }

    public static String calculated(int firstNumber, int secondNumber, char symbol) {
        return switch (symbol) {
            case '+' -> String.valueOf(firstNumber + secondNumber);
            case '-' -> String.valueOf(firstNumber - secondNumber);
            case '*' -> String.valueOf(firstNumber * secondNumber);
            default -> throw new RuntimeException("unknown operator");
        };
    }

    public static String calculatedString(int firstNumber, int secondNumber, char symbol) {
        return switch (symbol) {
            case '+' -> firstNumber + " + " + secondNumber;
            case '-' -> firstNumber + " - " + secondNumber;
            case '*' -> firstNumber + " * " + secondNumber;
            default -> throw new RuntimeException("unknown operator");
        };
    }
}

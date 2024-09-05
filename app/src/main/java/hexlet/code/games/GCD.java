package hexlet.code.games;

import hexlet.code.Engine; //Импортируем "Движок" Engine
import java.util.Random; //Импортируем Класс Random

public class GCD {
    public static final int NUMBER_START = 1;
    public static final int NUMBER_LIMIT = 100;

    public static void run() {
        var questions = new String[Engine.ROUNDS_COUNT][];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questions[i] = generateRound();
        }
        var rulesGame = "Find the greatest common divisor of given numbers.";
        Engine.run(questions, rulesGame);
    }

    public static String[] generateRound() {
        var firstNumber = new Random().nextInt(NUMBER_START, NUMBER_LIMIT);
        var secondNumber = new Random().nextInt(NUMBER_START, NUMBER_LIMIT);
        var numberMin = Math.min(firstNumber, secondNumber); //Находим наименьшее число

        var correctAnswer = findGreatestDivisor(firstNumber, secondNumber, numberMin);
        var question = firstNumber + " " + secondNumber;

        return new String[]{question, correctAnswer};

    }

    public static String findGreatestDivisor(int firstNumber, int secondNumber, int numberMin) {
        int greatestDivisor = numberMin;

        while (true) {
            if (firstNumber % greatestDivisor == 0 && secondNumber % greatestDivisor == 0) {
                break;
            }
            greatestDivisor--;
        }
        return String.valueOf(greatestDivisor);
    }
}

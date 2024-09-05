package hexlet.code.games;

import hexlet.code.Engine; //Импортируем "Движок" Engine
import java.util.Random; //Импортируем Класс Random

public class Even {
    public static final int NUMBER_START = 1;
    public static final int NUMBER_LIMIT = 100;


    public static void run() {
        var questions = new String[Engine.ROUNDS_COUNT][];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questions[i] = generateRound();
        }
        var rulesGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.run(questions, rulesGame);
    }

    public static String[] generateRound() {
        var number = new Random().nextInt(NUMBER_START, NUMBER_LIMIT);
        var correctAnswer = isEven(number) ? "yes" : "no";
        return new String[]{String.valueOf(number), correctAnswer};
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

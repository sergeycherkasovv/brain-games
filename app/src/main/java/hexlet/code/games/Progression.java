package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static final int STEP_START = 5;
    public static final int STEP_LIMIT = 11;
    public static final String RULES_GAME = "What number is missing in the progression?";

    public static void run() {
        var questions = new String[Engine.ROUNDS_COUNT][];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questions[i] = generateRound();
        }

        Engine.run(questions, RULES_GAME);
    }
    public static String[] generateRound() {
        var firstValue = Utils.generateRandomNumber();
        var lengthArray = Utils.generateRandomNumber(STEP_START, STEP_LIMIT);
        var step = Utils.generateRandomNumber();
        var hidTheValue = Utils.generateRandomNumber(lengthArray);

        var progression = generateProgression(firstValue, lengthArray, step);
        var answer = progression[hidTheValue];
        progression[hidTheValue] = "..";
        var progressionString = String.join(" ", progression);

        return new String[]{progressionString, answer};
    }

    private static String[] generateProgression(int firstValue, int lengthArray, int step) {
        String[] progressionArray = new String[lengthArray];
        int nextNumber = firstValue;

        //Наполняем массив числами прогрессии
        for (int i = 0; i < lengthArray; i++) {
            progressionArray[i] = String.valueOf(nextNumber);
            nextNumber += step;
        }
        return progressionArray;
    }
}

package hexlet.code.games;

import hexlet.code.Engine; //Импортируем "Движок" Engine
import hexlet.code.Utils;

public class Progression {
    public static final int START_RANDOM = 1;
    public static final int LIMIT_RANDOM = 100;
    public static final int STEP_START = 5;
    public static final int STEP_LIMIT = 11;

    public static void run() {
        var questions = new String[Engine.ROUNDS_COUNT][];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questions[i] = generateRound();
        }
        var rulesGame = "What number is missing in the progression?";
        Engine.run(questions, rulesGame);
    }
    public static String[] generateRound() {
        var firstValue = Utils.generateRandomNumber(START_RANDOM, LIMIT_RANDOM); //Первое число
        var step = Utils.generateRandomNumber(STEP_START, STEP_LIMIT); //Количесво чисел
        var count = Utils.generateRandomNumber(START_RANDOM, LIMIT_RANDOM); //Шаг прогрессии
        var hid = Utils.generateRandomNumber(step); //Индекс значения которое нужно скрыть

        var progression = generateProgression(firstValue, step, count);
        var answer = progression[hid]; //Сохраняем верное значение
        progression[hid] = "..";  //Скрываем это значение для вопроса
        var progressionString = String.join(" ", progression); //Преобразуем массив в строку

        return new String[]{progressionString, answer};
    }

    private static String[] generateProgression(int firstValue, int step, int count) {
        String[] progressionArray = new String[step]; //Создаем массив прогресии
        int nextNumber = firstValue;

        //Наполняем массив числами прогрессии
        for (int i = 0; i < step; i++) {
            progressionArray[i] = String.valueOf(nextNumber);
            nextNumber += count;
        }
        return progressionArray;
    }
}

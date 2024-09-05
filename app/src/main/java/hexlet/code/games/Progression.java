package hexlet.code.games;

import hexlet.code.Engine; //Импортируем "Движок" Engine
import java.util.Random; //Импортируем Класс Random

public class Progression {
    public static final int NUMBER_START = 1;
    public static final int NUMBER_LIMIT = 100;
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
        var firstValue = new Random().nextInt(NUMBER_START, NUMBER_LIMIT); //Первое число
        var step = new Random().nextInt(STEP_START, STEP_LIMIT); //Количесво чисел
        var count = new Random().nextInt(NUMBER_START, NUMBER_LIMIT); //Шаг прогрессии
        var hid = new Random().nextInt(step); //Индекс значения которое нужно скрыть

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

package hexlet.code.games;

import hexlet.code.Engine; //Импортируем "Движок" Engine
import java.util.Random; //Импортируем Класс Random

public class Progression {

    public static void run() {
        var questions = new String[3][];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questions[i] = generateRound();
        }
        var rulesGame = "AWhat number is missing in the progression?";
        Engine.run(questions, rulesGame);
    }
    public static String[] generateRound() {
        var firstValue = new Random().nextInt(1, 100); //Первое число
        var step = new Random().nextInt(5, 11); //Количесво чисел
        var count = new Random().nextInt(1, 100); //Шаг прогрессии
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

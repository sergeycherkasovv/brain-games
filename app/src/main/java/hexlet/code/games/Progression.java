package hexlet.code.games;

import hexlet.code.Engine; //Импортируем "Движок" Engine
import java.util.Random; //Импортируем Класс Random

import java.util.Arrays;

public class Progression {
    public static void progression() {
        var random = new Random();  //Создали объект Random

        System.out.println(Engine.userName()); //Узнать имя игрока
        String name = Engine.userEntersString(); //Игрок вводит имя и для завершения нажимает Enter
        System.out.println(Engine.helloUserName(name)); // Приветсвие игрока

        // Начало игры GCD
        System.out.println("What number is missing in the progression?");

        boolean flag = true;
        for (int i = 0; i < 3; i++) {
            int number1 = random.nextInt(10 - 5 + 1) + 5; //Длина массива от 5 до 10
            int number2 = random.nextInt(number1); //Выбирается любое число в массиве от 0 до длины массива
                                                    //которое нужно скрыть от user
            int number3 = random.nextInt(100); //Любое число от 0 до 100
            int number4 = random.nextInt(1, number3); //Выбирается шаг для Прогрессии

            //Наполняем массив числами
            int[] arrayProgression = new int[number1]; //Массив с длиной number1
            int sumNextNumber = number3;
            for(int j = 0; j < number1; j++) {
                arrayProgression[j] = sumNextNumber;
                sumNextNumber = sumNextNumber + number4;
            }

            var num = arrayProgression[number2]; //Находим число которое нужно скрыть

            //Преобразуем массив в строку и скрываем нужное число
            var arrayFromString = new StringBuilder();
            for(var item : arrayProgression) {
                if(item == num) {
                    arrayFromString.append(".. ");
                    continue;
                }
                arrayFromString.append(item + " ");
            }

            System.out.println(Engine.questionTask(String.valueOf(arrayFromString))); //Задается вопрос
            int userAnswer = Engine.userEntersInt(); //Игрок вводит свой ответ
            System.out.println(Engine.yourAnswer(String.valueOf(userAnswer))); //Выводится ответ игрока

            if (num == userAnswer) {
                System.out.println(Engine.correct()); //Подтверждается правильность ответа
            } else {
                //Выводится если ответ не верный
                System.out.println(Engine.stringwrongAnswer(name, String.valueOf(userAnswer), String.valueOf(num)));
                flag = false; //И переменная flag меняет свое значение на false
                break;
            }

        }
        if (flag) {
            //Если игрок три раза ответил правильно то его хвалят
            System.out.println(Engine.congratulations(name));
        }
    }
}

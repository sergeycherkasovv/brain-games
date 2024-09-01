package hexlet.code.games;

import hexlet.code.Engine; //Импортируем "Движок" Engine
import java.util.Random; //Импортируем Класс Random

public class GCD {
    public static void gcd() {
        var random = new Random();  //Создали объект Random

        Engine.userName(); //Узнать имя игрока
        String name = Engine.userEntersString(); //Игрок вводит имя и для завершения нажимает Enter
        Engine.helloUserName(name); // Приветсвие игрока

        // Начало игры GCD
        System.out.println("Find the greatest common divisor of given numbers.");

        boolean flag = true;
        for (int i = 0; i < 3; i++) {
            int number1 = random.nextInt(100); //Первое число
            int number2 = random.nextInt(100); //Второе число

            int number3 = Math.min(number1, number2); //Находится наименьшее число

            int result = number3; //Наименьший делитиль
            while (true) {
                if(number1 % result == 0 && number2 % result == 0) {
                    break;
                }
                result --;
            }

            var questionString = number1 + " " + number2; //Преобразуем два числа в String для вопроса

            Engine.questionTask(questionString); //Задается вопрос
            int userAnswer = Engine.userEntersInt(); //Игрок вводит свой ответ
            Engine.yourAnswer(String.valueOf(userAnswer)); //Выводится ответ игрока

            if (result == userAnswer) {
                Engine.correct(); //Подтверждается правильность ответа
            } else {
                //Выводится если ответ не верный
                Engine.stringwrongAnswer(name, String.valueOf(userAnswer), String.valueOf(result));
                flag = false; //И переменная flag меняет свое значение на false
                break;
            }

        }
        if (flag) {
            //Если игрок три раза ответил правильно то его хвалят
            Engine.congratulations(name);
        }
    }
}

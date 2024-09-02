package hexlet.code.games;

import hexlet.code.Engine; //Импортируем "Движок" Engine
import java.util.Random; //Импортируем Класс Random

public class Prime {
    public static void prime() {
        var random = new Random();  //Создали объект Random

        System.out.println(Engine.userName()); //Узнать имя игрока
        String name = Engine.userEntersString(); //Игрок вводит имя и для завершения нажимает Enter
        System.out.println(Engine.helloUserName(name)); // Приветсвие игрока

        // Начало игры Prime
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        boolean flag = true;
        for(int i = 0; i < 3; i++) {
            var number = random.nextInt(100); //Любое число от 0 до 100
            String answerYesOrNo = new String("yes"); //

            //Если число равно 2 или 3 то нет смычла
            if (number == 2 || number == 3) {
                answerYesOrNo = "yes";
            } else if (number == 0 || number == 1) {
                answerYesOrNo = "no";
            } else {
                int halfNumber = number / 2;
                for (int j = 2; j < halfNumber; j++) {
                    if (number % j == 0) {
                        answerYesOrNo = "no";
                        break;
                    }
                }
            }
            System.out.println(Engine.questionTask(String.valueOf(String.valueOf(number)))); //Задается вопрос
            var userAnswer = Engine.userEntersString(); //Игрок вводит свой ответ
            System.out.println(Engine.yourAnswer(String.valueOf(userAnswer))); //Выводится ответ игрока

            if (answerYesOrNo.equals(userAnswer)) {
                System.out.println(Engine.correct()); //Подтверждается правильность ответа
            } else {
                //Выводится если ответ не верный
                System.out.println(Engine.stringwrongAnswer(name, userAnswer, answerYesOrNo));
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

package hexlet.code.games;

import hexlet.code.Engine; //Импортируем "Движок" Engine
import java.util.Random; //Импортируем Класс Random

public class Calc {
    public static void calculated () {
        var random = new Random();  //Создали объект Random

        System.out.println(Engine.userName()); //Узнать имя игрока
        String name = Engine.userEntersString(); //Игрок вводит имя и для завершения нажимает Enter
        System.out.println(Engine.helloUserName(name)); // Приветсвие игрока


        // Начало игры Calc
        System.out.println("What is the result of the expression?");

        boolean flag = true;
        for (int i = 0; i < 3; i++) {

            var number1 = random.nextInt(100); //Первое число
            var number2 = random.nextInt(100); //Второе число
            var operatorNum = random.nextInt(3); //Выполает число в диапозоне от 0 до 3
                                                        //для того чтобы выбрать один из операторов +, -, *
            int sumInt = 0; // Сумма рандомных чисел
            String sumString = ""; // Строковый вид примера

            switch (operatorNum) {
                case 0: //operator "+"
                    sumInt = number1 + number2;
                    sumString = number1 + " + " + number2;
                    break;
                case 1: //operator "-"
                    sumInt = number1 - number2;
                    sumString = number1 + " - " + number2;
                    break;
                case 2: //operator "*"
                    sumInt = number1 * number2;
                    sumString = number1 + " * " + number2;
                    break;
            }

            System.out.println(Engine.questionTask(sumString)); //Задается вопрос
            int userAnswer = Engine.userEntersInt(); //Игрок вводит свой ответ
            System.out.println(Engine.yourAnswer(String.valueOf(userAnswer))); //Выводится ответ игрока

            if (sumInt == userAnswer) {
                System.out.println(Engine.correct()); //Подтверждается правильность ответа
            } else {
                //Выводится если ответ не верный
                System.out.println(Engine.stringwrongAnswer(name, String.valueOf(userAnswer), String.valueOf(sumInt)));
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

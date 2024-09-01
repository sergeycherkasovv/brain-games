package hexlet.code.games;

import hexlet.code.Engine; //Импортируем "Движок" Engine
import java.util.Random; //Импортируем Класс Random

public class Even2 {
    public static void even() {
        var random = new Random();  //Создали объект Random

        Engine.userName(); //Узнать имя игрока
        String name = Engine.userEntersString(); //Игрок вводит имя и для завершения нажимает Enter
        Engine.helloUserName(name); // Приветсвие игрока

        // Начало игры Even
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        String yes = "yes";
        String no = "no";

        boolean flag = true;
        for(int i = 0; i < 3; i++) {
            int randomNumber = random.nextInt(100); // вернет случайное число от 0 до 99

            Engine.questionTask(String.valueOf(randomNumber)); //Задается вопрос
            String userAnswer = Engine.userEntersString(); //Игрок вводит свой ответ yes или no
            Engine.yourAnswer(userAnswer); //Выводится ответ игрока

            int evenNumberRandom = randomNumber % 2; //Остаток от деления в отдельной переменной
                                                    //так меньше кода в условиях if and else if

            if (evenNumberRandom == 0 && userAnswer.equals(yes)){
                Engine.correct(); //Подтверждается правильность ответа
            } else if (evenNumberRandom != 0 && userAnswer.equals(no)) {
                //Подтверждается правильность ответа
                Engine.correct();
            } else {
                //Выводится если ответ не верный
                Engine.stringwrongAnswer(name, yes, no);
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

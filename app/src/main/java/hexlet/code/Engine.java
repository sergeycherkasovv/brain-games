package hexlet.code;
import java.util.Scanner; //Подключаем Класс Scanner

public class Engine {

    ////////////////////////////////////////////Выводится после выбора игры
    //Спрашивается имя
    public static String userName() {

        return "May I have your name?"; //Узнать имя игрока
    }

    //Приветсвуется User
    public static String helloUserName(String name) {

        return "Hello, " + name + "!"; // Приветсвие игрока
    }


    /////////////////////////////////////////////User вводит данные
    //User вводит строку
    public static String userEntersString() {
        Scanner scanner = new Scanner(System.in); //Создали объект Scanner
        String userEnter = scanner.nextLine();
        //scanner.close(); //Завершает работу с пользователем
        return userEnter;
    }

    //User вводит число типа int
    public static int userEntersInt() {
        Scanner scanner2 = new Scanner(System.in); //Создали объект Scanner
        int userEnter = scanner2.nextInt();
        //scanner2.close(); //Завершает работу с пользователем
        return userEnter;
    }


    ///////////////////////////////////////////////ОТВЕТЫ
    //Вывод при правильном ответе
    public static String correct() {

        return "Correct!";
    }

    //Выводится при привильных ответах
    public static String congratulations(String name) {

        return "Congratulations, " + name + "!";
    }

    //Выводится если ответ не правильный
    public static String stringwrongAnswer(String name, String expectation, String output) {
        return "'"
                + expectation
                + "' is wrong answer ;(. Correct answer was '"
                + output
                + "'."
                + "\nLet's try again, "
                + name
                + "!";
    }

    //Выводится таска
    public static String questionTask(String tusk) {

        return "Question: " + tusk;
    }

    //Выводится ответ игрока
    public static String yourAnswer(String answer) {

        return "Your answer: " + answer;
    }

}


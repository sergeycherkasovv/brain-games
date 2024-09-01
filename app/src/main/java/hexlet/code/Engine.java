package hexlet.code;
import java.util.Scanner; //Подключаем Класс Scanner

public class Engine {

    ////////////////////////////////////////////Выводится после выбора игры
    //Спрашивается имя
    public static void userName() {
        System.out.println("May I have your name?"); //Узнать имя игрока
    }

    //Приветсвуется User
    public static void helloUserName(String name) {
        System.out.println("Hello, " + name + "!"); // Приветсвие игрока
    }


    /////////////////////////////////////////////User вводит данные
    //User вводит строку
    public static String userEntersString(){
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
    public static void correct() {
        System.out.println("Correct!");
    }

    //Выводится при привильных ответах
    public static void congratulations(String name) {
        System.out.println("Congratulations, " + name + "!");
    }

    //Выводится если ответ не правильный
    public static void stringwrongAnswer(String name, String expectation, String output) {
        System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s.", expectation, output);
        System.out.println("\nLet's try again, " + name + "!");;
    }

    //Выводится таска
    public static void questionTask(String tusk) {
        System.out.println("Question: " + tusk);
    }

    //Выводится ответ игрока
    public static void yourAnswer(String answer) {
        System.out.println("Your answer: " + answer);
    }

}


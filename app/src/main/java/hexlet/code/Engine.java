package hexlet.code;
import java.util.Scanner; //Подключаем Класс Scanner

public class Engine {

    public static final int ROUNDS_COUNT = 3;

    public static void run(String[][] rounds, String rulesGame) {
        Scanner scanner = new Scanner(System.in); //Создали объект Scanner

        System.out.println("May I have your name?"); //Узнать имя игрока
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!"); // Приветсвие игрока

        System.out.println(rulesGame);
        for (String[] round : rounds) {
            System.out.println("Question: " + round[0]);
            String userAnswer = scanner.nextLine();
            System.out.println("Your answer: " + userAnswer);

            if (userAnswer.equals(round[1])) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.", userAnswer, round[1]);
                System.out.println("\nLet's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }

}


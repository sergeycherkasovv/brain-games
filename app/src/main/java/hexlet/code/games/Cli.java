package hexlet.code.games;
import java.util.Scanner; //Подключаем Класс Scanner

public class Cli {
    public static void run() {
        Scanner scanner = new Scanner(System.in); //Создали объект Scanner

        System.out.println("May I have your name?"); //Узнать имя игрока
        String userName = scanner.nextLine(); //Игрок вводит имя и для завершения нажимает Enter
        System.out.println("Hello, " + userName + "!"); // Приветсвие игрока
    }
}
